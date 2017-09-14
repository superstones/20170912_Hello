package Action;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by Administrator on 2017/9/12.
 */



public class LoginAction extends ActionSupport {
    private String username;
    private String password;
    private String code;
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String execute() throws Exception {
        //获取登陆页面提交的数据(struct的参数拦截器已经完成)
        //判断登陆数据是否合法

         String Code2= (String) ActionContext.getContext().getSession().get("code");


        if (username.equals("石磊") && password.equals("123")&&code.equals("code2")) {
            //把用户名放入session
            //书71页 struct2中访问session的方法
            ActionContext.getContext().getSession().put("user", username);
            return SUCCESS;
        } else {
            //错误信息放到request域的方法（struct2访问request的方法）
            ActionContext.getContext().put("error", "用户名或密码或验证码错误");
            return ERROR;
        }
    }
}

















//public class LoginAction {
//
//    private String username;
//    private String password;
//
//    public String getUsername() {
//        return username;
//    }
//
//    public void setUsername(String username) {
//        this.username = username;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//
//    public String execute() throws Exception {
//        if (getUsername().equals("username") && getPassword().equals("password")) {
//            return "success";
//
//        } else
//            return "error";
//    }
//}




