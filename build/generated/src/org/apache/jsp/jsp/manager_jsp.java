package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class manager_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
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
      out.write("        <title>manager Page</title>\n");
      out.write("        <script src=\"../js/jquery.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <link href=\"../css/main.css\" type=\"text/css\" rel=\"stylesheet\"/>\n");
      out.write("        <script src=\"../js/main.js\" type=\"text/javascript\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"content\">\n");
      out.write("            <span style=\"color:#FF6600;float:left;font-size: 12px;\">当前位置：系统设置>管理员设置>>></span><br>\n");
      out.write("            <table style=\"font-size: 12px;margin:auto \" >\n");
      out.write("\n");
      out.write("                <tr align=\"center\">\n");
      out.write("                    <td style=\"width:5%;background-color: #F9D16B\">管理员名称</td>\n");
      out.write("                    <td style=\"width:3%;background-color: #F9D16B\">系统设置</td>\n");
      out.write("                    <td style=\"width:3%;background-color: #F9D16B\">读者管理</td>\n");
      out.write("                    <td style=\"width:3%;background-color: #F9D16B\">图书管理</td>\n");
      out.write("                    <td style=\"width:3%;background-color: #F9D16B\">图书借还</td>\n");
      out.write("                    <td style=\"width:3%;background-color: #F9D16B\">系统查询</td>\n");
      out.write("                    <td style=\"width:3%;background-color: #F9D16B\">权限设置</td>\n");
      out.write("                    <td style=\"width:2%;background-color: #F9D16B\">删除</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td></td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("        </div>\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("<div id=\"bottom\">\n");
      out.write("    CopyRight &copy; 2008 www.**********.com 长春市*****有限公司<br>\n");
      out.write("    本站请使用IE6.0或以上版本 1024*768为最佳显示效果\n");
      out.write("</div>\n");
      out.write("\n");
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
