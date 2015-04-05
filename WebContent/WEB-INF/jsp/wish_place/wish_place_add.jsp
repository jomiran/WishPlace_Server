<%@ page language="java" contentType="text/html charset=UTF-8"
	pageEncoding="UTF-8" import="DAO.*" import="Entity.*"
	import="java.sql.*" import="java.util.*" import="org.json.simple.*"
	import="org.json.simple.JSONObject"
	import="org.json.simple.parser.JSONParser"%>
<%
	request.setCharacterEncoding("UTF-8");
%>
<jsp:useBean id="wish_place" class="Entity.WishPlace">
	<jsp:setProperty name="wish_place" property="email" />
	<jsp:setProperty name="wish_place" property="latitude" />
	<jsp:setProperty name="wish_place" property="longitude" />
	<jsp:setProperty name="wish_place" property="category" />
	<jsp:setProperty name="wish_place" property="type" />
	<jsp:setProperty name="wish_place" property="location" />
	<jsp:setProperty name="wish_place" property="content" />
</jsp:useBean>
<%
	wish_place.setPoint(0);
	WishPlaceDAO wishPlaceDao = new WishPlaceDAO();
	boolean judge = wishPlaceDao.insert(wish_place);
	JSONObject obj = new JSONObject();
	obj.put("wish_place_add", judge);
	JSONArray array = new JSONArray();
	array.add(obj);
	out.print(array.toJSONString());
%>