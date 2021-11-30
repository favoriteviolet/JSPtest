<%-- 
    Document   : index
    Created on : 2021-9-14, 15:26:32
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="css/login.css" rel="stylesheet">
        <script lang="javascript">
            function check(form) {
                if (form.name.value == "") {
                    alert("请输入用户名!");
                    form.name.focus();
                    return false;
                }
                if (form.pass.value == "") {
                    alert("请输入密码!");
                    form.pass.focus();
                    return false;
                }
            }
        </script>
    </head>
    <body>
        <div id="main">
            <div id="top"></div>
            <div id="center">
                <form name="form" action="LoginController">
                    <table id="table">
                        <tr><td colspan="2">${msg}</td></tr>
                        <tr>
                            <td>管理员名称:</td>
                            <td><input type="text" name="name"</td>
                        </tr>
                        <tr>
                            <td>管理员密码:</td>
                            <td><input type="password" name="pass"</td>
                        </tr>
                        <tr>
                            <td></td>
                            <td><input type="submit" value="确定" onclick="return check(forml)">&nbsp;&nbsp;
                                <input type="reset" value="重置">&nbsp;&nbsp;
                                <input type="button" value="关闭" onclick="window.close()">
                            </td>
                        </tr>
                    </table>
                </form>
            </div>
            
        </div>
    </body>
</html>
