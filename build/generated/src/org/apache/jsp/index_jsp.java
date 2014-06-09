package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import com.coolwind.javablog.util.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(15);
    _jspx_dependants.add("/login.jspf");
    _jspx_dependants.add("/usermenu.jspf");
    _jspx_dependants.add("/main.jspf");
    _jspx_dependants.add("/first_listview.jspf");
    _jspx_dependants.add("/blog_menu.jspf");
    _jspx_dependants.add("/blog_content.jspf");
    _jspx_dependants.add("/blog_listview.jspf");
    _jspx_dependants.add("/pageinditor.jspf");
    _jspx_dependants.add("/register.jspf");
    _jspx_dependants.add("/blog_create.jspf");
    _jspx_dependants.add("/modify_password.jspf");
    _jspx_dependants.add("/modify_user.jspf");
    _jspx_dependants.add("/blog_viewer.jspf");
    _jspx_dependants.add("/blog_manage.jspf");
    _jspx_dependants.add("/link.jspf");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

    int loginflag = 0;
    int currentpage = 0;
    String username = null;
    String menutitle;
    DatabaseOperator dop = new DatabaseOperator();
    //dop.openConnection();

    Cookie[] cookies = request.getCookies();
    for (Cookie tmp : cookies) {
        if (tmp.getName().equals("username")) {
            username = tmp.getValue();
            break;
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


      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"zh-cn\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <meta name=\"description\" content=\"\">\n");
      out.write("        <meta name=\"author\" content=\"\">\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/bootstrap-theme.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/footer-center.css\" rel=\"stylesheet\">\n");
      out.write("        <script type=\"text/javascript\" src=\"js/jquery-2.1.0.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/bootstrap.min.js\"></script>\n");
      out.write("        <link href=\"themes/default/css/umeditor.css\" type=\"text/css\" rel=\"stylesheet\">\n");
      out.write("        <script type=\"text/javascript\" charset=\"utf-8\" src=\"js/umeditor.config.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" charset=\"utf-8\" src=\"js/umeditor.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"lang/zh-cn/zh-cn.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/jquery.validate.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/additional-methods.min.js\"></script>\n");
      out.write("        <title>Welcome to Java Blog!</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"navbar navbar-inverse  navbar-fixed-top\" role=\"navigation\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"navbar-header\">\n");
      out.write("                    <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".navbar-collapse\">\n");
      out.write("                        <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                    </button>\n");
      out.write("                    <a class=\"navbar-brand\" href=\"javascript:mainpage.submit()\">Java Blog</a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"navbar-collapse collapse\">\n");
      out.write("                    <ul class=\"nav navbar-nav\">\n");
      out.write("                        <li ");
      out.print(viewpage[0]);
      out.write("><a href=\"javascript:to_mainpage.submit()\">主页</a></li>\n");
      out.write("                        <li ");
      out.print(viewpage[1]);
      out.write("><a href=\"javascript:to_publicblog.submit()\">公开日志</a></li>\n");
      out.write("                            ");
if (loginflag == 1) {
      out.write("\n");
      out.write("                        <li ");
      out.print(viewpage[2]);
      out.write("><a href=\"javascript:to_myblog.submit()\">我的日志</a></li>\n");
      out.write("                            ");
}
      out.write("\n");
      out.write("                    </ul>\n");
      out.write("                    ");
if (loginflag == 0) {
      out.write("\n");
      out.write("                    ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<form class=\"navbar-form navbar-right\" method=\"post\" role=\"form\" action=\"Index\">\n");
      out.write("    <div class=\"form-group\">\n");
      out.write("        <input name=\"username\" type=\"text\" class=\"form-control\" placeholder=\"用户名\" required>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"form-group\">\n");
      out.write("        <input name=\"password\" type=\"password\" class=\"form-control\" placeholder=\"密码\" required>\n");
      out.write("    </div>\n");
      out.write("    <input type=\"hidden\" name=\"action\" value=\"login\">\n");
      out.write("    <button type=\"submit\" class=\"btn btn-success\">登录</button>\n");
      out.write("    <a class=\"btn btn-success\" href=\"javascript:to_register.submit()\">注册</a>\n");
      out.write("</form>\n");
      out.write("\n");
      out.write("                    ");
} else {
      out.write("\n");
      out.write("                    ");
      out.write("\n");
      out.write("\n");
      out.write("<ul class=\"nav navbar-nav navbar-right btn-group\">\n");
      out.write("    <li class=\"dropdown\">\n");
      out.write("        <a href=\"#\" class=\"dropdown-toggle btn user\" data-toggle=\"dropdown\">");
      out.print(username);
      out.write("<b class=\"caret\"></b></a>\n");
      out.write("        <ul class=\"dropdown-menu\">\n");
      out.write("            <li><a href=\"javascript:to_blog_create.submit()\">写日志</a></li>\n");
      out.write("            <li><a href=\"javascript:to_manage_blog.submit()\">管理日志</a></li>\n");
      out.write("            <li class=\"divider\"></li>\n");
      out.write("            <li><a href=\"javascript:to_modify_user.submit()\">个人资料</a></li>\n");
      out.write("            <li><a href=\"javascript:to_modify_password.submit()\">修改密码</a></li>\n");
      out.write("        </ul>\n");
      out.write("    </li>\n");
      out.write("    <li><a href=\"javascript:to_quit.submit()\" class=\"btn\">退出</a></li>\n");
      out.write("</ul>");
      out.write("\n");
      out.write("                    ");
}
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        ");
if (currentpage == 0) {
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"container\">\n");
      out.write("\n");
      out.write("    <div class=\"row row-offcanvas row-offcanvas-right\">\n");
      out.write("\n");
      out.write("        <div class=\"col-xs-12 col-sm-9\">\n");
      out.write("            <p class=\"pull-right visible-xs\">\n");
      out.write("                <button type=\"button\" class=\"btn btn-primary btn-xs\" data-toggle=\"offcanvas\">Toggle nav</button>\n");
      out.write("            </p>\n");
      out.write("            <div class=\"jumbotron\">\n");
      out.write("                <p class=\"jumbotron-title\">欢迎来到coolwind的Java Blog</p>\n");
      out.write("                <p>想做点什么把自己找回来，然而还是不停对着电脑屏幕发呆，抬头朝窗外看云彩变幻，问自己是否还有爱，每天不停的做着无限循环，然而幸福还在遥不可及的另一端，不要放弃希望，只要有梦想，爱永远存在！</p>\n");
      out.write("            </div>\n");
      out.write("            <li class=\"list-group-item list-title\">人气博主</li>\n");
      out.write("            ");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"row list-border list-content\">\n");
      out.write("    ");
