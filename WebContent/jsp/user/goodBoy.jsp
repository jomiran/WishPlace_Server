<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="java.net.URLEncoder"%>
<%@ page import="java.sql.*"%>
<%@ page import="java.io.*"%>
<%@ page import="java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
   		response.setCharacterEncoding("utf-8");
		response.sendRedirect("user_join.jsp?email=a2bccc3@a.com&phone=010-8421-0105&password=123&sex=YoMan&address=우리집&birthYear=1993");
		//response.sendRedirect("user_login.jsp?email=a2bc3@a.com&password=123");
		//response.sendRedirect("deleteUser.jsp?email=a@a.com");
		//response.sendRedirect("user_update.jsp?email=abc@a.com&phone=010-8421-0101&password=123&sex=YoMan&address=우리집&age=13&job=프로그래머&point=10000");
		//response.sendRedirect("user_password_change.jsp?email=abc@a.com&password=1235");
		//response.sendRedirect("user_point_saving.jsp?email=abc@a.com&point=1000");
		
		//String s = "한글";
		//s = URLEncoder.encode(s, "UTF-8") ;
		//response.sendRedirect("response.jsp?email=abc@a.com&job="+s);
	%>
</body>
</html>