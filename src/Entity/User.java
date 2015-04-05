package Entity;

import java.io.Serializable;
import java.util.Date;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class User implements Serializable{
	private String email;
	private String phone;
	private String password;
	private String sex;
	private String address;
	private int birthYear;
	private int point;
	private Date date;
	private int type;
	
	public User(){}

	public User(String email, String phone, String password, String sex,
			String address, int birthYear,int point, Date date, int type) {
		this.email = email;
		this.phone = phone;
		this.password = password;
		this.sex = sex;
		this.address = address;
		this.setBirthYear(birthYear);
		this.point = point;
		this.date = date;
		this.setType(type);
	}
	public User(String email, String phone, String password, String sex,
			String address, int birthYear) {
		this.email = email;
		this.phone = phone;
		this.password = password;
		this.sex = sex;
		this.address = address;
		this.setBirthYear(birthYear);
		this.point = 100;
		this.date = new Date();
		this.setType(0);
	}
	
	public String getEmail() {
		return email;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	public String toJsonString()
	{
		JSONObject obj = new JSONObject();
		obj.put("email", email);
		obj.put("phone", phone);
		obj.put("password", password);
		obj.put("sex", sex);
		obj.put("address", address);
		obj.put("birthYear", birthYear);
		obj.put("point", point);
		obj.put("date", date);
		obj.put("type",type);
		
		JSONArray array = new JSONArray();
		array.add(obj);
		return array.toJSONString();
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}
}
