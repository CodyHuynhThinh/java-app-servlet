/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.24
 * Generated at: 2022-06-15 03:46:59 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.web;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(5);
    _jspx_dependants.put("/common/taglib.jsp", Long.valueOf(1655234795149L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1587378334766L));
    _jspx_dependants.put("jar:file:/D:/04.%20Projects/java-servlet/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/java-app/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153359882000L));
    _jspx_dependants.put("/WEB-INF/lib/sitemesh-2.4.2.jar", Long.valueOf(1655227900242L));
    _jspx_dependants.put("jar:file:/D:/04.%20Projects/java-servlet/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/java-app/WEB-INF/lib/sitemesh-2.4.2.jar!/META-INF/sitemesh-decorator.tld", Long.valueOf(1123653092000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
}

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

      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Trang Chủ</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"row\">\r\n");
      out.write("\r\n");
      out.write("            <div class=\"col-md-3\">\r\n");
      out.write("                <p class=\"lead\">Shop Name</p>\r\n");
      out.write("                <div class=\"list-group\">\r\n");
      out.write("                    <a href=\"#\" class=\"list-group-item\">Printable</a>\r\n");
      out.write("                    <a href=\"#\" class=\"list-group-item\">Cupcake Wrappers</a>\r\n");
      out.write("                    <a href=\"#\" class=\"list-group-item\">Authentic Dragon Bones</a>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"col-md-9\">\r\n");
      out.write("\r\n");
      out.write("                <div class=\"row carousel-holder\">\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"col-md-12\">\r\n");
      out.write("                        <div id=\"carousel-example-generic\" class=\"carousel slide\" data-ride=\"carousel\">\r\n");
      out.write("                            <ol class=\"carousel-indicators\">\r\n");
      out.write("                                <li data-target=\"#carousel-example-generic\" data-slide-to=\"0\" class=\"active\"></li>\r\n");
      out.write("                                <li data-target=\"#carousel-example-generic\" data-slide-to=\"1\"></li>\r\n");
      out.write("                                <li data-target=\"#carousel-example-generic\" data-slide-to=\"2\"></li>\r\n");
      out.write("                            </ol>\r\n");
      out.write("                            <div class=\"carousel-inner\">\r\n");
      out.write("                                <div class=\"item active\">\r\n");
      out.write("                                    <img class=\"slide-image\" src=\"http://placehold.it/800x300\" alt=\"\">\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"item\">\r\n");
      out.write("                                    <img class=\"slide-image\" src=\"http://placehold.it/800x300\" alt=\"\">\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"item\">\r\n");
      out.write("                                    <img class=\"slide-image\" src=\"http://placehold.it/800x300\" alt=\"\">\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <a class=\"left carousel-control\" href=\"#carousel-example-generic\" data-slide=\"prev\">\r\n");
      out.write("                                <span class=\"glyphicon glyphicon-chevron-left\"></span>\r\n");
      out.write("                            </a>\r\n");
      out.write("                            <a class=\"right carousel-control\" href=\"#carousel-example-generic\" data-slide=\"next\">\r\n");
      out.write("                                <span class=\"glyphicon glyphicon-chevron-right\"></span>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"col-sm-4 col-lg-4 col-md-4\">\r\n");
      out.write("                        <div class=\"thumbnail\">\r\n");
      out.write("                            <img src=\"http://placehold.it/320x150\" alt=\"\">\r\n");
      out.write("                            <div class=\"caption\">\r\n");
      out.write("                                <h4 class=\"pull-right\">$24.99</h4>\r\n");
      out.write("                                <h4><a href=\"#\">First Product</a>\r\n");
      out.write("                                </h4>\r\n");
      out.write("                                <p>See more snippets like this online store item at <a target=\"_blank\" href=\"http://www.bootsnipp.com\">Bootsnipp - http://bootsnipp.com</a>.</p>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"ratings\">\r\n");
      out.write("                                <p class=\"pull-right\">15 reviews</p>\r\n");
      out.write("                                <p>\r\n");
      out.write("                                    <span class=\"glyphicon glyphicon-star\"></span>\r\n");
      out.write("                                    <span class=\"glyphicon glyphicon-star\"></span>\r\n");
      out.write("                                    <span class=\"glyphicon glyphicon-star\"></span>\r\n");
      out.write("                                    <span class=\"glyphicon glyphicon-star\"></span>\r\n");
      out.write("                                    <span class=\"glyphicon glyphicon-star\"></span>\r\n");
      out.write("                                </p>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"col-sm-4 col-lg-4 col-md-4\">\r\n");
      out.write("                        <div class=\"thumbnail\">\r\n");
      out.write("                            <img src=\"http://placehold.it/320x150\" alt=\"\">\r\n");
      out.write("                            <div class=\"caption\">\r\n");
      out.write("                                <h4 class=\"pull-right\">$64.99</h4>\r\n");
      out.write("                                <h4><a href=\"#\">Second Product</a>\r\n");
      out.write("                                </h4>\r\n");
      out.write("                                <p>This is a short description. Lorem ipsum dolor sit amet, consectetur adipiscing elit.</p>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"ratings\">\r\n");
      out.write("                                <p class=\"pull-right\">12 reviews</p>\r\n");
      out.write("                                <p>\r\n");
      out.write("                                    <span class=\"glyphicon glyphicon-star\"></span>\r\n");
      out.write("                                    <span class=\"glyphicon glyphicon-star\"></span>\r\n");
      out.write("                                    <span class=\"glyphicon glyphicon-star\"></span>\r\n");
      out.write("                                    <span class=\"glyphicon glyphicon-star\"></span>\r\n");
      out.write("                                    <span class=\"glyphicon glyphicon-star-empty\"></span>\r\n");
      out.write("                                </p>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"col-sm-4 col-lg-4 col-md-4\">\r\n");
      out.write("                        <div class=\"thumbnail\">\r\n");
      out.write("                            <img src=\"http://placehold.it/320x150\" alt=\"\">\r\n");
      out.write("                            <div class=\"caption\">\r\n");
      out.write("                                <h4 class=\"pull-right\">$74.99</h4>\r\n");
      out.write("                                <h4><a href=\"#\">Third Product</a>\r\n");
      out.write("                                </h4>\r\n");
      out.write("                                <p>This is a short description. Lorem ipsum dolor sit amet, consectetur adipiscing elit.</p>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"ratings\">\r\n");
      out.write("                                <p class=\"pull-right\">31 reviews</p>\r\n");
      out.write("                                <p>\r\n");
      out.write("                                    <span class=\"glyphicon glyphicon-star\"></span>\r\n");
      out.write("                                    <span class=\"glyphicon glyphicon-star\"></span>\r\n");
      out.write("                                    <span class=\"glyphicon glyphicon-star\"></span>\r\n");
      out.write("                                    <span class=\"glyphicon glyphicon-star\"></span>\r\n");
      out.write("                                    <span class=\"glyphicon glyphicon-star-empty\"></span>\r\n");
      out.write("                                </p>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"col-sm-4 col-lg-4 col-md-4\">\r\n");
      out.write("                        <div class=\"thumbnail\">\r\n");
      out.write("                            <img src=\"http://placehold.it/320x150\" alt=\"\">\r\n");
      out.write("                            <div class=\"caption\">\r\n");
      out.write("                                <h4 class=\"pull-right\">$84.99</h4>\r\n");
      out.write("                                <h4><a href=\"#\">Fourth Product</a>\r\n");
      out.write("                                </h4>\r\n");
      out.write("                                <p>This is a short description. Lorem ipsum dolor sit amet, consectetur adipiscing elit.</p>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"ratings\">\r\n");
      out.write("                                <p class=\"pull-right\">6 reviews</p>\r\n");
      out.write("                                <p>\r\n");
      out.write("                                    <span class=\"glyphicon glyphicon-star\"></span>\r\n");
      out.write("                                    <span class=\"glyphicon glyphicon-star\"></span>\r\n");
      out.write("                                    <span class=\"glyphicon glyphicon-star\"></span>\r\n");
      out.write("                                    <span class=\"glyphicon glyphicon-star-empty\"></span>\r\n");
      out.write("                                    <span class=\"glyphicon glyphicon-star-empty\"></span>\r\n");
      out.write("                                </p>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"col-sm-4 col-lg-4 col-md-4\">\r\n");
      out.write("                        <div class=\"thumbnail\">\r\n");
      out.write("                            <img src=\"http://placehold.it/320x150\" alt=\"\">\r\n");
      out.write("                            <div class=\"caption\">\r\n");
      out.write("                                <h4 class=\"pull-right\">$94.99</h4>\r\n");
      out.write("                                <h4><a href=\"#\">Fifth Product</a>\r\n");
      out.write("                                </h4>\r\n");
      out.write("                                <p>This is a short description. Lorem ipsum dolor sit amet, consectetur adipiscing elit.</p>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"ratings\">\r\n");
      out.write("                                <p class=\"pull-right\">18 reviews</p>\r\n");
      out.write("                                <p>\r\n");
      out.write("                                    <span class=\"glyphicon glyphicon-star\"></span>\r\n");
      out.write("                                    <span class=\"glyphicon glyphicon-star\"></span>\r\n");
      out.write("                                    <span class=\"glyphicon glyphicon-star\"></span>\r\n");
      out.write("                                    <span class=\"glyphicon glyphicon-star\"></span>\r\n");
      out.write("                                    <span class=\"glyphicon glyphicon-star-empty\"></span>\r\n");
      out.write("                                </p>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"col-sm-4 col-lg-4 col-md-4\">\r\n");
      out.write("                        <h4><a href=\"#\">Like this template?</a>\r\n");
      out.write("                        </h4>\r\n");
      out.write("                        <p>If you like this template, then check out <a target=\"_blank\" href=\"http://maxoffsky.com/code-blog/laravel-shop-tutorial-1-building-a-review-system/\">this tutorial</a> on how to build a working review system for your online store!</p>\r\n");
      out.write("                        <a class=\"btn btn-primary\" target=\"_blank\" href=\"http://maxoffsky.com/code-blog/laravel-shop-tutorial-1-building-a-review-system/\">View Tutorial</a>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}