<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="javax.xml.parsers.*" %>
<%@ page import="org.w3c.dom.*" %>
<%@ page import="org.xml.sax.InputSource" %>
<%@ page import="java.io.StringReader" %>
<!DOCTYPE html>
<html>
<head>
    <title>XXE Vulnerability Test</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="css/bootstrap.css">
</head>
<body class="text-center">
<h2>XXE Vulnerability Example</h2>
<%
    String xmlData = request.getParameter("xmlData");
    if (xmlData != null && !xmlData.isEmpty()) {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            // 주의: XXE 취약점 발생을 위해 외부 엔티티 처리 활성화
            factory.setFeature("http://apache.org/xml/features/disallow-doctype-decl", false);
            factory.setFeature("http://xml.org/sax/features/external-general-entities", true);
            factory.setFeature("http://xml.org/sax/features/external-parameter-entities", true);
            DocumentBuilder builder = factory.newDocumentBuilder();
            InputSource is = new InputSource(new StringReader(xmlData));
            Document doc = builder.parse(is);
            doc.getDocumentElement().normalize();

            // 간단한 XML 파싱 예제
            out.println("<h3>Received XML Data:</h3>");
            out.println("<p>" + doc.getDocumentElement().getTextContent() + "</p>");
        } catch (Exception e) {
            out.println("<p>Error: " + e.getMessage() + "</p>");
        }
    }
%>
<form method="post">
    <textarea name="xmlData" rows="10" cols="30"></textarea><br>
    <input type="submit" value="Submit XML Data">
</form>

    <script src="http://code.jquery.com/jquery-3.1.1.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/5.0.0-alpha1/js/bootstrap.min.js"></script>
</body>
</html>