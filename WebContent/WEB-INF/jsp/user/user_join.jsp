<%@ page language="java" contentType="text/html charset=UTF-8"
	pageEncoding="UTF-8" import="DAO.*" import="Entity.*"
	import="java.sql.*" import="java.util.*" import="org.json.simple.*"
	import="org.json.simple.JSONObject"
	import="org.json.simple.parser.JSONParser"%>
<%
	request.setCharacterEncoding("UTF-8");
%><jsp:useBean id="user" class="Entity.User">
	<jsp:setProperty name="user" property="email" />
	<jsp:setProperty name="user" property="phone" />
	<jsp:setProperty name="user" property="password" />
	<jsp:setProperty name="user" property="sex" />
	<jsp:setProperty name="user" property="address" />
	<jsp:setProperty name="user" property="age" />
	<jsp:setProperty name="user" property="job" />
</jsp:useBean>
<%
	user.setPoint(1000);
	user.setAddress(user.getAddress().replace('_',' '));
	user.setDate(new java.util.Date());
	UserDAO userDao = new UserDAO();
	//boolean judge = userDao.exists(user);
	//if(judge)
	boolean	judge = userDao.insert(user);
	JSONObject obj = new JSONObject();
	obj.put("join", judge);
	JSONArray array = new JSONArray();
	array.add(obj);
	out.print(array.toJSONString());
%>