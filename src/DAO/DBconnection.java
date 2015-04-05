package DAO;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBconnection {
	public static Connection getConnection() {
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");

			  String DB_URL = "jdbc:mysql://localhost:8889/WishPlace" +
			  "?useUnicode=true&characterEncoding=UTF-8";
			  
			  String DB_USER = "root"; 
			  String DB_PASSWORD = "123000";
			 
			con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Connect Error : " +  e.getMessage());
		}
		return con;
	}
	public static void main(String [] args)
	{
		Connection con = getConnection();
		System.out.println(con);
	}
}