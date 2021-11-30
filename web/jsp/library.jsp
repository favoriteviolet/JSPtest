<%-- 
    Document   : library
    Created on : 2021-11-5, 14:55:59
    Author     : User
--%>

<%@page import="cn.dto.LibraryDto"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>library Page</title>
        <script src="../js/jquery.min.js" type="text/javascript"></script>
        <link href="../css/main.css" type="text/css" rel="stylesheet"/>
        <script src="../js/main.js" type="text/javascript"></script>
    </head>
    <body>
        <div id="main">
            <%@include file="../WEB-INF/jspf/banner.jspf" %>
            <%@include file="../WEB-INF/jspf/nav.jspf" %>
            <div id="content">
                <span style="color:#FF6600;float:left;font-size: 12px;">当前位置：系统设置>图书馆信息>>></span><br>
                <table style="font-size: 12px;margin:auto " >
                    <%
                        List<LibraryDto> dto = (List<LibraryDto>) request.getAttribute("lib");
                        int i = 1;
                        for (LibraryDto lib : dto) {                          
                    %>
                    <tr style="height: 30px">
                        <td>图书馆名称：</td>&nbsp;&nbsp;
                        <td><input type="text" name="mc" value="<%=lib.getLibraryname()%>" ></td>
                    </tr>
                    <tr style="height: 30px">
                        <td>馆长：</td>&nbsp;&nbsp;
                        <td><input type="text" name="gz" value="<%=lib.getCurator()%>"></td>
                    </tr>
                    <tr style="height: 30px">
                        <td>联系电话：</td>&nbsp;&nbsp;
                        <td><input type="text" name="dh" value="<%=lib.getTel()%>"></td>
                    </tr>
                    <tr style="height: 30px">
                        <td>联系地址：</td>&nbsp;&nbsp;
                        <td><input type="text" name="dz" value="<%=lib.getAddress()%>"></td>
                    </tr>
                    <tr style="height: 30px">
                        <td>联系邮箱：</td>&nbsp;&nbsp;
                        <td><input type="email" name="email" value="<%=lib.getEmail()%>"></td>
                    </tr>
                    <tr style="height: 30px">
                        <td>图书馆网址：</td>&nbsp;&nbsp;
                        <td><input type="text" name="wz" value="<%=lib.getUrl()%>"></td>
                    </tr>
                    <tr style="height: 30px">
                        <td>建馆时间：</td>&nbsp;&nbsp;
                        <td><input type="text" name="sj" value="<%=lib.getCreateDate()%>">(日期格式：2007-11-22)</td>
                    </tr>
                    <tr style="height: 40px">
                        <td>图书馆简介：</td>&nbsp;&nbsp;
                        <td><textarea id="brief" name="brief" value="<%=lib.getIntroduce()%>"></textarea></td>
                    </tr>
                    <td></td>
                    <td><input type="submit" value="保存" >&nbsp;&nbsp;&nbsp;&nbsp;
                        <input type="button" value="取消">
                    </td> 
                    <% } %>
                </table>
            </div>
            <%@include file="../WEB-INF/jspf/bottom.jspf" %>
        </div>
    </body>
</html>
