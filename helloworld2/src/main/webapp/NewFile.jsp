<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>Nammmmm</h2>
	<% String i="asdsad" ;
		int x=10;
		Object obj=request.getAttribute("msg");
		int a = (int) obj;
	%>
	<%=i %>
	<p><%=x %> </p>
	<p><%=a %></p>
</body>
</html>