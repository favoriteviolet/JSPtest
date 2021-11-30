package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import cn.po.User;

public final class main_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/jsp/../WEB-INF/jspf/banner.jspf");
    _jspx_dependants.add("/jsp/../WEB-INF/jspf/nav.jspf");
    _jspx_dependants.add("/jsp/../WEB-INF/jspf/bottom.jspf");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <script src=\"../js/jguery.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <link href=\"../css/main.css\" type=\"text/css\" rel=\"stylesheet\"/>\n");
      out.write("        <script src=\"../js/main.js\" type=\"text/javascript\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"main\">\n");
      out.write("            ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<div id=\"banner\">\n");
      out.write("\n");
      out.write("    <span id=\"flush\"><a href=\"\">刷新页面</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href=\"\">关闭系统</a></span>\n");
      out.write("    <span id=\"user\">");
      out.print(((User) session.getAttribute("user")).getName());
      out.write("</span>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("            ");
      out.write("\n");
      out.write("\n");
      out.write("<div id=\"nav\">\n");
      out.write("    <ul id=\"menu\">\n");
      out.write("        <li class=\"menuitem\"><a>退出系统</a>&nbsp;&nbsp;&nbsp;&nbsp;</li>\n");
      out.write("        <li class=\"menuitem\"><a>更改口令</a>&nbsp;|&nbsp;</li>\n");
      out.write("        <li class=\"menuitem\"><a>系统查询</a>&nbsp;|&nbsp;\n");
      out.write("            <ul class=\"submenu current\">\n");
      out.write("                <li class=\"submenuitem\"><a>图书档案查询</a></li>\n");
      out.write("                <li class=\"submenuitem\"><a>图书借阅查询</a></li>\n");
      out.write("                <li class=\"submenuitem\"><a>借阅到期提醒</a></li>\n");
      out.write("            </ul>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"menuitem\"><a>图书借还</a>&nbsp;|&nbsp;\n");
      out.write("            <ul class=\"submenu current\">\n");
      out.write("                <li class=\"submenuitem\"><a>图书借阅</a></li>\n");
      out.write("                <li class=\"submenuitem\"><a>图书续借</a></li>\n");
      out.write("                <li class=\"submenuitem\"><a>图书归还</a></li>\n");
      out.write("            </ul>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"menuitem\"><a>图书管理</a>&nbsp;|&nbsp;\n");
      out.write("            <ul class=\"submenu current\">\n");
      out.write("                <li class=\"submenuitem\"><a>图书类型设置</a></li>\n");
      out.write("                <li class=\"submenuitem\"><a>图书档案管理</a></li>\n");
      out.write("            </ul>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"menuitem\"><a>读者管理</a>&nbsp;|&nbsp;\n");
      out.write("            <ul class=\"submenu current\">\n");
      out.write("                <li class=\"submenuitem\"><a>读者类型管理</a></li>\n");
      out.write("                <li class=\"submenuitem\"><a>读者档案管理</a></li>\n");
      out.write("            </ul>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"menuitem\"><a>系统设置</a>&nbsp;|&nbsp;\n");
      out.write("            <ul class=\"submenu current\">\n");
      out.write("                <li class=\"submenuitem\"><a>图书馆信息</a></li>\n");
      out.write("                <li class=\"submenuitem\"><a>管理员设置</a></li>\n");
      out.write("                <li class=\"submenuitem\"><a>参数设置</a></li>\n");
      out.write("                <li class=\"submenuitem\"><a>书架设置</a></li>\n");
      out.write("            </ul>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"menuitem\"><a>首页</a>&nbsp;|&nbsp;</li>\n");
      out.write("    </ul>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("            <div id=\"content\"></div>\n");
      out.write("            ");
      out.write("\n");
      out.write("\n");
      out.write("<div id=\"bottom\">\n");
      out.write("    CopyRight &copy; 2008 www.**********.com 长春市*****有限公司<br>\n");
      out.write("    本站请使用IE6.0或以上版本 1024*768为最佳显示效果\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
