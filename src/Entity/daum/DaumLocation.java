package Entity.daum;

public class DaumLocation {
	private String newAddress;
	private String phone;
	private String direction;
	private String addressBCode;
	private String title;
	private String zipCode;
	private String placeUrl;
	private String category;
	private int id;
	private int distance;
	private String address;
	private String imageUrl;
	private float latitude;
	private float longitude;

	public DaumLocation(){}
	public DaumLocation(String newAddress, String phone, String direction,
			String addressBCode, String title, String zipCode, String placeUrl, String category,
			int id, int distance, String address, String imageUrl,
			float latitude, float longitude) {
		this.newAddress = newAddress;
		this.phone = phone;
		this.direction = direction;
		this.addressBCode = addressBCode;
		this.title = title;
		this.zipCode = zipCode;
		this.placeUrl = placeUrl;
		this.category = category;
		this.id = id;
		this.distance = distance;
		this.address = address;
		this.imageUrl = imageUrl;
		this.latitude = latitude;
		this.longitude =longitude;

	}

	public String getNewAddress() {
		return newAddress;
	}

	public void setNewAddress(String newAddress) {
		this.newAddress = newAddress;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getDirection() {
		return direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}

	public String getAddressBCode() {
		return addressBCode;
	}

	public void setAddressBCode(String addressBCode) {
		this.addressBCode = addressBCode;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPlaceUrl() {
		return placeUrl;
	}

	public void setPlaceUrl(String placeUrl) {
		this.placeUrl = placeUrl;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public float getLatitude() {
		return latitude;
	}

	public void setLatitude(float latitude) {
		this.latitude = latitude;
	}

	public float getLongitude() {
		return longitude;
	}

	public void setLongitude(float longitude) {
		this.longitude = longitude;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public String toString()
	{
		String s = "newADdress : "  + newAddress +"\n";
		s+="phone : " + phone +"\n";
		s+="direction : "+ direction +"\n";
		s+="addressBcode : "+addressBCode+"\n";
		s+="title : " + title +"\n";
		s+="zipCode : "+zipCode+"\n";
		s+="placeUrl : "+placeUrl+"\n";
		s+="category : "+category+"\n";
		s+="id : "+id+"\n";
		s+="distance : "+direction+"\n";
		s+="address : "+address +"\n";
		s+="imageUrl : " + imageUrl + "\n";
		s+= "latitude : " + latitude +"\n";
		s+="longitude : " + longitude +"\n";
		
		return s;
	}
}
