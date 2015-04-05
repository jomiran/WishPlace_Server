package DAO;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import Entity.*;

public class UserDAO implements Dao {
	private Connection connection;

	// DBconnection에서 DB 주소 가져옴
	public UserDAO() {
		connection = DBconnection.getConnection();
	}

	@Override
	public boolean insert(Object x) {

		StringBuilder queryBuilder = new StringBuilder();
		try {
			queryBuilder.delete(0, queryBuilder.length());
			queryBuilder
					.append("INSERT INTO user (email, phone, password, sex, address, birth_year, point, date, type) ");
			queryBuilder.append("VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?) ");

			String query = queryBuilder.toString();
			PreparedStatement pstmt = connection.prepareStatement(query);
			pstmt.setString(1, ((User) x).getEmail());
			pstmt.setString(2, ((User) x).getPhone());
			pstmt.setString(3, ((User) x).getPassword());
			pstmt.setString(4, ((User) x).getSex());
			pstmt.setString(5, ((User) x).getAddress());
			pstmt.setInt(6, ((User) x).getBirthYear());
			pstmt.setInt(7, ((User) x).getPoint());
			pstmt.setDate(8, new java.sql.Date(((User) x).getDate().getTime()));
			pstmt.setInt(9, ((User) x).getType());
			pstmt.executeUpdate();
			pstmt.close();
		} catch (SQLException e) {
			System.out.println("SQL Exception Error : " + e.getMessage());
			e.printStackTrace();
			return false;
		}

		return true;
	}

	@Override
	public List getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List getList(Object condition) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean update(Object x) {
		StringBuilder queryBuilder = new StringBuilder();
		int n = -1;
		try {
			queryBuilder.delete(0, queryBuilder.length());
			queryBuilder
					.append("update user set email =? , phone = ?, password = ?, sex = ?, "
							+ "address = ?, birth_year = ?, point = ?, type = ?");
			String query = queryBuilder.toString();
			PreparedStatement pstmt = connection.prepareStatement(query);
			pstmt.setString(1, ((User) x).getEmail());
			pstmt.setString(2, ((User) x).getPhone());
			pstmt.setString(3, ((User) x).getPassword());
			pstmt.setString(4, ((User) x).getSex());
			pstmt.setString(5, ((User) x).getAddress());
			pstmt.setInt(6, ((User) x).getBirthYear());
			pstmt.setInt(7, ((User) x).getPoint());
			pstmt.setInt(8, ((User) x).getType());
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

		User user = null;
		try {
			String sqlQuery = "SELECT * FROM user where email = \""
					+ ((User) id).getEmail() + "\"and password = \""
					+ ((User) id).getPassword() + "\"";

			PreparedStatement pstmt = connection.prepareStatement(sqlQuery);
			ResultSet result = pstmt.executeQuery();
			while (result.next()) {
				String email = result.getString("email");
				String phone = result.getString("phone");
				String password = result.getString("password");
				String address = result.getString("address");
				String sex = result.getString("sex");
				int birthYear = result.getInt("birth_year");
				int point = result.getInt("point");
				Date date = new Date(result.getDate("date").getTime());
				int type = result.getInt("type");
				user = new User(email, phone, password, address, sex,
						birthYear, point, date, type);

			}
			result.close();
			pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return user;
	}

	public boolean chancePassword(Object x) {
		StringBuilder queryBuilder = new StringBuilder();
		int n = -1;
		try {
			queryBuilder.delete(0, queryBuilder.length());
			queryBuilder.append("update user set password = ? where email = ?");
			String query = queryBuilder.toString();
			PreparedStatement pstmt = connection.prepareStatement(query);
			pstmt.setString(1, ((User) x).getPassword());
			pstmt.setString(2, ((User) x).getEmail());
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

	public boolean updateUserInfo(Object x) {
		StringBuilder queryBuilder = new StringBuilder();
		int n = -1;
		try {
			queryBuilder.delete(0, queryBuilder.length());
			queryBuilder.append("update user set "
					+ "address = ?, birth_year = ?, type = ? where email = ?");
			String query = queryBuilder.toString();
			PreparedStatement pstmt = connection.prepareStatement(query);
			pstmt.setString(1, ((User) x).getAddress());
			pstmt.setInt(2, ((User) x).getBirthYear());
			pstmt.setInt(3, ((User) x).getType());
			pstmt.setString(4, ((User) x).getEmail());
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

	public boolean pointSaving(Object x) {
		StringBuilder queryBuilder = new StringBuilder();
		int n = -1;
		try {
			queryBuilder.delete(0, queryBuilder.length());
			queryBuilder.append("update user set point = ? where email = ?");
			String query = queryBuilder.toString();
			PreparedStatement pstmt = connection.prepareStatement(query);
			pstmt.setInt(1, ((User) x).getPoint());
			pstmt.setString(2, ((User) x).getEmail());
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
	public boolean delete(Object id) {
		int n = -1;
		try {
			String sqlQuery = "delete from user where email =?";
			PreparedStatement pstmt = connection.prepareStatement(sqlQuery);
			pstmt.setString(1, ((User) id).getEmail());
			// pstmt.setString(2, ((User) id).getPassword());
			n = pstmt.executeUpdate();
			pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		if (n <= 0)
			return false;
		else
			return true;
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
		User user = null;
		try {
			String sqlQuery = "SELECT * FROM user where phone = \""
					+ ((User) id).getPhone() + "\"";
			PreparedStatement pstmt = connection.prepareStatement(sqlQuery);
			ResultSet result = pstmt.executeQuery();
			while (result.next()) {
				String email = result.getString("email");
				String phone = result.getString("phone");
				String password = result.getString("password");
				String address = result.getString("address");
				String sex = result.getString("sex");
				int birthYear = result.getInt("birth_year");
				int point = result.getInt("point");
				Date date = new Date(result.getDate("date").getTime());
				int type = result.getInt("type");
				user = new User(email, phone, password, address, sex,
						birthYear, point, date, type);
			}
			result.close();
			pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		if (user == null)
			return false;
		else
			return true;
	}
}
