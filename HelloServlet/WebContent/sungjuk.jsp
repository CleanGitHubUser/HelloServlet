<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<head>
<meta charset="UTF-8">
<title>JSP 다루기 - 성적처리</title>
</head>
<body>
<h1>JSP 다루기 - 성적처리</h1>
<form method="post" action="sungjukok.jsp">
<div>
이름 : <input type="text" name="name">
</div>
<div>
국어 : <input type="text" name="kor">
</div>
<div>
영어 : <input type="text" name="eng">
</div>
<div>
수학 : <input type="text" name="mat">
</div>
<div>
<button type="submit">
입력완료
</button>
</div>
</form>
</body>
</html>