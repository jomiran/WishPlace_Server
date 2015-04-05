<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="DAO.*" import="Entity.*"
	import="java.sql.*" import="java.util.*" import="org.json.simple.*"
	import="org.json.simple.JSONObject"
	import="org.json.simple.parser.JSONParser" import="java.net.URLDecoder"%>
<%
	request.setCharacterEncoding("UTF-8");
	response.setContentType("text/html; charset=UTF-8");
%>
<jsp:useBean id="user" class="Entity.User">
	<jsp:setProperty name="user" property="email" />
	<jsp:setProperty name="user" property="job" />
</jsp:useBean>

<%
	request.setCharacterEncoding("UTF-8");
	String job = request.getParameter("job"); // 선택한과제 
	job = URLDecoder.decode(job, "UTF-8");
	out.print("Email : " + user.getEmail());
	out.print("<br>");
	out.print("Job : " + job);
%>