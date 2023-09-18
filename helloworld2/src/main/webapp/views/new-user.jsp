<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="/helloworld2/user/new" method="post">
		<input type="number" name="id">
		<input type="text" name="name">
		<input type="number" name="age">
		<button type="submit">Save</button>
	</form>
</body>
</html>