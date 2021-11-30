<%-- 
    Document   : parm
    Created on : 2021-11-9, 14:52:40
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>parm Page</title>
        <script src="../js/jquery.min.js" type="text/javascript"></script>
        <link href="../css/main.css" type="text/css" rel="stylesheet"/>
        <script src="../js/main.js" type="text/javascript"></script>
    </head>
    <body>
        <div id="main">
            <%@include file="../WEB-INF/jspf/banner.jspf" %>
            <%@include file="../WEB-INF/jspf/nav.jspf" %>
            <div id="content">
                <span style="color:#FF6600;float:left;font-size: 12px;">当前位置：系统设置>参数设置>>></span><br>
                <table style="font-size: 12px;margin:auto " >

                    <tr style="height: 30px">
                        <td>办证费：</td>&nbsp;&nbsp;
                        <td><input type="text" name="gz" value="45">（元）</td>
                    </tr>
                    <tr style="height: 30px">
                        <td>有效期限：</td>&nbsp;&nbsp;
                        <td><input type="text" name="dh" value="3">（月）</td>
                    </tr>
                    <tr>
                        <td></td>
                        <td><input type="submit" value="保存" >&nbsp;&nbsp;&nbsp;&nbsp;
                            <input type="button" value="取消">
                        </td>
                    </tr>
                </table>
            </div>
            <%@include file="../WEB-INF/jspf/bottom.jspf" %>
    </body>
</html>
