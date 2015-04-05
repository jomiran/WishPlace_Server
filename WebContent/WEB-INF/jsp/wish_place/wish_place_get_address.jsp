<%@ page language="java" contentType="text/html charset=UTF-8"
	pageEncoding="UTF-8" import="DAO.*" import="Entity.*"
	import="java.sql.*" import="java.util.*" import="org.json.simple.*"
	import="org.json.simple.JSONObject"
	import="org.json.simple.parser.JSONParser" import="HTML_Parser.*"%>
<%
	request.setCharacterEncoding("UTF-8");
%>
<jsp:useBean id="wish_place" class="Entity.WishPlace">
	<jsp:setProperty name="wish_place" property="latitude" />
	<jsp:setProperty name="wish_place" property="longitude" />
</jsp:useBean>
<%
	HTML_ParserHelper h_parser = new HTML_ParserHelper();
	try {
		String str = h_parser
				.getHttpHTML("http://maps.googleapis.com/maps/api/geocode/json?language=ko&latlng="
						+ wish_place.getLatitude()
						+ ","
						+ wish_place.getLongitude()
						+ "&sensor=true_or_false");
		JSONParser parser = new JSONParser();
		Object obj = parser.parse(str);
		JSONObject jsonObject = (JSONObject) obj;
		JSONArray array = (JSONArray) jsonObject.get("results");
		jsonObject = (JSONObject) array.get(0);
		String result = (String) jsonObject.get("formatted_address");
		out.print(result);
	} catch (Exception e) {
		out.println(e.getMessage());
	}
%>