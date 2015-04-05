package Entity;

public class WishPlace {
	private int num;
	private String email;
	private double latitude;
	private double longitude;
	private String category;
	private String type;
	private String content;
	private String location;
	private int point;

	public WishPlace(int num, String email, double latitude, double longitude,
			String category, String type, String location,String content, int point) {
		this.num = num;
		this.email = email;
		this.latitude = latitude;
		this.longitude = longitude;
		this.category = category;
		this.type = type;
		this.location = location;
		this.content = content;
		this.point = point;
	}
	public WishPlace(String email, double latitude, double longitude,
			String category, String type, String location,String content) {
		this.email = email;
		this.latitude = latitude;
		this.longitude = longitude;
		this.category = category;
		this.type = type;
		this.location = location;
		this.content = content;
		this.point = 0;
	}
	public WishPlace(){}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
}
