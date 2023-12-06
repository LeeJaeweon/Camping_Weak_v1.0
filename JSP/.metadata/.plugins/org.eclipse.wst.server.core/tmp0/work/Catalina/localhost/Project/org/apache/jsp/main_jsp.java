/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.80
 * Generated at: 2023-12-06 05:08:09 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.PrintWriter;

public final class main_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.io.PrintWriter");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
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

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/bootstrap.css\">\n");
      out.write("    <title>🔥Camping🔥</title>\n");
      out.write("\n");
      out.write("    <!-- 팝업 창 띄우기 함수 -->\n");
      out.write("    <script>\n");
      out.write("        function openPopup(url, width, height) {\n");
      out.write("            var popup = window.open(url, \"_blank\", \"width=\" + width + \",height=\" + height);\n");
      out.write("            popup.focus();\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        function submitFormToXML() {\n");
      out.write("            var name = document.getElementById('name').value;\n");
      out.write("            var email = document.getElementById('email').value;\n");
      out.write("            var message = document.getElementById('message').value;\n");
      out.write("            \n");
      out.write("            // Create XML string\n");
      out.write("            var xmlString = '<inquiry><name>' + name + '</name><email>' + email + '</email><message>' + message + '</message></inquiry>';\n");
      out.write("            \n");
      out.write("            // TODO: Send this XML to the server-side for further processing\n");
      out.write("            console.log(\"Generated XML: \", xmlString);\n");
      out.write("        }\n");
      out.write("    </script>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    ");

        String userID = (String) session.getAttribute("userID");
    
      out.write("\n");
      out.write("    <nav class=\"navbar navbar-expand-lg navbar-light bg-light\">\n");
      out.write("        <a class=\"navbar-brand\" href=\"main.jsp\" style=\"margin-left: 10px;\">🔥Camping_Main🔥</a>\n");
      out.write("        <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarNavDropdown\" aria-controls=\"navbarNavDropdown\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("            <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("        </button>\n");
      out.write("        <div class=\"collapse navbar-collapse\" id=\"navbarNavDropdown\">\n");
      out.write("            <ul class=\"navbar-nav\">\n");
      out.write("                <li class=\"nav-item active\">\n");
      out.write("                    <a class=\"nav-link\" href=\"main.jsp\">🛖메인</a>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"nav-item\">\n");
      out.write("                    <a class=\"nav-link\" href=\"bbs.jsp\">📒게시판</a>\n");
      out.write("                </li>\n");
      out.write("                ");

                    if (userID == null) {
                
      out.write("\n");
      out.write("                <li class=\"nav-item dropdown\">\n");
      out.write("                    <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdownMenuLink\" role=\"button\" data-toggle=\"dropdown\" aria-expanded=\"false\">\n");
      out.write("                        접속하기\n");
      out.write("                    </a>\n");
      out.write("                    <ul class=\"dropdown-menu\" aria-labelledby=\"navbarDropdownMenuLink\">\n");
      out.write("                        <li><a class=\"dropdown-item\" href=\"login.jsp\">로그인</a></li>\n");
      out.write("                        <li><a class=\"dropdown-item\" href=\"join.jsp\">회원가입</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </li>\n");
      out.write("                ");

                } else {
                
      out.write("\n");
      out.write("                <li class=\"nav-item dropdown\">\n");
      out.write("                    <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdownMenuLink\" role=\"button\" data-toggle=\"dropdown\" aria-expanded=\"false\">\n");
      out.write("                        ⚙️회원관리\n");
      out.write("                    </a>\n");
      out.write("                    <ul class=\"dropdown-menu\" aria-labelledby=\"navbarDropdownMenuLink\">\n");
      out.write("                        <a href=\"#\" class=\"dropdown-item\" onclick=\"openPopup('finduser.jsp', 600, 800); return false;\">🏕️유저찾기</a>\n");
      out.write("                        <a href=\"#\" class=\"dropdown-item\" onclick=\"openPopup('pingTest2.jsp', 600, 400); return false;\">📡인터넷 테스트</a>\n");
      out.write("                        <li><a class=\"dropdown-item\" href=\"logoutAction.jsp\">🤚로그아웃</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </li>\n");
      out.write("                ");

                    }
                
      out.write("\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("    </nav>\n");
      out.write("\n");
      out.write("<!-- 메인 페이지 영역 시작 -->\n");
      out.write("<div class=\"container mt-5\">\n");
      out.write("    <div class=\"jumbotron border rounded p-3\">\n");
      out.write("        <div class=\"container text-center\">\n");
      out.write("            <h1 style=\"font-size: 48px;\">Camping with us</h1>\n");
      out.write("            <p>캠핑게시판에 오신 것을 환영합니다.</p>\n");
      out.write("            <div class=\"mt-4\">\n");
      out.write("                <a href=\"DownloadServlet.jsp?file=myfile.txt\" class=\"btn btn-primary mr-2\">☎ 연락처</a>\n");
      out.write("                <a href=\"rss_test.jsp\" class=\"btn btn-primary\">RSS 테스트</a>\n");
      out.write("                <!-- <button type=\"button\" class=\"btn btn-primary\" data-toggle=\"modal\" data-target=\"#contactAdminModal\">\n");
      out.write("                    관리자에게 문의하기\n");
      out.write("                </button> -->\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- 모달 팝업 창 트리거 버튼 -->\n");
      out.write("<!-- <button type=\"button\" class=\"btn btn-primary\" data-toggle=\"modal\" data-target=\"#xmlModal\">\n");
      out.write("    Open XML Modal\n");
      out.write("</button> -->\n");
      out.write("\n");
      out.write("<!-- 모달 팝업 창 -->\n");
      out.write("<!-- <div class=\"modal fade\" id=\"xmlModal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"xmlModalLabel\" aria-hidden=\"true\">\n");
      out.write("    <div class=\"modal-dialog\" role=\"document\">\n");
      out.write("        <div class=\"modal-content\">\n");
      out.write("            <div class=\"modal-header\">\n");
      out.write("                <h5 class=\"modal-title\" id=\"xmlModalLabel\">XXE Vulnerability Test</h5>\n");
      out.write("                <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\n");
      out.write("                    <span aria-hidden=\"true\">&times;</span>\n");
      out.write("                </button>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"modal-body\">\n");
      out.write("                <form method=\"post\">\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label for=\"xmlData\">XML Data:</label>\n");
      out.write("                        <textarea name=\"xmlData\" id=\"xmlData\" class=\"form-control\" rows=\"10\" cols=\"30\"></textarea>\n");
      out.write("                    </div>\n");
      out.write("                    <button type=\"submit\" class=\"btn btn-primary\">Submit XML Data</button>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"modal-footer\">\n");
      out.write("                <button type=\"button\" class=\"btn btn-secondary\" data-dismiss=\"modal\">Close</button>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("-->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    <!-- 메인페이지 사진 삽입 영역 -->\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"row justify-content-center\">\n");
      out.write("            <div class=\"row justify-content-center\">\n");
      out.write("                <div id=\"myCarousel\" class=\"carousel slide\" data-ride=\"carousel\">\n");
      out.write("                    <ol class=\"carousel-indicators\">\n");
      out.write("                        <!-- <li data-target=\"#myCarousel\" data-slide-to=\"1\" class=\"active\"></li>\n");
      out.write("                        <li data-target=\"#myCarousel\" data-slide-to=\"2\"></li>\n");
      out.write("                        <li data-target=\"#myCarousel\" data-slide-to=\"3\"></li> -->\n");
      out.write("                    </ol>\n");
      out.write("                    <div class=\"carousel-inner\">\n");
      out.write("                        <div class=\"carousel-item active\">\n");
      out.write("                            <div class=\"text-center\">\n");
      out.write("                                <img src=\"images/1.gif\" class=\"img-fluid\" alt=\"Camping Image\" style=\"width: 100%; height: auto;\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <script src=\"http://code.jquery.com/jquery-3.1.1.min.js\"></script>\n");
      out.write("    <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/5.0.0-alpha1/js/bootstrap.min.js\"></script>\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
