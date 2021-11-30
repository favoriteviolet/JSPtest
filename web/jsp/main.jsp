<%-- 
    Document   : main
    Created on : 2021-9-24, 15:33:35
    Author     : User
--%>

<%@page import="java.util.List"%>
<%@page import="cn.dto.ReaderBorrowSort"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script src="../js/jquery.min.js" type="text/javascript"></script>
        <link href="../css/main.css" type="text/css" rel="stylesheet"/>
        <script src="../js/main.js" type="text/javascript"></script>
    </head>
    <body>
        <div id="main">
            <%@include file="../WEB-INF/jspf/banner.jspf" %>
            <%@include file="../WEB-INF/jspf/nav.jspf" %>
            <div id="content">
                <span style="color:#FF6600;float:right;font-size: 12px;">当前位置：首页>>></span>
                <img src="../Images/main_booksort.gif">
                <table style="font-size: 12px">
                    <tr>                        
                        <td style="width:2%">排名</td>
                        <td style="width:3%">图书条形码</td>
                        <td style="width:6%">图书名称</td>
                        <td style="width:4%">图书类型</td>
                        <td style="width:2%">书架</td>
                        <td style="width:7%">出版社</td>
                        <td style="width:2%">作者</td>
                        <td style="width:2%">定价</td>
                        <td style="width:3%">借阅次数</td>
                    </tr>
                    <%
                        List<ReaderBorrowSort> borrowSorts = (List<ReaderBorrowSort>) request.getAttribute("rbs");
                        int i = 1;
                        for (ReaderBorrowSort rbs : borrowSorts) {
                            rbs.getBarcode();

                    %>
                    <tr height="25">  
                        <td><%=i++%></td>
                        <td><%=rbs.getBarcode()%></td>
                        <td><%=rbs.getBookname()%></td>
                        <td><%=rbs.getTypename()%></td>
                        <td><%=rbs.getName()%></td>
                        <td><%=rbs.getPubname()%></td>
                        <td><%=rbs.getAuthor()%></td>
                        <td><%=rbs.getPrice()%></td>
                        <td><%=rbs.getBorrownunber()%></td>
                    </tr>
                    <%
                        }
                    %>
                </table>
                <img src="../Images/more.GIF" style="float: right">
            </div>

            <%@include file="../WEB-INF/jspf/bottom.jspf" %>
        </div>
    </body>
</html>
