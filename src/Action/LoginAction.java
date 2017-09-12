package Action;

/**
 * Created by Administrator on 2017/9/12.
 */
public class LoginAction {

    private String username;
    private String password;

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
        if (getUsername().equals("username") && getPassword().equals("password")) {
            return "success";

        } else
            return "error";
    }
}

