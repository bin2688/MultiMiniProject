<%@page import="org.apache.ibatis.reflection.SystemMetaObject"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <% int lounge_id = Integer.parseInt(request.getParameter("lounge_id")); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>커뮤니티 글작성</title>
<script type="text/javascript" src="resources/js/jquery-3.7.1.js"></script>
<script type="text/javascript">
</script>
</head>
<body>
   <form action="update.lounge">
  				 <input type="hidden" name="lounge_id" value="<%=lounge_id%>">
		게시판종류: <input type="radio" name="lounge_type" value="R">라운지 
				 <input type="radio" name="lounge_type" value="Q">정보공유 <br>
		펫종류: 	 <input type="radio" name="lounge_pet_type" value="강아지">강아지 
			     <input type="radio" name="lounge_pet_type" value="고양이">고양이
				 <input type="radio" name="lounge_pet_type" value="기타">기타 <br>
		유저닉네임: <input type="text" name="lounge_user_id" > <br>
		제목: <input type="text" name="lounge_title" > <br>
		내용: <textarea name="lounge_content" rows="5" cols="20" ></textarea><br>
		작성자: <input type="text" name="lounge_writer"> <br>
		해시태그: <input type="text" name="lounge_hashtag">
	<button type="submit">글작성 완료</button>
	</form> 
</body>
</html>