/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2018-09-06 13:46:00 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class view_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery-3.3.1.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("<script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("    <div class=\"row\">\r\n");
      out.write("        <div class=\"col-md-12\">\r\n");
      out.write("            <h1>GIS Library</h1>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("    <div class=\"row\">\r\n");
      out.write("        <div class=\"col-md-12\">\r\n");
      out.write("            <table class=\"table table-hover table-bordered table-striped\" id=\"book_table\">\r\n");
      out.write("                <thead>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <th>勾选</th>\r\n");
      out.write("                    <th>ID</th>\r\n");
      out.write("                    <th>书籍名称</th>\r\n");
      out.write("                    <th>借阅状态</th>\r\n");
      out.write("                    <th>借阅人</th>\r\n");
      out.write("                    <th>电话</th>\r\n");
      out.write("                    <th>操作</th>\r\n");
      out.write("                </tr>\r\n");
      out.write("                </thead>\r\n");
      out.write("                <tbody>\r\n");
      out.write("               \t<tr>\r\n");
      out.write("                    <th>勾选</th>\r\n");
      out.write("                    <th>ID</th>\r\n");
      out.write("                    <th>书籍名称</th>\r\n");
      out.write("                    <th>借阅状态</th>\r\n");
      out.write("                    <th>借阅人</th>\r\n");
      out.write("                    <th>电话</th>\r\n");
      out.write("                    <th>操作</th>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <th>勾选</th>\r\n");
      out.write("                    <th>ID</th>\r\n");
      out.write("                    <th>书籍名称</th>\r\n");
      out.write("                    <th>借阅状态</th>\r\n");
      out.write("                    <th>借阅人</th>\r\n");
      out.write("                    <th>电话</th>\r\n");
      out.write("                    <th>操作</th>\r\n");
      out.write("                </tr>\r\n");
      out.write("                </tbody>\r\n");
      out.write("            </table>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"row\">\r\n");
      out.write("    \t<div class=\"col-md-6\" id=\"page_nav_area\"></div>\r\n");
      out.write("\t\t    ");
      out.write("\r\n");
      out.write("\t\t    <div class=\"col-md-6\" id=\"page_nav_area\">\r\n");
      out.write("\t\t    \t<nav aria-label=\"Page navigation\">\r\n");
      out.write("\t\t\t\t  <ul class=\"pagination\">\r\n");
      out.write("\t\t\t\t  <li><a href=\"#\">首页</a></li>\r\n");
      out.write("\t\t\t\t    <li>\r\n");
      out.write("\t\t\t\t      <a href=\"#\" aria-label=\"Previous\">\r\n");
      out.write("\t\t\t\t        <span aria-hidden=\"true\">&laquo;</span>\r\n");
      out.write("\t\t\t\t      </a>\r\n");
      out.write("\t\t\t\t    </li>\r\n");
      out.write("\t\t\t\t    <li><a href=\"#\">1</a></li>\r\n");
      out.write("\t\t\t\t    <li><a href=\"#\">2</a></li>\r\n");
      out.write("\t\t\t\t    <li><a href=\"#\">3</a></li>\r\n");
      out.write("\t\t\t\t    <li><a href=\"#\">4</a></li>\r\n");
      out.write("\t\t\t\t    <li><a href=\"#\">5</a></li>\r\n");
      out.write("\t\t\t\t    <li>\r\n");
      out.write("\t\t\t\t      <a href=\"#\" aria-label=\"Next\">\r\n");
      out.write("\t\t\t\t        <span aria-hidden=\"true\">&raquo;</span>\r\n");
      out.write("\t\t\t\t      </a>\r\n");
      out.write("\t\t\t\t    </li>\r\n");
      out.write("\t\t\t\t    <li><a href=\"#\">尾页</a></li>\r\n");
      out.write("\t\t\t\t  </ul>\r\n");
      out.write("\t\t\t\t</nav>\r\n");
      out.write("\t\t    </div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
