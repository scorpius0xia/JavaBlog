<%-- 
    Document   : index
    Created on : 2014-6-4, 8:53:05
    Author     : coolwind
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.*" %>
<%@page import="com.coolwind.javablog.util.*"%>
<%@page import="java.sql.*" %>
<%
    int loginflag = 0;
    int currentpage = 0;
    String username = null;
    String menutitle;
    String uid;
    DatabaseOperator dop = new DatabaseOperator();
    ResultSet rs;
    Cookie[] cookies = request.getCookies();
    for (Cookie tmp : cookies) {
        if (tmp.getName().equals("username")) {
            username = tmp.getValue();
        } else if (tmp.getName().equals("uid")) {
            uid = tmp.getValue();
        }
    }

    if (username != null) {
        loginflag = 1;
    } else {
        username = "";
    }

    Integer ActionCode = (Integer) request.getAttribute("ActionCode");
    if (ActionCode != null) {
        currentpage = ActionCode.intValue();
    }

    String[] viewpage = new String[3];
    if (currentpage < 3) {
        viewpage[currentpage] = "class=\"active\"";
    }

    int xline = 0;

%>
<!DOCTYPE html>
<html lang="zh-cn">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="description" content="">
        <meta name="author" content="">
        <link href="css/bootstrap.min.css" rel="stylesheet">
        <link href="css/bootstrap-theme.min.css" rel="stylesheet">
        <link href="css/footer-center.css" rel="stylesheet">
        <script type="text/javascript" src="js/jquery-2.1.0.min.js"></script>
        <script type="text/javascript" src="js/bootstrap.min.js"></script>
        <link href="themes/default/css/umeditor.css" type="text/css" rel="stylesheet">
        <script type="text/javascript" charset="utf-8" src="umeditor.config.js"></script>
        <script type="text/javascript" charset="utf-8" src="umeditor.min.js"></script>
        <script type="text/javascript" src="lang/zh-cn/zh-cn.js"></script>
        <script type="text/javascript" src="js/jquery.validate.min.js"></script>
        <script type="text/javascript" src="js/additional-methods.min.js"></script>
        <script type="text/javascript" src="js/jquery.metadata.js"></script>
        <title>Welcome to Java Blog!</title>
    </head>
    <body>
        <div class="navbar navbar-inverse  navbar-fixed-top" role="navigation">
            <div class="container">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="javascript:mainpage.submit()">Java Blog</a>
                </div>
                <div class="navbar-collapse collapse">
                    <ul class="nav navbar-nav">
                        <li <%=viewpage[0]%>><a href="javascript:to_mainpage.submit()">主页</a></li>
                        <li <%=viewpage[1]%>><a href="javascript:to_publicblog.submit()">公开日志</a></li>
                            <%if (loginflag == 1) {%>
                        <li <%=viewpage[2]%>><a href="javascript:to_myblog.submit()">我的日志</a></li>
                            <%}%>
                    </ul>
                    <%if (loginflag == 0) {%>
                    <%@include file="login.jspf" %>
                    <%} else {%>
                    <%@include file="usermenu.jspf" %>
                    <%}%>
                </div>
            </div>
        </div>
        <%if (currentpage == 0) {%>
        <%@include file="main.jspf" %>
        <%} else if (currentpage == 1) {%>
        <%@include file="blog_content.jspf" %>
        <%} else if (currentpage == 2) {%>
        <%@include file="blog_content.jspf" %>
        <%} else if (currentpage == 3) {%>
        <%@include file="register.jspf" %>
        <%} else if (currentpage == 4) {%>
        <%@include file="blog_create.jspf" %>
        <%} else if (currentpage == 5) {%>
        <%@include  file="modify_password.jspf" %>
        <%} else if (currentpage == 6) {%>
        <%@include file="modify_user.jspf" %>
        <%} else if (currentpage == 7) {%>
        <%@include file="blog_viewer.jspf"%>
        <%} else if (currentpage == 8) {%>
        <%@include file="blog_manage.jspf" %>
        <%} else if (currentpage == 9){%>
        <%@include file="blog_edit.jspf" %>
        <%} else if (currentpage == 10){%>
        <%@include file="blog_listview.jspf" %>
        <%}%>

        <%@include file="link.jspf" %>
        <hr>
        <footer >
            <p class="footer-center">&copy;Powered by coolwind</p>
        </footer>
    </body>
</html>