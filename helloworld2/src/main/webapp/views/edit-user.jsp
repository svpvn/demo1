<%@page import="model.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<% User user = (User) request.getAttribute("u"); %>
	<form action="#" method="post">
		<input type="number" name="id" value="<%=user.getId()%>">
		<input type="text" name="name" value="<%=user.getName() %>">
		<input type="number" name="age" value="<%=user.getAge( )%>">
		<button type="submit">Save</button>
	</form>
</body>
</html>