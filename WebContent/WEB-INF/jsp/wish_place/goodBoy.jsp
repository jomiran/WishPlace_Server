<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="java.net.URLEncoder"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		request.setCharacterEncoding("UTF-8");
		response.sendRedirect("wish_place_add.jsp?email=abc@a.com&latitude=1&longitude=3&category=3&type=a&location=복수동&content=3");
		//response.sendRedirect("wish_place_agreement.jsp?num=4&email=abc@a.com&point=4");
		//response.sendRedirect("wish_place_get_address.jsp?latitude=35.81905&longitude=127.8733");
		
	%>
</body>
</html>