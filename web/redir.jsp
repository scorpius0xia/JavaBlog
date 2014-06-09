<%-- 
    Document   : redir
    Created on : 2014-6-7, 22:24:00
    Author     : coolwind
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    String msg = (String)request.getAttribute("message");
    String dst = (String) request.getAttribute("destination");
    response.setHeader("refresh","5;URL="+dst) ;
    %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/redir.css" rel="stylesheet">
        <title>Redirect</title>
    </head>
    <body>
        <p class=""><%=msg%>,5秒后跳转</p>
    </body>
</html>
