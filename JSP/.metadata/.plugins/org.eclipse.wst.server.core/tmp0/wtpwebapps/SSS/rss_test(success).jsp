<%@ page import="javax.xml.parsers.DocumentBuilder" %>
<%@ page import="javax.xml.parsers.DocumentBuilderFactory" %>
<%@ page import="org.w3c.dom.Document" %>
<%@ page import="org.w3c.dom.Element" %>
<%@ page import="org.w3c.dom.Node" %>
<%@ page import="org.w3c.dom.NodeList" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>News RSS Feed</title>
</head>
<body>
<%
    try {
        String url = "http://www.boannews.com/media/news_rss.xml?mkind=1";
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document doc = dBuilder.parse(url);
        doc.getDocumentElement().normalize();

        NodeList nList = doc.getElementsByTagName("item");
        for (int temp = 0; temp < nList.getLength(); temp++) {
            Node nNode = nList.item(temp);
            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                Element eElement = (Element) nNode;
                String title = eElement.getElementsByTagName("title").item(0).getTextContent();
                String link = eElement.getElementsByTagName("link").item(0).getTextContent();
                String description = eElement.getElementsByTagName("description").item(0).getTextContent();
%>
                <h3><a href="<%=link%>"><%=title%></a></h3>
                <p><%=description%></p>
<%
            }
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
%>
</body>
</html>
