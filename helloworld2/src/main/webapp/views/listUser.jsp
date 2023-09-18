<%@page import="model.User"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<% List<User> users= (List<User>) request.getAttribute("listUser"); %>
	<h1>asds</h1>
	<ul>
		<%for (User user:users){ %>
		<li ><%=user.getId() %></li>
		<li ><%=user.getName() %></li>
		<li ><%=user.getAge() %></li>
		<a href="/helloworld2/user/edit?id=<%=user.getId() %>">Edit</a>
		<%} %>
	</ul>
</body>
</html>