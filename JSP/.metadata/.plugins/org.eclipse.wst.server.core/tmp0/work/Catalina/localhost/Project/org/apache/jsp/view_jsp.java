/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.80
 * Generated at: 2023-10-10 11:18:52 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.PrintWriter;
import bbs.Bbs;
import bbs.BbsDAO;
import java.io.File;
import java.util.regex.Pattern;

public final class view_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes.add("bbs.Bbs");
    _jspx_imports_classes.add("bbs.BbsDAO");
    _jspx_imports_classes.add("java.util.regex.Pattern");
    _jspx_imports_classes.add("java.io.File");
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width\", initial-scale=\"1\" >  <!-- 반응형 웹에 사용하는 메타태그 -->\n");
      out.write("<link rel=\"stylesheet\" href=\"css/bootstrap.css\"> <!-- 참조  -->\n");
      out.write("<title> Camping </title>\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("    function openPopupPingTest() {\n");
      out.write("        var popup = window.open(\"pingTest2.jsp\", \"_blank\", \"width=600,height=400\");\n");
      out.write("        popup.focus();\n");
      out.write("    }\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("    function openPopupFindUser() {\n");
      out.write("        var popup = window.open(\"finduser.jsp\", \"_blank\", \"width=600,height=400\");\n");
      out.write("        popup.focus();\n");
      out.write("    }\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");

    String userID = null;
    if (session.getAttribute("userID") != null)
    {
        userID = (String)session.getAttribute("userID");
    }
    int bbsID = 0;
    if (request.getParameter("bbsID") != null)
    {
        bbsID = Integer.parseInt(request.getParameter("bbsID"));
    }
    if (bbsID == 0)      
    {
        PrintWriter script = response.getWriter();
        script.println("<script>");
        script.println("alert('유효하지 않은 글입니다')");
        script.println("location.href = 'bbs.jsp'");
        script.println("</script>");
    }
    
    Bbs bbs = new BbsDAO().getBbs(bbsID);
    String realFolder = getServletContext().getRealPath("/bbsUpload");
    File dir = new File(realFolder);
    File[] files = dir.listFiles();
    String matchedFileName = null;

    // Get the correct file with the matching pattern
    Pattern pattern = Pattern.compile("^" + bbsID + "_.*");
    for (File file : files) {
        if (pattern.matcher(file.getName()).matches()) {
            matchedFileName = file.getName();
            break;
        }
    }

      out.write("\n");
      out.write("<nav class=\"navbar navbar-expand-lg navbar-light bg-light\">\n");
      out.write("    <a class=\"navbar-brand\" href=\"main.jsp\" style=\"margin-left: 10px;\">게시판 목록</a>\n");
      out.write("		<button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarNavDropdown\" aria-controls=\"navbarNavDropdown\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("			<span class=\"navbar-toggler-icon\"></span>\n");
      out.write("    </button>\n");
      out.write("    <div class=\"collapse navbar-collapse\" id=\"navbarNavDropdown\">\n");
      out.write("        <ul class=\"navbar-nav\">\n");
      out.write("            <li class=\"nav-item active\">\n");
      out.write("                <a class=\"nav-link\" href=\"main.jsp\">🛖메인</a>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"nav-item\">\n");
      out.write("                <a class=\"nav-link\" href=\"bbs.jsp\">📒게시판</a>\n");
      out.write("            </li>\n");
      out.write("            ");

                if(userID == null) {
            
      out.write("\n");
      out.write("            <li class=\"nav-item dropdown\">\n");
      out.write("                <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdownMenuLink\" role=\"button\" data-toggle=\"dropdown\" aria-expanded=\"false\">\n");
      out.write("                    접속하기\n");
      out.write("                </a>\n");
      out.write("                <ul class=\"dropdown-menu\" aria-labelledby=\"navbarDropdownMenuLink\">\n");
      out.write("                    <li><a class=\"dropdown-item\" href=\"login.jsp\">로그인</a></li>\n");
      out.write("                    <li><a class=\"dropdown-item\" href=\"join.jsp\">회원가입</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </li>\n");
      out.write("            ");

            } else {
            
      out.write("\n");
      out.write("            <li class=\"nav-item dropdown\">\n");
      out.write("                <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdownMenuLink\" role=\"button\" data-toggle=\"dropdown\" aria-expanded=\"false\">\n");
      out.write("                    ⚙️회원관리\n");
      out.write("                </a>\n");
      out.write("                <ul class=\"dropdown-menu\" aria-labelledby=\"navbarDropdownMenuLink\">\n");
      out.write("                    <a href=\"#\" class=\"dropdown-item\" onclick=\"openPopupFindUser(); return false;\">🏕️유저찾기</a>\n");
      out.write("					<a href=\"#\" class=\"dropdown-item\" onclick=\"openPopupPingTest(); return false;\">📡인터넷 테스트</a>\n");
      out.write("                    <li><a class=\"dropdown-item\" href=\"logoutAction.jsp\">🤚로그아웃</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </li>\n");
      out.write("            ");

                }
            
      out.write("\n");
      out.write("        </ul>\n");
      out.write("    </div>\n");
      out.write("</nav>\n");
      out.write("    <div class=\"row mt-4\">\n");
      out.write("    <div class=\"col-md-6 offset-md-3\">\n");
      out.write("            <table class=\"table table-striped \" style=\"text-align:center; border:1px solid #dddddd\">\n");
      out.write("                <thead>\n");
      out.write("                <style>\n");
      out.write("    table {\n");
      out.write("        border-collapse: separate;\n");
      out.write("        width: 100%;\n");
      out.write("        margin: 0 auto;\n");
      out.write("        border: 1px solid #000; /* 테두리를 검은색으로 설정 */\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    th, td {\n");
      out.write("        border: 1px solid #000; /* 테이블 셀 테두리를 흰색으로 설정 */\n");
      out.write("        padding: 8px;\n");
      out.write("        text-align: center;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    th {\n");
      out.write("        background-color: #f2f2f2;\n");
      out.write("    }\n");
      out.write("</style>\n");
      out.write("                \n");
      out.write("                    <tr>\n");
      out.write("                        <th colspan=\"3\" style=\"background-color:#eeeeee; text-align:center;\">게시판 글 보기</th>\n");
      out.write("                    </tr>\n");
      out.write("                </thead>\n");
      out.write("                <tbody>\n");
      out.write("                    <tr>\n");
      out.write("                        <td style=\"width:20%;\">글 제목</td>\n");
      out.write("                        <td colspan=\"2\">");
      out.print( bbs.getBbsTitle().replaceAll(" ","&nbsp;").replaceAll("<","&lt;").replaceAll(">", "&gt;").replaceAll("\n","<br>") );
      out.write("</td>                  \n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>작성자</td>\n");
      out.write("                        <td colspan=\"2\">");
      out.print( bbs.getUserID().replaceAll(" ","&nbsp;").replaceAll("<","&lt;").replaceAll(">", "&gt;").replaceAll("\n","<br>") );
      out.write("</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>작성일자</td>\n");
      out.write("                        <td colspan=\"2\">");
      out.print( bbs.getBbsDate().substring(0,11) + bbs.getBbsDate().substring(11, 13) + "시" 
                                + bbs.getBbsDate().substring(14,16) + "분"  );
      out.write("</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>내용</td>\n");
      out.write("                        <td colspan=\"2\" style=\"min-height:200px; text-align:left;\">\n");
      out.write("                        <!-- 특수문자를 제대로 출력하기위해 & 악성스크립트를 방지하기위해 -->\n");
      out.write("                        ");
 if (matchedFileName != null) { 
      out.write("\n");
      out.write("    <div class=\"row\">\n");
      out.write("        <div class=\"col-md-12\">\n");
      out.write("            <br><br>\n");
      out.write("            <img src=\"bbsUpload/");
      out.print( matchedFileName );
      out.write("\" class=\"img-fluid\" alt=\"Uploaded Image\">\n");
      out.write("            <br><br>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    ");
 } 
      out.write("\n");
      out.write("                        ");
      out.print( bbs.getBbsContent().replaceAll(" ","&nbsp;").replaceAll("<","&lt;").replaceAll(">", "&gt;").replaceAll("\n","<br>") );
      out.write("</td>    \n");
      out.write("                    </tr>\n");
      out.write("                </tbody>\n");
      out.write("            </table>\n");

    if (userID != null && userID.equals(bbs.getUserID())) {

      out.write("\n");
      out.write("<div class=\"text-center\">\n");
      out.write("<a href=\"bbs.jsp\" class=\"btn btn-primary\">📜목록</a>\n");
      out.write("    <a href=\"update.jsp?bbsID=");
      out.print(bbsID );
      out.write("\" class=\"btn btn-primary\">🛠️수정</a>\n");
      out.write("    <a href=\"deleteAction.jsp?bbsID=");
      out.print(bbsID );
      out.write("\" class=\"btn btn-primary\">✖️삭제</a>\n");
      out.write("</div>\n");

    }

      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.1.1.min.js\"></script>\n");
      out.write("<script src=\"https://stackpath.bootstrapcdn.com/bootstrap/5.0.0-alpha1/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
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
