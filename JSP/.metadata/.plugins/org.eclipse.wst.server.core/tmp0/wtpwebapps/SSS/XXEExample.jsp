<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="javax.xml.parsers.*" %>
<%@ page import="org.w3c.dom.*" %>
<%@ page import="org.xml.sax.InputSource" %>
<%@ page import="java.io.*" %>
<!DOCTYPE html>
<html>
<head>
    <title>XXE Vulnerability Test</title>
</head>
<body>
<h2>XXE Vulnerability Example</h2>
<%
    try {
        String xmlFilePath = application.getRealPath("files/news_rss.xml");
        File xmlFile = new File(xmlFilePath);
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        
        // XXE 취약점 테스트를 위한 설정 활성화
        factory.setFeature("http://apache.org/xml/features/disallow-doctype-decl", false);
        factory.setFeature("http://xml.org/sax/features/external-general-entities", true);
        factory.setFeature("http://xml.org/sax/features/external-parameter-entities", true);

        DocumentBuilder builder = factory.newDocumentBuilder();
        Document doc = builder.parse(xmlFile);
        doc.getDocumentElement().normalize();

        out.println("<h3>Parsed XML Data:</h3>");
        out.println("<p>" + doc.getDocumentElement().getTextContent() + "</p>");
    } catch (Exception e) {
        out.println("<p>Error: " + e.getMessage() + "</p>");
    }
%>
</body>
</html>
