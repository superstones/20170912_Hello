<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/9/12
  Time: 20:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<font color="red"></font>${requestScope.error}

<font color="red"> <s:fielderror></s:fielderror></font>
<form action="login.action" method="post">
    <table cellspacing="20" align="center">
        <tr>

            <td>用户名：</td>
            <td><input type="text" name="username"></td>
        </tr>
        <tr>

            <td>密 码：</td>
            <td><input type="password" name="password"></td>
        </tr>

        <tr>

            <td>验证码：</td>
            <td><input type="text" name="code">&nbsp;
                <img src="code.action" onclick="this.src='code.action'"></td>
        </tr>

        <tr>

            <td>用户类型</td>
            <td>
                <select name="type"  >
                    <option value="管理员" name="管理员">管理员</option>
                    <option value="普通用户"name="普通用户">普通用户</option>
                </select>

            </td>
        </tr>
        <tr align="center">
            <td colspan="3">
                <button type="submit">登录</button>
                <button type="reset">重置</button>

            </td>

        </tr>
    </table>
</form>

</body>
</html>
