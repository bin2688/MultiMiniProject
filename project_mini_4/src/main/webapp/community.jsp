<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>커뮤니티</title>
<script src="https://code.jquery.com/jquery-3.7.1.js" integrity="sha256-eKhayi8LEQwp4NKxN+CfCh+3qOVUtJn3QNZ0TciWLP4=" crossorigin="anonymous"></script>
<script type="text/javascript">
$(function() {
    $('#b1').click(function() {
		$.ajax({
			url: "list.lounge",
			success: function(result) {
				$('#result').html(result);
			}//success
		})//ajax
	})//b1	

})//$
</script>
</head>
<body>
	
 <button id="b1">전체글</button>
 <button id="b2">라운지글</button>
 <button id="b3">정보공유글</button>

 <hr>
 <div id="result"></div>
</body>
</html>