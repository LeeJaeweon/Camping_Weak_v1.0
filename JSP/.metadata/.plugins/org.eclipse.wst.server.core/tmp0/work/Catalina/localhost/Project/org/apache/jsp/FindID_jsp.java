/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.80
 * Generated at: 2023-10-26 13:54:22 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;

public final class FindID_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes.add("java.sql.Connection");
    _jspx_imports_classes.add("java.sql.ResultSet");
    _jspx_imports_classes.add("java.sql.Statement");
    _jspx_imports_classes.add("java.sql.DriverManager");
    _jspx_imports_classes.add("java.util.ArrayList");
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
      out.write(" <!-- ResultSet import 추가 -->\n");
      out.write(" <!-- ArrayList import 추가 -->\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <style>\n");
      out.write("        body {\n");
      out.write("            font-family: Arial, sans-serif;\n");
      out.write("            background-color: #f5f5f5;\n");
      out.write("            margin: 0;\n");
      out.write("            padding: 0;\n");
      out.write("        }\n");
      out.write("        #header {\n");
      out.write("            background-color: #4285f4;\n");
      out.write("            color: white;\n");
      out.write("            text-align: center;\n");
      out.write("            padding: 1em;\n");
      out.write("        }\n");
      out.write("        #content {\n");
      out.write("            max-width: 600px;\n");
      out.write("            margin: 2em auto;\n");
      out.write("            padding: 1em;\n");
      out.write("            background-color: white;\n");
      out.write("            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);\n");
      out.write("            border-radius: 5px;\n");
      out.write("            text-align: center; /* 가운데 정렬 추가 */\n");
      out.write("        }\n");
      out.write("        h2 {\n");
      out.write("            color: #4285f4;\n");
      out.write("        }\n");
      out.write("        form {\n");
      out.write("            margin-top: 1em;\n");
      out.write("            display: flex;\n");
      out.write("        }\n");
      out.write("        input[type=\"text\"] {\n");
      out.write("            flex: 1;\n");
      out.write("            padding: 0.5em;\n");
      out.write("            border: 1px solid #ccc;\n");
      out.write("            border-radius: 3px;\n");
      out.write("        }\n");
      out.write("        input[type=\"submit\"] {\n");
      out.write("            background-color: #4285f4;\n");
      out.write("            color: white;\n");
      out.write("            border: none;\n");
      out.write("            padding: 0.5em 1em;\n");
      out.write("            border-radius: 3px;\n");
      out.write("            cursor: pointer;\n");
      out.write("        }\n");
      out.write("        ul {\n");
      out.write("            list-style-type: none;\n");
      out.write("            padding: 0;\n");
      out.write("        }\n");
      out.write("        li {\n");
      out.write("            padding: 0.5em 0;\n");
      out.write("            border-bottom: 1px solid #ddd;\n");
      out.write("        }\n");
      out.write("        p {\n");
      out.write("            color: #666;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        table {\n");
      out.write("            border-collapse: collapse;\n");
      out.write("            width: 100%;\n");
      out.write("            margin: 0 auto; /* 가운데 정렬 추가 */\n");
      out.write("        }\n");
      out.write("        th, td {\n");
      out.write("            border: 1px solid #ddd;\n");
      out.write("            padding: 8px;\n");
      out.write("            text-align: center; /* 가운데 정렬 추가 */\n");
      out.write("        }\n");
      out.write("        th {\n");
      out.write("            background-color: #f2f2f2;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("    <title>아이디 찾기</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div id=\"header\">\n");
      out.write("        <h1>아이디 찾기</h1>\n");
      out.write("    </div>\n");
      out.write("    <div id=\"content\">\n");
      out.write("        <h2>이름으로 찾기</h2>\n");
      out.write("        <form action=\"\" method=\"post\">\n");
      out.write("            <input type=\"text\" name=\"searchName\" placeholder=\"가입시 사용한 이름 입력\">\n");
      out.write("            <input type=\"submit\" value=\"검색\">\n");
      out.write("        </form>\n");
      out.write("        <hr>\n");
      out.write("        <h3>검색 결과</h3>\n");
      out.write("        \n");
      out.write("        ");
 
            String searchName = request.getParameter("searchName");
            if (searchName != null) {
                searchName = new String(searchName.getBytes("ISO-8859-1"), "UTF-8");
                Connection conn = null;
                Statement stmt = null;
                ResultSet rs = null;
                
                try {
                    String dbURL = "jdbc:mysql://localhost:3306/bbs"; 
                    String dbID = "root"; 
                    String dbPassword = "Jaeweon7018!@"; 
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    conn = DriverManager.getConnection(dbURL, dbID, dbPassword);
                    
                    ArrayList<String> userList = new ArrayList<String>();
                    String SQL = "SELECT * FROM bbs.user WHERE userName LIKE '" + searchName + "'"; 
                    stmt = conn.createStatement();
                    rs = stmt.executeQuery(SQL);
                    
                    if (rs.next()) {
                        out.println("<table>");
                        out.println("<tr><th>아이디</th><th>이메일</th></tr>");
                        
                        do {
                            String userID = rs.getString("userID");
                            String userEmail = rs.getString("userEmail");
                            out.println("<tr><td>" + userID + "</td><td>" + userEmail + "</td></tr>");
                        } while (rs.next());
                        
                        out.println("</table>");
                    } else {
                        out.println("<p>검색 결과가 없습니다.</p>");
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    try { if (rs != null) rs.close(); } catch (Exception e) { e.printStackTrace(); }
                    try { if (stmt != null) stmt.close(); } catch (Exception e) { e.printStackTrace(); }
                    try { if (conn != null) conn.close(); } catch (Exception e) { e.printStackTrace(); }
                }
            }
        
      out.write("\n");
      out.write("    </div>\n");
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
