package DAO;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Entity.*;

public class WishPlaceDAO implements Dao{
	private Connection connection;

	// DBconnection에서 DB 주소 가져옴
	public WishPlaceDAO() {
		connection = DBconnection.getConnection();
	}

	@Override
	public boolean insert(Object x) {
		// TODO Auto-generated method stub

		StringBuilder queryBuilder = new StringBuilder();
		try {
			queryBuilder.delete(0, queryBuilder.length());
			queryBuilder
					.append("INSERT INTO wish_place (email, latitude, longitude, category, type, location, content, point) ");
			queryBuilder.append("VALUES (?, ?, ?, ?, ?, ?, ?,?) ");

			String query = queryBuilder.toString();
			PreparedStatement pstmt = connection.prepareStatement(query);
			pstmt.setString(1, ((WishPlace) x).getEmail());
			pstmt.setDouble(2, ((WishPlace) x).getLatitude());
			pstmt.setDouble(3, ((WishPlace) x).getLongitude());
			pstmt.setString(4, ((WishPlace) x).getCategory());
			pstmt.setString(5, ((WishPlace) x).getType());
			pstmt.setString(6, ((WishPlace) x).getLocation());
			pstmt.setString(7, ((WishPlace) x).getContent());
			pstmt.setInt(8, ((WishPlace) x).getPoint());
			pstmt.executeUpdate();
			pstmt.close();
		} catch (SQLException e) {
			System.out.println("SQL Exception Error : " + e.getMessage());
			e.printStackTrace();
			return false;
		}

		return true;
	}

	public boolean agreement(Object x)
	{
		StringBuilder queryBuilder = new StringBuilder();
		int n = -1;
		try {
			queryBuilder.delete(0, queryBuilder.length());
			queryBuilder
					.append("update wish_place set point = ? where num = ?");
			String query = queryBuilder.toString();
			PreparedStatement pstmt = connection.prepareStatement(query);
			pstmt.setInt(1, ((WishPlace) x).getPoint());
			pstmt.setInt(2, ((WishPlace) x).getNum());
			n = pstmt.executeUpdate();
			pstmt.close();
		} catch (SQLException e) {
			System.out.println("SQL Exception Error : " + e.getMessage());
			e.printStackTrace();
			return false;
		}

		if (n < 0)
			return false;
		else
			return true;
	}
	@Override
	public Object select(Serializable id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List getAll() {
		ArrayList<WishPlace> list = new ArrayList<WishPlace>();
		 try
	      {
	         String sqlQuery = "select * from wish_place;";
	         PreparedStatement pstmt = connection.prepareStatement(sqlQuery);
	         ResultSet result = pstmt.executeQuery();
	         while(result.next())
	         {
	            int num = result.getInt("num");
	            String email = result.getString("email");
	            double latitude = result.getDouble("latitude");
	            double longitude = result.getDouble("longitude");
	            String category = result.getString("category");
	            String type = result.getString("type");
	            String content = result.getString("content");
	            String location = result.getString("location");
	            int point = result.getInt("point");
	            
	            list.add(new WishPlace(num,email,latitude,longitude,category,type,location,content,point));
	        
	         }
	         result.close();
	         pstmt.close();
	      }
	      catch(SQLException e)
	      {
	         e.printStackTrace();
	      }
		return list;
	}

	@Override
	public List getList(Object condition) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean update(Object t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Object t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void deleteById(Serializable id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean exists(Serializable id) {
		// TODO Auto-generated method stub
		return false;
	}

}