for (int i = 0; i < 9; i ++){
      out.write("\n");
      out.write("    <div class=\"col-6 col-sm-6 col-lg-4\">\n");
      out.write("        <h2>coowind</h2>\n");
      out.write("        <li>复仇者之死</li>\n");
      out.write("        <li>寒风剑海的忧郁</li>\n");
      out.write("        <li>寒风剑海的消失</li>\n");
      out.write("        <li>寒风剑海的困惑</ii>\n");
      out.write("        <p><a class=\"btn btn-default\" href=\"#\" role=\"button\">查看更多 &raquo;</a></p>\n");
      out.write("    </div><!--/span-->\n");
      out.write("    ");
}
      out.write("\n");
      out.write("</div><!--/row-->\n");
      out.write("\n");
      out.write("        </div><!--/span-->\n");
      out.write("        \n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");

    if (currentpage == 0) {
        menutitle = "热门博文";
    } else {
        menutitle = "热门标签";
    }

      out.write("\n");
      out.write("<div class=\"col-xs-6 col-sm-3 sidebar-offcanvas\" id=\"sidebar\" role=\"navigation\">\n");
      out.write("    <div class=\"list-group\">\n");
      out.write("        <li class=\"list-group-item active\">");
      out.print(menutitle);
      out.write("</li>\n");
      out.write("        <a href=\"javascript:to_top1.submit()\" class=\"list-group-item\">Link</a>\n");
      out.write("        <a href=\"#\" class=\"list-group-item\">Link</a>\n");
      out.write("        <a href=\"#\" class=\"list-group-item\">Link</a>\n");
      out.write("        <a href=\"#\" class=\"list-group-item\">Link</a>\n");
      out.write("        <a href=\"#\" class=\"list-group-item\">Link</a>\n");
      out.write("        <a href=\"#\" class=\"list-group-item\">Link</a>\n");
      out.write("        <a href=\"#\" class=\"list-group-item\">Link</a>\n");
      out.write("        <a href=\"#\" class=\"list-group-item\">Link</a>\n");
      out.write("        <a href=\"#\" class=\"list-group-item\">Link</a>\n");
      out.write("        <a href=\"#\" class=\"list-group-item\">Link</a>\n");
      out.write("    </div>\n");
      out.write("</div><!--/span-->\n");
      out.write("\n");
      out.write("    </div><!--/row-->\n");
      out.write("</div>");
      out.write("\n");
      out.write("        ");
} else if (currentpage == 1) {
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("<div class=\"container\">\n");
      out.write("\n");
      out.write("    <div class=\"row row-offcanvas row-offcanvas-right\">\n");
      out.write("\n");
      out.write("        <div class=\"col-xs-12 col-sm-9\">\n");
      out.write("            ");
      out.write('\n');
      out.write('\n');

    if(currentpage == 3){
        
    }

      out.write("\n");
      out.write("<div class=\"Row\">\n");
      out.write("    ");
for (int i = 0; i < 10; i++) {
      out.write("\n");
      out.write("    <div class=\"col-12 col-xs-12 col-md-12 col-lg-12\">\n");
      out.write("        <h2>流光深处，悲喜释然</h2>\n");
      out.write("        <div>日期：2014-06-03 点击：147 作者：箫篱墨染</div>\n");
      out.write("        <p>斑驳岁月，有谁在细刻繁华 似水流年总不经意间跑到前方，而你、我都被抛在流年季末，一直在后逐年。 旧时光里的旧日容颜已模糊不清，不经意间早已忘却。阳光通过窗撒落在曾被年华细描过的课桌上，尘埃在易能灼伤青春眼眸的光束中飞扬，伸出手去捉却捉了个空... </p>\n");
      out.write("        <p><a class=\"btn btn-default\" href=\"#\" role=\"button\">查看详情 &raquo;</a></p>\n");
      out.write("    </div>\n");
      out.write("    ");
}
      out.write("\n");
      out.write("    <div class=\"col-12 col-xs-12 col-md-12 col-lg-12\">\n");
      out.write("        <h2>流光深处，悲喜释然</h2>\n");
      out.write("        <div>日期：2014-06-03 点击：147 作者：箫篱墨染</div>\n");
      out.write("        <p>斑驳岁月，有谁在细刻繁华 似水流年总不经意间跑到前方，而你、我都被抛在流年季末，一直在后逐年。 旧时光里的旧日容颜已模糊不清，不经意间早已忘却。阳光通过窗撒落在曾被年华细描过的课桌上，尘埃在易能灼伤青春眼眸的光束中飞扬，伸出手去捉却捉了个空... </p>\n");
      out.write("        <p><a class=\"btn btn-default\" href=\"#\" role=\"button\">查看详情 &raquo;</a></p>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"col-12 col-xs-12 col-md-12 col-lg-12\">\n");
      out.write("        <h2>流光深处，悲喜释然</h2>\n");
      out.write("        <div>日期：2014-06-03 点击：147 作者：箫篱墨染</div>\n");
      out.write("        <p>斑驳岁月，有谁在细刻繁华 似水流年总不经意间跑到前方，而你、我都被抛在流年季末，一直在后逐年。 旧时光里的旧日容颜已模糊不清，不经意间早已忘却。阳光通过窗撒落在曾被年华细描过的课桌上，尘埃在易能灼伤青春眼眸的光束中飞扬，伸出手去捉却捉了个空... </p>\n");
      out.write("        <p><a class=\"btn btn-default\" href=\"#\" role=\"button\">查看详情 &raquo;</a></p>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"col-12 col-xs-12 col-md-12 col-lg-12\">\n");
      out.write("        <h2>流光深处，悲喜释然</h2>\n");
      out.write("        <div>日期：2014-06-03 点击：147 作者：箫篱墨染</div>\n");
      out.write("        <p>斑驳岁月，有谁在细刻繁华 似水流年总不经意间跑到前方，而你、我都被抛在流年季末，一直在后逐年。 旧时光里的旧日容颜已模糊不清，不经意间早已忘却。阳光通过窗撒落在曾被年华细描过的课桌上，尘埃在易能灼伤青春眼眸的光束中飞扬，伸出手去捉却捉了个空... </p>\n");
      out.write("        <p><a class=\"btn btn-default\" href=\"#\" role=\"button\">查看详情 &raquo;</a></p>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"col-12 col-xs-12 col-md-12 col-lg-12\">\n");
      out.write("        <h2>流光深处，悲喜释然</h2>\n");
      out.write("        <div>日期：2014-06-03 点击：147 作者：箫篱墨染</div>\n");
      out.write("        <p>斑驳岁月，有谁在细刻繁华 似水流年总不经意间跑到前方，而你、我都被抛在流年季末，一直在后逐年。 旧时光里的旧日容颜已模糊不清，不经意间早已忘却。阳光通过窗撒落在曾被年华细描过的课桌上，尘埃在易能灼伤青春眼眸的光束中飞扬，伸出手去捉却捉了个空... </p>\n");
      out.write("        <p><a class=\"btn btn-default\" href=\"#\" role=\"button\">查看详情 &raquo;</a></p>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"col-12 col-xs-12 col-md-12 col-lg-12\">\n");
      out.write("        <h2>流光深处，悲喜释然</h2>\n");
      out.write("        <div>日期：2014-06-03 点击：147 作者：箫篱墨染</div>\n");
      out.write("        <p>斑驳岁月，有谁在细刻繁华 似水流年总不经意间跑到前方，而你、我都被抛在流年季末，一直在后逐年。 旧时光里的旧日容颜已模糊不清，不经意间早已忘却。阳光通过窗撒落在曾被年华细描过的课桌上，尘埃在易能灼伤青春眼眸的光束中飞扬，伸出手去捉却捉了个空... </p>\n");
      out.write("        <p><a class=\"btn btn-default\" href=\"#\" role=\"button\">查看详情 &raquo;</a></p>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"col-12 col-xs-12 col-md-12 col-lg-12\">\n");
      out.write("        <h2>流光深处，悲喜释然</h2>\n");
      out.write("        <div>日期：2014-06-03 点击：147 作者：箫篱墨染</div>\n");
      out.write("        <p>斑驳岁月，有谁在细刻繁华 似水流年总不经意间跑到前方，而你、我都被抛在流年季末，一直在后逐年。 旧时光里的旧日容颜已模糊不清，不经意间早已忘却。阳光通过窗撒落在曾被年华细描过的课桌上，尘埃在易能灼伤青春眼眸的光束中飞扬，伸出手去捉却捉了个空... </p>\n");
      out.write("        <p><a class=\"btn btn-default\" href=\"#\" role=\"button\">查看详情 &raquo;</a></p>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"col-12 col-xs-12 col-md-12 col-lg-12\">\n");
      out.write("        <div class=\"col-6 col-xs-6 col-xs-offset-3 col-md-6 col-md-3 col-lg-6 col-lg-offset-6\">\n");
      out.write("            ");
      out.write("\n");
      out.write("\n");
      out.write("<ul class=\"pagination\">\n");
      out.write("    <li><a href=\"#\">Prev</a></li>\n");
      out.write("    <li class=\"active\"><a href=\"#\">1</a></li>\n");
      out.write("    <li><a href=\"#\">2</a></li>\n");
      out.write("    <li><a href=\"#\">3</a></li>\n");
      out.write("    <li><a href=\"#\">4</a></li>\n");
      out.write("    <li><a href=\"#\">Next</a></li>\n");
      out.write("</ul>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>");
      out.write("\n");
      out.write("        </div><!--/span-->\n");
      out.write("        \n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");

    if (currentpage == 0) {
        menutitle = "热门博文";
    } else {
        menutitle = "热门标签";
    }

      out.write("\n");
      out.write("<div class=\"col-xs-6 col-sm-3 sidebar-offcanvas\" id=\"sidebar\" role=\"navigation\">\n");
      out.write("    <div class=\"list-group\">\n");
      out.write("        <li class=\"list-group-item active\">");
      out.print(menutitle);
      out.write("</li>\n");
      out.write("        <a href=\"javascript:to_top1.submit()\" class=\"list-group-item\">Link</a>\n");
      out.write("        <a href=\"#\" class=\"list-group-item\">Link</a>\n");
      out.write("        <a href=\"#\" class=\"list-group-item\">Link</a>\n");
      out.write("        <a href=\"#\" class=\"list-group-item\">Link</a>\n");
      out.write("        <a href=\"#\" class=\"list-group-item\">Link</a>\n");
      out.write("        <a href=\"#\" class=\"list-group-item\">Link</a>\n");
      out.write("        <a href=\"#\" class=\"list-group-item\">Link</a>\n");
      out.write("        <a href=\"#\" class=\"list-group-item\">Link</a>\n");
      out.write("        <a href=\"#\" class=\"list-group-item\">Link</a>\n");
      out.write("        <a href=\"#\" class=\"list-group-item\">Link</a>\n");
      out.write("    </div>\n");
      out.write("</div><!--/span-->\n");
      out.write("\n");
      out.write("    </div><!--/row-->\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("        ");
} else if (currentpage == 2) {
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("<div class=\"container\">\n");
      out.write("\n");
      out.write("    <div class=\"row row-offcanvas row-offcanvas-right\">\n");
      out.write("\n");
      out.write("        <div class=\"col-xs-12 col-sm-9\">\n");
      out.write("            ");
      out.write('\n');
      out.write('\n');

    if(currentpage == 3){
        
    }

      out.write("\n");
      out.write("<div class=\"Row\">\n");
      out.write("    ");
for (int i = 0; i < 10; i++) {
      out.write("\n");
      out.write("    <div class=\"col-12 col-xs-12 col-md-12 col-lg-12\">\n");
      out.write("        <h2>流光深处，悲喜释然</h2>\n");
      out.write("        <div>日期：2014-06-03 点击：147 作者：箫篱墨染</div>\n");
      out.write("        <p>斑驳岁月，有谁在细刻繁华 似水流年总不经意间跑到前方，而你、我都被抛在流年季末，一直在后逐年。 旧时光里的旧日容颜已模糊不清，不经意间早已忘却。阳光通过窗撒落在曾被年华细描过的课桌上，尘埃在易能灼伤青春眼眸的光束中飞扬，伸出手去捉却捉了个空... </p>\n");
      out.write("        <p><a class=\"btn btn-default\" href=\"#\" role=\"button\">查看详情 &raquo;</a></p>\n");
      out.write("    </div>\n");
      out.write("    ");
}
      out.write("\n");
      out.write("    <div class=\"col-12 col-xs-12 col-md-12 col-lg-12\">\n");
      out.write("        <h2>流光深处，悲喜释然</h2>\n");
      out.write("        <div>日期：2014-06-03 点击：147 作者：箫篱墨染</div>\n");
      out.write("        <p>斑驳岁月，有谁在细刻繁华 似水流年总不经意间跑到前方，而你、我都被抛在流年季末，一直在后逐年。 旧时光里的旧日容颜已模糊不清，不经意间早已忘却。阳光通过窗撒落在曾被年华细描过的课桌上，尘埃在易能灼伤青春眼眸的光束中飞扬，伸出手去捉却捉了个空... </p>\n");
      out.write("        <p><a class=\"btn btn-default\" href=\"#\" role=\"button\">查看详情 &raquo;</a></p>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"col-12 col-xs-12 col-md-12 col-lg-12\">\n");
      out.write("        <h2>流光深处，悲喜释然</h2>\n");
      out.write("        <div>日期：2014-06-03 点击：147 作者：箫篱墨染</div>\n");
      out.write("        <p>斑驳岁月，有谁在细刻繁华 似水流年总不经意间跑到前方，而你、我都被抛在流年季末，一直在后逐年。 旧时光里的旧日容颜已模糊不清，不经意间早已忘却。阳光通过窗撒落在曾被年华细描过的课桌上，尘埃在易能灼伤青春眼眸的光束中飞扬，伸出手去捉却捉了个空... </p>\n");
      out.write("        <p><a class=\"btn btn-default\" href=\"#\" role=\"button\">查看详情 &raquo;</a></p>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"col-12 col-xs-12 col-md-12 col-lg-12\">\n");
      out.write("        <h2>流光深处，悲喜释然</h2>\n");
      out.write("        <div>日期：2014-06-03 点击：147 作者：箫篱墨染</div>\n");
      out.write("        <p>斑驳岁月，有谁在细刻繁华 似水流年总不经意间跑到前方，而你、我都被抛在流年季末，一直在后逐年。 旧时光里的旧日容颜已模糊不清，不经意间早已忘却。阳光通过窗撒落在曾被年华细描过的课桌上，尘埃在易能灼伤青春眼眸的光束中飞扬，伸出手去捉却捉了个空... </p>\n");
      out.write("        <p><a class=\"btn btn-default\" href=\"#\" role=\"button\">查看详情 &raquo;</a></p>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"col-12 col-xs-12 col-md-12 col-lg-12\">\n");
      out.write("        <h2>流光深处，悲喜释然</h2>\n");
      out.write("        <div>日期：2014-06-03 点击：147 作者：箫篱墨染</div>\n");
      out.write("        <p>斑驳岁月，有谁在细刻繁华 似水流年总不经意间跑到前方，而你、我都被抛在流年季末，一直在后逐年。 旧时光里的旧日容颜已模糊不清，不经意间早已忘却。阳光通过窗撒落在曾被年华细描过的课桌上，尘埃在易能灼伤青春眼眸的光束中飞扬，伸出手去捉却捉了个空... </p>\n");
      out.write("        <p><a class=\"btn btn-default\" href=\"#\" role=\"button\">查看详情 &raquo;</a></p>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"col-12 col-xs-12 col-md-12 col-lg-12\">\n");
      out.write("        <h2>流光深处，悲喜释然</h2>\n");
      out.write("        <div>日期：2014-06-03 点击：147 作者：箫篱墨染</div>\n");
      out.write("        <p>斑驳岁月，有谁在细刻繁华 似水流年总不经意间跑到前方，而你、我都被抛在流年季末，一直在后逐年。 旧时光里的旧日容颜已模糊不清，不经意间早已忘却。阳光通过窗撒落在曾被年华细描过的课桌上，尘埃在易能灼伤青春眼眸的光束中飞扬，伸出手去捉却捉了个空... </p>\n");
      out.write("        <p><a class=\"btn btn-default\" href=\"#\" role=\"button\">查看详情 &raquo;</a></p>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"col-12 col-xs-12 col-md-12 col-lg-12\">\n");
      out.write("        <h2>流光深处，悲喜释然</h2>\n");
      out.write("        <div>日期：2014-06-03 点击：147 作者：箫篱墨染</div>\n");
      out.write("        <p>斑驳岁月，有谁在细刻繁华 似水流年总不经意间跑到前方，而你、我都被抛在流年季末，一直在后逐年。 旧时光里的旧日容颜已模糊不清，不经意间早已忘却。阳光通过窗撒落在曾被年华细描过的课桌上，尘埃在易能灼伤青春眼眸的光束中飞扬，伸出手去捉却捉了个空... </p>\n");
      out.write("        <p><a class=\"btn btn-default\" href=\"#\" role=\"button\">查看详情 &raquo;</a></p>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"col-12 col-xs-12 col-md-12 col-lg-12\">\n");
      out.write("        <div class=\"col-6 col-xs-6 col-xs-offset-3 col-md-6 col-md-3 col-lg-6 col-lg-offset-6\">\n");
      out.write("            ");
      out.write("\n");
      out.write("\n");
      out.write("<ul class=\"pagination\">\n");
      out.write("    <li><a href=\"#\">Prev</a></li>\n");
      out.write("    <li class=\"active\"><a href=\"#\">1</a></li>\n");
      out.write("    <li><a href=\"#\">2</a></li>\n");
      out.write("    <li><a href=\"#\">3</a></li>\n");
      out.write("    <li><a href=\"#\">4</a></li>\n");
      out.write("    <li><a href=\"#\">Next</a></li>\n");
      out.write("</ul>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>");
      out.write("\n");
      out.write("        </div><!--/span-->\n");
      out.write("        \n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");

    if (currentpage == 0) {
        menutitle = "热门博文";
    } else {
        menutitle = "热门标签";
    }

      out.write("\n");
      out.write("<div class=\"col-xs-6 col-sm-3 sidebar-offcanvas\" id=\"sidebar\" role=\"navigation\">\n");
      out.write("    <div class=\"list-group\">\n");
      out.write("        <li class=\"list-group-item active\">");
      out.print(menutitle);
      out.write("</li>\n");
      out.write("        <a href=\"javascript:to_top1.submit()\" class=\"list-group-item\">Link</a>\n");
      out.write("        <a href=\"#\" class=\"list-group-item\">Link</a>\n");
      out.write("        <a href=\"#\" class=\"list-group-item\">Link</a>\n");
      out.write("        <a href=\"#\" class=\"list-group-item\">Link</a>\n");
      out.write("        <a href=\"#\" class=\"list-group-item\">Link</a>\n");
      out.write("        <a href=\"#\" class=\"list-group-item\">Link</a>\n");
      out.write("        <a href=\"#\" class=\"list-group-item\">Link</a>\n");
      out.write("        <a href=\"#\" class=\"list-group-item\">Link</a>\n");
      out.write("        <a href=\"#\" class=\"list-group-item\">Link</a>\n");
      out.write("        <a href=\"#\" class=\"list-group-item\">Link</a>\n");
      out.write("    </div>\n");
      out.write("</div><!--/span-->\n");
      out.write("\n");
      out.write("    </div><!--/row-->\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("        ");
} else if (currentpage == 3) {
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"container register-body\">\n");
      out.write("    <div class=\"row row-offcanvas row-offcanvas-right \">\n");
      out.write("        <div class=\"col-xs-7 col-sm-4 form-register\">\n");
      out.write("            <form class=\"form-group\" action=\"Index\" method=\"post\">\n");
      out.write("                <div class=\"Row \">\n");
      out.write("                    <div class=\"col-11 col-lg-11 col-xs-11 form-register-item\">\n");
      out.write("                        <label for=\"username\">用户名:</label>\n");
      out.write("                        <input name=\"username\" id=\"username\" type=\"text\" class=\"form-control\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-11 col-lg-11 col-xs-11 form-register-item\">\n");
      out.write("                        <label for=\"password\">密码:</label>\n");
      out.write("                        <input name=\"password\" id=\"password\" type=\"text\" class=\"form-control\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-11 col-lg-11 col-xs-11 form-register-item\">\n");
      out.write("                        <label for=\"repeat\">密码确认:</label>\n");
      out.write("                        <input name=\"repeat\" id=\"repeat\" type=\"text\" class=\"form-control\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-11 col-lg-11 col-xs-11 form-register-item\">\n");
      out.write("                        <label for=\"email\">电子邮箱：</label>\n");
      out.write("                        <input name=\"email\" id=\"email\" type=\"text\" class=\"form-control\">\n");
      out.write("                    </div>\n");
      out.write("                     <div class=\"col-12 col-lg-12 col-xs-12 form-register-item\">\n");
      out.write("                         <input name=\"agree\" id=\"agree\" type=\"checkbox\">我已阅读并同意<a href=\"\">《Java Blog的服务条款》</a></input>\n");
      out.write("                    </div>\n");
      out.write("                    <input type=\"hidden\" name=\"action\" value=\"registration_detail\">\n");
      out.write("                    <div class=\"col-11 col-lg-11 col-xs-11 form-register-item\">\n");
      out.write("                        <button class=\"btn btn-block btn-default btn-success\">注册</button>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-xs-11 col-sm-8 image-item\">\n");
      out.write("                <img src=\"image/robot.jpg\">\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("        ");
} else if (currentpage == 4) {
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"container\">\n");
      out.write("    <div class=\"row row-offcanvas\">\n");
      out.write("        <div class=\"col-10  col-lg-10 col-lg-offset-1 col-xs-10 col-xs-offset-1  form-register\">\n");
      out.write("            <form class=\"form-group \" action=\"Index\" method=\"post\">\n");
      out.write("                <div class=\"col-10 col-lg-10 col-lg-offset-1 col-xs-10 col-xs-offset-1\">\n");
      out.write("                    <div class=\"Row\">\n");
      out.write("                        <div class=\"col-2 col-lg-2 col-xs-2\">\n");
      out.write("                            <label class=\"form-control form-title\">标题：</label>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-10 col-lg-10 col-lg-offset-1 col-xs-10 col-xs-offset-1\">\n");
      out.write("                    <div class=\"Row\">\n");
      out.write("                        <div class=\"col-6 col-lg-6 col-xs-6\">\n");
      out.write("                            <input class=\"form-control form-off\" type=\"text\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-10 col-lg-10 col-lg-offset-1 col-xs-10 col-xs-offset-1\">\n");
      out.write("                    <div class=\"Row\">\n");
      out.write("                        <div class=\"col-2 col-lg-2 col-xs-2\">\n");
      out.write("                            <label class=\"form-control form-title\">标签：</label>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-10 col-lg-10 col-lg-offset-1 col-xs-10 col-xs-offset-1\">\n");
      out.write("                    <div class=\"Row\">\n");
      out.write("                        <div class=\"col-6 col-lg-6 col-xs-6 form-off\">\n");
      out.write("                            <input type=\"text\" class=\"form-control\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-10 col-lg-10 col-lg-offset-1 col-xs-10 col-xs-offset-1\">\n");
      out.write("                    <div class=\"Row\">\n");
      out.write("                        <div class=\"col-2 col-lg-2 col-xs-2\">\n");
      out.write("                            <label class=\"form-control form-title\">权限：</label>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-10 col-lg-10 col-lg-offset-1 col-xs-10 col-xs-offset-1\">\n");
      out.write("                    <div class=\"Row\">\n");
      out.write("                        <div class=\"col-6 col-lg-6 col-xs-6 form-off\">\n");
      out.write("                            <div class=\"radio-inline\">\n");
      out.write("                                <input name=\"previlige\" type=\"radio\"  class=\"radio-inline\" checked> 公开\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"radio-inline\">\n");
      out.write("                                <input name=\"previlige\" type=\"radio\" class=\"radio-inline\" unchecked>不公开\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-10 col-lg-10 col-lg-offset-1 col-xs-10 col-xs-offset-1\">\n");
      out.write("                    <div class=\"Row\">\n");
      out.write("                        <div class=\"col-2 col-lg-2 col-xs-2\">\n");
      out.write("                            <label class=\"form-control form-title\">博客内容：</label>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-10 col-lg-10 col-lg-offset-1 col-xs-10 col-xs-offset-1\">\n");
      out.write("                    <div class=\"Row\">\n");
      out.write("                        <div class=\"col-12 col-lg-12 col-xs-12 form-off\">\n");
      out.write("                            <script type=\"text/plain\" id=\"myEditor\" class=\"myEditor form-control editor-height\"></script>\n");
      out.write("                            <script type=\"text/javascript\">\n");
      out.write("                                var editor = UM.getEditor('myEditor');\n");
      out.write("                            </script> \n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"col-10 col-lg-10 col-lg-offset-1 col-xs-10 col-xs-offset-1\">\n");
      out.write("                    <div class=\"Row\">\n");
      out.write("                        <div class=\"col-12 col-lg-12 col-xs-12 form-line\">\n");
      out.write("                            <input type=\"hidden\" name=\"action\" value=\"blog_submit\">\n");
      out.write("                            <button class=\"btn btn-success\" type=\"submit\">提交博客</button>\n");
      out.write("                            <button class=\"btn btn-default\" type=\"reset\" onclick=\"javascript:editor.execCommand('cleardoc');\">取消</button>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("        ");
} else if (currentpage == 5) {
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"container\">\n");
      out.write("    <div class=\"row row-offcanvas\">\n");
      out.write("        <div class=\"col-6 col-lg-6 col-lg-offset-3 col-xs-6 col-xs-offset-3 form-register\">\n");
      out.write("            <form action=\"Index\" method=\"post\" class=\"form-group\">\n");
      out.write("                <div class=\"col-10 col-lg-10 col-lg-offset-1 col-xs-10 col-xs-offset-1 form-line\">\n");
      out.write("                    <div class=\"Row\">\n");
      out.write("                        <div class=\"col-4 col-lg-4 col-xs-4\">\n");
      out.write("                            <label class=\"form-control form-title\">当前密码：</label>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-8 col-lg-8 col-xs-8\">\n");
      out.write("                            <input name=\"current\" type=\"password\" class=\"form-control\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-10 col-lg-10 col-lg-offset-1 col-xs-10 col-xs-offset-1 form-line\">\n");
      out.write("                    <div class=\"Row\">\n");
      out.write("                        <div class=\"col-4 col-lg-4 col-xs-4\">\n");
      out.write("                            <label class=\"form-control form-title\">修改密码：</label>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-8 col-lg-8 col-xs-8\">\n");
      out.write("                            <input name=\"modify\" type=\"password\" class=\"form-control\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-10 col-lg-10 col-lg-offset-1 col-xs-10 col-xs-offset-1 form-line\">\n");
      out.write("                    <div class=\"Row\">\n");
      out.write("                        <div class=\"col-4 col-lg-4 col-xs-4\">\n");
      out.write("                            <label class=\"form-control form-title\">重复密码：</label>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-8 col-lg-8 col-xs-8\">\n");
      out.write("                            <input name=\"repeat\" type=\"password\" class=\"form-control\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-10 col-lg-10 col-lg-offset-1 col-xs-10 col-xs-offset-1 form-line\">\n");
      out.write("                    <div class=\"Row\">\n");
      out.write("                        <div class=\"col-4 col-lg-4 col-lg-offset-2 col-xs-4 col-xs-offset-2\">\n");
      out.write("                            <input type=\"hidden\" name=\"action\" value=\"modify_password\">\n");
      out.write("                            <button type=\"submit\" class=\"btn btn-success btn-block\">修改密码</button>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-4 col-lg-4 col-lg-offset-2 col-xs-4 col-xs-offset-2\">\n");
      out.write("                            <input type=\"hidden\" name=\"action\" value=\"modify_password\">\n");
      out.write("                            <button type=\"reset\" class=\"btn btn-success btn-block\">取消修改</button>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("        ");
} else if (currentpage == 6) {
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"container\">\n");
      out.write("    <div class=\"row row-offcanvas\">\n");
      out.write("        <div class=\"col-6 col-lg-6 col-lg-offset-3 col-xs-6 col-xs-offset-3 form-register\">\n");
      out.write("            <form action=\"Index\" method=\"post\" class=\"form-group\">\n");
      out.write("                <div class=\"col-10 col-lg-10 col-lg-offset-1 col-xs-10 col-xs-offset-1 form-line\">\n");
      out.write("                    <div class=\"Row\">\n");
      out.write("                        <div class=\"col-4 col-lg-4 col-xs-4\">\n");
      out.write("                            <label class=\"form-control form-title\">用户名：</label>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-8 col-lg-8 col-xs-8\">\n");
      out.write("                            <input name=\"username\" type=\"text\" class=\"form-control\" value=\"");
      out.print(username);
      out.write("\" readonly>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-10 col-lg-10 col-lg-offset-1 col-xs-10 col-xs-offset-1 form-line\">\n");
      out.write("                    <div class=\"Row\">\n");
      out.write("                        <div class=\"col-4 col-lg-4 col-xs-4\">\n");
      out.write("                            <label class=\"form-control form-title\">性别：</label>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-8 col-lg-8 col-xs-8\">\n");
      out.write("                            <div class=\"radio-inline\">\n");
      out.write("                                <input name=\"gender\" type=\"radio\"  class=\"radio-inline\" checked> 男\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"radio-inline\">\n");
      out.write("                                <input name=\"gender\" type=\"radio\" class=\"radio-inline\" unchecked>女\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"radio-inline\">\n");
      out.write("                                <input name=\"gender\" type=\"radio\" class=\"radio-inline\" unchecked>其他\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-10 col-lg-10 col-lg-offset-1 col-xs-10 col-xs-offset-1 form-line\">\n");
      out.write("                    <div class=\"Row\">\n");
      out.write("                        <div class=\"col-4 col-lg-4 col-xs-4\">\n");
      out.write("                            <label class=\"form-control form-title\">邮件地址：</label>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-8 col-lg-8 col-xs-8\">\n");
      out.write("                            <input name=\"email\" type=\"text\" class=\"form-control\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-10 col-lg-10 col-lg-offset-1 col-xs-10 col-xs-offset-1 form-line\">\n");
      out.write("                    <div class=\"Row\">\n");
      out.write("                        <div class=\"col-4 col-lg-4 col-xs-4\">\n");
      out.write("                            <label class=\"form-control form-title\">个人主页：</label>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-8 col-lg-8 col-xs-8\">\n");
      out.write("                            <input name=\"webpage\" type=\"text\" class=\"form-control\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-10 col-lg-10 col-lg-offset-1 col-xs-10 col-xs-offset-1 form-line\">\n");
      out.write("                    <div class=\"Row\">\n");
      out.write("                        <div class=\"col-4 col-lg-4 col-lg-offset-2 col-xs-4 col-xs-offset-2\">\n");
      out.write("                            <input type=\"hidden\" name=\"action\" value=\"modify_user\">\n");
      out.write("                            <button type=\"submit\" class=\"btn btn-success btn-block\">保存修改</button>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-4 col-lg-4 col-lg-offset-2 col-xs-4 col-xs-offset-2\">\n");
      out.write("                            <button type=\"reset\" class=\"btn btn-success btn-block\">取消修改</button>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("        ");
} else if (currentpage == 7) {
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"container\">\n");
      out.write("    <div class=\"row row-offcanvas\">\n");
      out.write("        <div class=\"col-11 col-lg-11 col-xs-11 blog-item\">\n");
      out.write("            <h2>千本桜</h2>\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "blog_html/content.html", out, true);
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"container\">\n");
      out.write("    <div class=\"row row-offcanvas\">\n");
      out.write("        <div class=\"col-11 col-lg-11 col-xs-11 comment-group\">\n");
      out.write("            <p>评论列表</p>\n");
      out.write("        </div>\n");
      out.write("        ");
for (int i = 0; i < 10; i++) {
      out.write("\n");
      out.write("        <div class=\"col-11 col-lg-11 col-xs-11 comment-item\">\n");
      out.write("            <p class=\"comment-tiltle\">#41楼 2014-06-06 15:50 | StephenYang </p>\n");
      out.write("            <hr class=\"hr-special\">\n");
      out.write("            <p class=\"comment-content\">受教了！这篇文章的作者很有心，不满足人云亦云。可以肯定的一点是，汉字的个数，如果算上日文和韩文里的，那确实是非常非常多的。所以3个字节的汉字应该是指常用汉字。</p>\n");
      out.write("            <hr class=\"hr-special\">\n");
      out.write("            <p class=\"comment-footer\">回复 支持</p>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        ");
}
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"col-11 col-lg-11 col-xs-11 comment-item\">\n");
      out.write("            <form class=\"form-group\" action=\"Index\" method=\"post\">\n");
      out.write("                <div class=\"Row\">\n");
      out.write("                    <div class=\"col-12 col-lg-12 col-xs-12 \">\n");
      out.write("                        <script type=\"text/plain\" id=\"myEditor\" class=\"myEditor form-control comment-height\"></script>\n");
      out.write("                        <script type=\"text/javascript\">\n");
      out.write("                            var editorCom = UM.getEditor('myEditor');\n");
      out.write("\n");
      out.write("                        </script> \n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-12 col-lg-12 col-xs-12\">\n");
      out.write("                    <div class=\"Row\">\n");
      out.write("                        <div class=\"col-12 col-lg-12 col-xs-12 form-line\">\n");
      out.write("                            <div class=\"comment-submit\">\n");
      out.write("                                <input type=\"hidden\" name=\"action\" value=\"comment_submit\">\n");
      out.write("                                <button class=\"btn btn-success\" type=\"submit\">提交</button>\n");
      out.write("                                <button class=\"btn btn-default\" type=\"reset\" onclick=\"javascript:editorCom.execCommand('cleardoc');\">取消</button>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>");
      out.write("\n");
      out.write("        ");
} else if (currentpage == 8) {
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"container\">\n");
      out.write("    <div class=\"row row-offcanvas\">\n");
      out.write("        <div class=\"col-10 col-lg-10  col-lg-offset-1 col-xs-10 col-xs-offset-1\">\n");
      out.write("            <div class=\"col-5 col-lg-5 col-xs-5 manage-group\">\n");
      out.write("                <p>标题</p>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-3 col-lg-3 col-xs-3 manage-group\">\n");
      out.write("                <p>时间</p>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-3 col-lg-3 col-xs-3 manage-group\">\n");
      out.write("                <p>操作</p>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        ");
