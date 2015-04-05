<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="DAO.*" import="Entity.*"
	import="java.util.*" import="org.json.simple.*"
	import="org.json.simple.JSONObject"
	import="org.json.simple.parser.JSONParser"%>
<%
	request.setCharacterEncoding("UTF-8");
%>
<jsp:useBean id="user" class="Entity.User">
	<jsp:setProperty name="user" property="email" />
	<jsp:setProperty name="user" property="password" /></jsp:useBean>
<%
	UserDAO userDao = new UserDAO();
	user = (User)userDao.select(user);
	JSONObject obj = new JSONObject();
	if(user==null)
		obj.put("login", "false");
	else
		obj.put("login", "true");
	JSONArray array = new JSONArray();
	array.add(obj);
	out.print(array.toJSONString());
%>