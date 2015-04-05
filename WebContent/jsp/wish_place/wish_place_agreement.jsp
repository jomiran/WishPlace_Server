<%@ page language="java" contentType="text/html charset=UTF-8"
	pageEncoding="UTF-8" import="DAO.*" import="Entity.*"
	import="java.sql.*" import="java.util.*" import="org.json.simple.*"
	import="org.json.simple.JSONObject"
	import="org.json.simple.parser.JSONParser"%>
<%
	request.setCharacterEncoding("UTF-8");
%>
<jsp:useBean id="wish_place" class="Entity.WishPlace">
	<jsp:setProperty name="wish_place" property="num" />
	<jsp:setProperty name="wish_place" property="email" />
	<jsp:setProperty name="wish_place" property="point" />
</jsp:useBean>
<%
	WishPlaceDAO wishPlaceDao = new WishPlaceDAO();
	boolean judge = wishPlaceDao.agreement(wish_place);
	JSONObject obj = new JSONObject();
	obj.put("wish_place_agreement", judge);
	JSONArray array = new JSONArray();
	array.add(obj);
	out.print(array.toJSONString());
%>