for (int i = 0; i < 10; i++) {
      out.write("\n");
      out.write("        <div class=\"col-10 col-lg-10  col-lg-offset-1 col-xs-10 col-xs-offset-1\">\n");
      out.write("            <div class=\"col-5 col-lg-5 col-xs-5 manage-item\">\n");
      out.write("                <p>千本桜</p>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-3 col-lg-3 col-xs-3 manage-item\">\n");
      out.write("                <p>2014-06-07 14:11:22</p>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-3 col-lg-3 col-xs-3 manage-item-sub\">\n");
      out.write("                <div class=\"Row\">\n");
      out.write("                    <div class=\"col-6 col-lg-6 col-xs-6\">\n");
      out.write("                        <button class=\"btn btn-block btn-success\">编辑</button>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-6 col-lg-6 col-xs-6\">\n");
      out.write("                        <button class=\"btn btn-block btn-success\">删除</button>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        ");
}
      out.write("\n");
      out.write("        <div class=\"col-10 col-lg-10  col-lg-offset-1 col-xs-10 col-xs-offset-1\">\n");
      out.write("            <div class=\"col-6 col-lg-6 col-lg-offset-3 col-xs-6 col-xs-offset-3\">\n");
      out.write("                ");
      out.write("\n");
      out.write("\n");
      out.write("<ul class=\"pagination\">\n");
      out.write("    <li><a href=\"#\">Prev</a></li>\n");
      out.write("    <li class=\"active\"><a href=\"#\">1</a></li>\n");
      out.write("    <li><a href=\"#\">2</a></li>\n");
      out.write("    <li><a href=\"#\">3</a></li>\n");
      out.write("    <li><a href=\"#\">4</a></li>\n");
      out.write("    <li><a href=\"#\">Next</a></li>\n");
      out.write("</ul>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("        ");
}
      out.write("\n");
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("<form name=\"to_quit\" action=\"Index\" method=\"post\">\n");
      out.write("    <input type=\"hidden\" name=\"action\" value=\"logout\">\n");
      out.write("</form>\n");
      out.write("<form name=\"to_top1\" action=\"Index\" method=\"post\">\n");
      out.write("    <input type=\"hidden\" name=\"action\" value=\"hot_top\">\n");
      out.write("    <input type=\"hidden\" name=\"hot_top\" value=\"top1\">\n");
      out.write("</form>\n");
      out.write("<form name=\"to_mainpage\" action=\"Index\" method=\"post\">\n");
      out.write("    <input type=\"hidden\" name=\"action\" value=\"change\">\n");
      out.write("    <input type=\"hidden\" name=\"change\" value=\"to_mainpage\">\n");
      out.write("</form>\n");
      out.write("<form name=\"to_publicblog\" action=\"Index\" method=\"post\">\n");
      out.write("    <input type=\"hidden\" name=\"action\" value=\"change\">\n");
      out.write("    <input type=\"hidden\" name=\"change\" value=\"to_publicblog\">\n");
      out.write("</form>\n");
      out.write("<form name=\"to_myblog\" action=\"Index\" method=\"post\">\n");
      out.write("    <input type=\"hidden\" name=\"action\" value=\"change\">\n");
      out.write("    <input type=\"hidden\" name=\"change\" value=\"to_myblog\">\n");
      out.write("    ");
      out.write("\n");
      out.write("</form>\n");
      out.write("<form name=\"to_register\" method=\"post\" action=\"Index\">\n");
      out.write("    <input name=\"action\" type=\"hidden\" value=\"to_registration\">\n");
      out.write("</form>\n");
      out.write("<form name=\"to_blog_create\" method=\"post\" action=\"Index\">\n");
      out.write("    <input name=\"action\" type=\"hidden\" value=\"to_blog_create\">\n");
      out.write("</form>\n");
      out.write("<form name=\"to_modify_password\" method=\"post\" action=\"Index\">\n");
      out.write("    <input name=\"action\" type=\"hidden\" value=\"to_modify_password\">\n");
      out.write("</form>\n");
      out.write("<form name=\"to_modify_user\" method=\"post\" action=\"Index\">\n");
      out.write("    <input name=\"action\" type=\"hidden\" value=\"to_modify_user\">\n");
      out.write("</form>\n");
      out.write("<form name=\"to_manage_blog\" method=\"post\" action=\"Index\">\n");
      out.write("    <input name=\"action\" type=\"hidden\" value=\"to_manage_blog\"> \n");
      out.write("</form>");
      out.write("\n");
      out.write("        ");
dop.closeConnetion();
      out.write("\n");
      out.write("        <hr>\n");
      out.write("        <footer >\n");
      out.write("            <p class=\"footer-center\">&copy;Powered by coolwind</p>\n");
      out.write("        </footer>\n");
      out.write("    </body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
