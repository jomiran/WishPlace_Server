<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="DAO.*" import="Entity.*"
	import="java.sql.*" import="java.util.*" import="org.json.simple.*"
	import="org.json.simple.JSONObject"
	import="org.json.simple.parser.JSONParser"%>
<%
	request.setCharacterEncoding("UTF-8");
%>
<jsp:useBean id="user" class="Entity.User">
	<jsp:setProperty name="user" property="email" />
	<jsp:setProperty name="user" property="phone" />
	<jsp:setProperty name="user" property="password" />
	<jsp:setProperty name="user" property="sex" />
	<jsp:setProperty name="user" property="address" />
	<jsp:setProperty name="user" property="age" />
	<jsp:setProperty name="user" property="job" />
	<jsp:setProperty name="user" property="point" />
</jsp:useBean>
<%
	UserDAO userDao = new UserDAO();
	boolean judge = userDao.update(user);
	JSONObject obj = new JSONObject();
	obj.put("update", judge);
	JSONArray array = new JSONArray();
	array.add(obj);
	out.print(array.toJSONString());
%>