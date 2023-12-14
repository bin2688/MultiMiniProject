<%@page import="java.util.List"%>
<%@page import="com.multi.mini4.LoungeVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
 <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet">
 <!-- Bootstrap JS (optional) -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body bgcolor="yellow">
<%
	LoungeVO loungeVO = (LoungeVO)request.getAttribute("one");
%>
<div class="container mt-4">
    <table class="table">
        <thead>
            <tr>
                <th scope="col">게시글번호</th>
                <th scope="col">제목</th>
                <th scope="col">내용</th>
                <th scope="col">작성자</th>
                <th scope="col">작성시간</th>
            </tr>
        </thead> 
        <tbody>
            <tr>
                <td><%=loungeVO.getLounge_id()%></td>
                <td> <%=loungeVO.getLounge_title()%></td>
                <td><%=loungeVO.getLounge_content()%></td>
                <td><%=loungeVO.getLounge_writer()%></td>
                <td><%=loungeVO.getLounge_create_date()%></td>
            </tr>
        </tbody>
    </table>
<a href="list.lounge">전체목록으로</a>
<a href="lounge_update.jsp">글수정</a>
</div>
</body>
</html>