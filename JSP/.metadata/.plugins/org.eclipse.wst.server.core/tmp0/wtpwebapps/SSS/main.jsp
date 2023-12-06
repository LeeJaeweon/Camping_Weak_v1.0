<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.io.PrintWriter" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="css/bootstrap.css">
    <title>🔥Camping🔥</title>

    <!-- 팝업 창 띄우기 함수 -->
    <script>
        function openPopup(url, width, height) {
            var popup = window.open(url, "_blank", "width=" + width + ",height=" + height);
            popup.focus();
        }

        function submitFormToXML() {
            var name = document.getElementById('name').value;
            var email = document.getElementById('email').value;
            var message = document.getElementById('message').value;
            
            // Create XML string
            var xmlString = '<inquiry><name>' + name + '</name><email>' + email + '</email><message>' + message + '</message></inquiry>';
            
            // TODO: Send this XML to the server-side for further processing
            console.log("Generated XML: ", xmlString);
        }
    </script>
</head>

<body>
    <%
        String userID = (String) session.getAttribute("userID");
    %>
    <nav class="navbar navbar-expand-lg navbar-light bg-light">
        <a class="navbar-brand" href="main.jsp" style="margin-left: 10px;">🔥Camping_Main🔥</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavDropdown" aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNavDropdown">
            <ul class="navbar-nav">
                <li class="nav-item active">
                    <a class="nav-link" href="main.jsp">🛖메인</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="bbs.jsp">📒게시판</a>
                </li>
                <%
                    if (userID == null) {
                %>
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownMenuLink" role="button" data-toggle="dropdown" aria-expanded="false">
                        접속하기
                    </a>
                    <ul class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
                        <li><a class="dropdown-item" href="login.jsp">로그인</a></li>
                        <li><a class="dropdown-item" href="join.jsp">회원가입</a></li>
                    </ul>
                </li>
                <%
                } else {
                %>
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownMenuLink" role="button" data-toggle="dropdown" aria-expanded="false">
                        ⚙️회원관리
                    </a>
                    <ul class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
                        <a href="#" class="dropdown-item" onclick="openPopup('finduser.jsp', 600, 800); return false;">🏕️유저찾기</a>
                        <a href="#" class="dropdown-item" onclick="openPopup('pingTest2.jsp', 600, 400); return false;">📡인터넷 테스트</a>
                        <li><a class="dropdown-item" href="logoutAction.jsp">🤚로그아웃</a></li>
                    </ul>
                </li>
                <%
                    }
                %>
            </ul>
        </div>
    </nav>

<!-- 메인 페이지 영역 시작 -->
<div class="container mt-5">
    <div class="jumbotron border rounded p-3">
        <div class="container text-center">
            <h1 style="font-size: 48px;">Camping with us</h1>
            <p>캠핑게시판에 오신 것을 환영합니다.</p>
            <div class="mt-4">
                <a href="DownloadServlet.jsp?file=myfile.txt" class="btn btn-primary mr-2">☎ 연락처</a>
                <a href="rss_test.jsp" class="btn btn-primary">RSS 테스트</a>
                <!-- <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#contactAdminModal">
                    관리자에게 문의하기
                </button> -->
            </div>
        </div>
    </div>
</div>





<!-- 모달 팝업 창 트리거 버튼 -->
<!-- <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#xmlModal">
    Open XML Modal
</button> -->

<!-- 모달 팝업 창 -->
<!-- <div class="modal fade" id="xmlModal" tabindex="-1" role="dialog" aria-labelledby="xmlModalLabel" aria-hidden="true">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="xmlModalLabel">XXE Vulnerability Test</h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
            </div>
            <div class="modal-body">
                <form method="post">
                    <div class="form-group">
                        <label for="xmlData">XML Data:</label>
                        <textarea name="xmlData" id="xmlData" class="form-control" rows="10" cols="30"></textarea>
                    </div>
                    <button type="submit" class="btn btn-primary">Submit XML Data</button>
                </form>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
            </div>
        </div>
    </div>
</div>

-->













    <!-- 메인페이지 사진 삽입 영역 -->
    <div class="container">
        <div class="row justify-content-center">
            <div class="row justify-content-center">
                <div id="myCarousel" class="carousel slide" data-ride="carousel">
                    <ol class="carousel-indicators">
                        <!-- <li data-target="#myCarousel" data-slide-to="1" class="active"></li>
                        <li data-target="#myCarousel" data-slide-to="2"></li>
                        <li data-target="#myCarousel" data-slide-to="3"></li> -->
                    </ol>
                    <div class="carousel-inner">
                        <div class="carousel-item active">
                            <div class="text-center">
                                <img src="images/1.gif" class="img-fluid" alt="Camping Image" style="width: 100%; height: auto;">
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>

    <script src="http://code.jquery.com/jquery-3.1.1.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/5.0.0-alpha1/js/bootstrap.min.js"></script>
</body>
</html>
