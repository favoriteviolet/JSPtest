<%-- 
    Document   : manager
    Created on : 2021-11-9, 15:15:49
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>manager Page</title>
        <script src="../js/jquery.min.js" type="text/javascript"></script>
        <link href="../css/main.css" type="text/css" rel="stylesheet"/>
        <script src="../js/main.js" type="text/javascript"></script>
    </head>
    <body>
        <div id="main">
            <%@include file="../WEB-INF/jspf/banner.jspf" %>
            <%@include file="../WEB-INF/jspf/nav.jspf" %>
            <div id="content">
                <span style="color:#FF6600;float:left;font-size: 12px;">当前位置：系统设置>管理员设置>>></span><br>
                <table style="font-size: 12px;text-align: center;margin-left: 40px;margin-right: 40px" >
                    <tr>
                        <td colspan="8"><a style="float: right" href="#" onclick="window.open('manageradd.jsp', '', 'width=292,height=175')">添加管理员信息</a></td>
                    </tr>
                    <tr>
                        <td style="width:5%;background-color: #F9D16B">管理员名称</td>
                        <td style="width:3%;background-color: #F9D16B">系统设置</td>
                        <td style="width:3%;background-color: #F9D16B">读者管理</td>
                        <td style="width:3%;background-color: #F9D16B">图书管理</td>
                        <td style="width:3%;background-color: #F9D16B">图书借还</td>
                        <td style="width:3%;background-color: #F9D16B">系统查询</td>
                        <td style="width:3%;background-color: #F9D16B">权限设置</td>
                        <td style="width:2%;background-color: #F9D16B">删除</td>
                    </tr>
                    <tr>
                        <td style="padding: 5px;">tsoft</td>
                        <td align="center">
                            <input name="checkbox" type="checkbox" class="noborder"
                                   value="checkbox" disabled="disabled" checked>
                        </td>
                        <td align="center">
                            <input name="checkbox" type="checkbox" class="noborder"
                                   value="checkbox" disabled="disabled" checked>
                        </td>
                        <td align="center">
                            <input name="checkbox" type="checkbox" class="noborder"
                                   value="checkbox" disabled="disabled" checked>
                        </td>
                        <td align="center">
                            <input name="checkbox" type="checkbox" class="noborder"
                                   value="checkbox" disabled="disabled" checked>
                        </td>
                        <td align="center">
                            <input name="checkbox" type="checkbox" class="noborder"
                                   value="checkbox" disabled="disabled" checked>
                        </td>
                        <td align="center">
                            <a href="#" onclick="window.open">权限设置</a>
                        </td>
                        <td align="center">
                            <a href="#" onclick="window.open">删除</a>
                        </td>
                    </tr>
                    <tr>
                        <td style="padding: 5px;">java1234</td>
                        <td align="center">
                            <input name="checkbox" type="checkbox" class="noborder"
                                   value="checkbox" disabled="disabled" checked>
                        </td>
                        <td align="center">
                            <input name="checkbox" type="checkbox" class="noborder"
                                   value="checkbox" disabled="disabled" checked>
                        </td>
                        <td align="center">
                            <input name="checkbox" type="checkbox" class="noborder"
                                   value="checkbox" disabled="disabled" checked>
                        </td>
                        <td align="center">
                            <input name="checkbox" type="checkbox" class="noborder"
                                   value="checkbox" disabled="disabled" checked>
                        </td>
                        <td align="center">
                            <input name="checkbox" type="checkbox" class="noborder"
                                   value="checkbox" disabled="disabled" checked>
                        </td>
                        <td align="center"></td>
                        <td align="center"></td>
                    </tr>
                </table>
            </div>
            <%@include file="../WEB-INF/jspf/bottom.jspf" %>
        </div>
    </body>
</html>
