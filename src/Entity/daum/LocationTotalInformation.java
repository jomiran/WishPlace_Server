package Entity.daum;

import java.util.ArrayList;
import java.util.List;

import com.sun.corba.se.spi.ior.MakeImmutable;

public class LocationTotalInformation {
	private List<DaumLocation> market = new ArrayList<DaumLocation>(); // 대형마
	private int marketCnt;
	private List<DaumLocation> convenienceStroe = new ArrayList<DaumLocation>() ; // 편의
	private int convenienceStroeCnt;
	private List<DaumLocation> daycareCenter = new ArrayList<DaumLocation>(); // 어린이집, 유치
	private int daycareCenterCnt;
	private List<DaumLocation> school = new ArrayList<DaumLocation>(); // 학교
	private int schoolCnt;
	private List<DaumLocation> academy= new ArrayList<DaumLocation>(); // 학원 
	private int academyCnt;
	private List<DaumLocation> parking= new ArrayList<DaumLocation>(); // 주차장 
	private int parkingCnt;
	private List<DaumLocation> gasStation= new ArrayList<DaumLocation>(); //주유소 
	private int gasStationCnt;
	private List<DaumLocation> subway= new ArrayList<DaumLocation>(); //지하철 
	private int subwayCnt;
	private List<DaumLocation> bank= new ArrayList<DaumLocation>(); // 은
	private int bankCnt;
	private List<DaumLocation> culturalFacilities= new ArrayList<DaumLocation>(); // 문화시설 
	private int culturalFacilitiesCnt;
	private List<DaumLocation> agency= new ArrayList<DaumLocation>(); // 중개업소 
	private int agencyCnt;
	private List<DaumLocation> governmentOffice= new ArrayList<DaumLocation>(); // 공공기관 
	private int governmentOfficeCnt;
	private List<DaumLocation> touristAttractions= new ArrayList<DaumLocation>(); // 관광명소 
	private int touristAttractionsCnt;
	private List<DaumLocation> accommodation= new ArrayList<DaumLocation>(); // 숙박 
	private int accommodationCnt;
	private List<DaumLocation> restaurant= new ArrayList<DaumLocation>(); // 음식점 
	private int restaurantCnt;
	private List<DaumLocation> cafe= new ArrayList<DaumLocation>(); // 카페 
	private int cafeCnt;
	private List<DaumLocation> hospital= new ArrayList<DaumLocation>(); // 병원 
	private int hospitalCnt;
	private List<DaumLocation> pharmacy= new ArrayList<DaumLocation>(); // 약국 
	private int pharmacyCnt;
	public List<DaumLocation> getMarket() {
		
		return market;
	}
	public void setMarket(List<DaumLocation> market) {
		this.market = market;
	}
	public List<DaumLocation> getConvenienceStroe() {
		return convenienceStroe;
	}
	public void setConvenienceStroe(List<DaumLocation> convenienceStroe) {
		this.convenienceStroe = convenienceStroe;
	}
	public List<DaumLocation> getDaycareCenter() {
		return daycareCenter;
	}
	public void setDaycareCenter(List<DaumLocation> daycareCenter) {
		this.daycareCenter = daycareCenter;
	}
	public List<DaumLocation> getSchool() {
		return school;
	}
	public void setSchool(List<DaumLocation> school) {
		this.school = school;
	}
	public List<DaumLocation> getAcademy() {
		return academy;
	}
	public void setAcademy(List<DaumLocation> academy) {
		this.academy = academy;
	}
	public List<DaumLocation> getParking() {
		return parking;
	}
	public void setParking(List<DaumLocation> parking) {
		this.parking = parking;
	}
	public List<DaumLocation> getGasStation() {
		return gasStation;
	}
	public void setGasStation(List<DaumLocation> gasStation) {
		this.gasStation = gasStation;
	}
	public List<DaumLocation> getSubway() {
		return subway;
	}
	public void setSubway(List<DaumLocation> subway) {
		this.subway = subway;
	}
	public List<DaumLocation> getBank() {
		return bank;
	}
	public void setBank(List<DaumLocation> bank) {
		this.bank = bank;
	}
	public List<DaumLocation> getCulturalFacilities() {
		return culturalFacilities;
	}
	public void setCulturalFacilities(List<DaumLocation> culturalFacilities) {
		this.culturalFacilities = culturalFacilities;
	}
	public List<DaumLocation> getAgency() {
		return agency;
	}
	public void setAgency(List<DaumLocation> agency) {
		this.agency = agency;
	}
	public List<DaumLocation> getGovernmentOffice() {
		return governmentOffice;
	}
	public void setGovernmentOffice(List<DaumLocation> governmentOffice) {
		this.governmentOffice = governmentOffice;
	}
	public List<DaumLocation> getTouristAttractions() {
		return touristAttractions;
	}
	public void setTouristAttractions(List<DaumLocation> touristAttractions) {
		this.touristAttractions = touristAttractions;
	}
	public List<DaumLocation> getAccommodation() {
		return accommodation;
	}
	public void setAccommodation(List<DaumLocation> accommodation) {
		this.accommodation = accommodation;
	}
	public List<DaumLocation> getRestaurant() {
		return restaurant;
	}
	public void setRestaurant(List<DaumLocation> restaurant) {
		this.restaurant = restaurant;
	}
	public List<DaumLocation> getCafe() {
		return cafe;
	}
	public void setCafe(List<DaumLocation> cafe) {
		this.cafe = cafe;
	}
	public List<DaumLocation> getHospital() {
		return hospital;
	}
	public void setHospital(List<DaumLocation> hospital) {
		this.hospital = hospital;
	}
	public List<DaumLocation> getPharmacy() {
		return pharmacy;
	}
	public void setPharmacy(List<DaumLocation> pharmacy) {
		this.pharmacy = pharmacy;
	}
	public int getMarketCnt() {
		return marketCnt;
	}
	public void setMarketCnt(int marketCnt) {
		this.marketCnt = marketCnt;
	}
	public int getConvenienceStroeCnt() {
		return convenienceStroeCnt;
	}
	public void setConvenienceStroeCnt(int convenienceStroeCnt) {
		this.convenienceStroeCnt = convenienceStroeCnt;
	}
	public int getDaycareCenterCnt() {
		return daycareCenterCnt;
	}
	public void setDaycareCenterCnt(int daycareCenterCnt) {
		this.daycareCenterCnt = daycareCenterCnt;
	}
	public int getSchoolCnt() {
		return schoolCnt;
	}
	public void setSchoolCnt(int schoolCnt) {
		this.schoolCnt = schoolCnt;
	}
	public int getAcademyCnt() {
		return academyCnt;
	}
	public void setAcademyCnt(int academyCnt) {
		this.academyCnt = academyCnt;
	}
	public int getParkingCnt() {
		return parkingCnt;
	}
	public void setParkingCnt(int parkingCnt) {
		this.parkingCnt = parkingCnt;
	}
	public int getGasStationCnt() {
		return gasStationCnt;
	}
	public void setGasStationCnt(int gasStationCnt) {
		this.gasStationCnt = gasStationCnt;
	}
	public int getSubwayCnt() {
		return subwayCnt;
	}
	public void setSubwayCnt(int subwayCnt) {
		this.subwayCnt = subwayCnt;
	}
	public int getBankCnt() {
		return bankCnt;
	}
	public void setBankCnt(int bankCnt) {
		this.bankCnt = bankCnt;
	}
	public int getCulturalFacilitiesCnt() {
		return culturalFacilitiesCnt;
	}
	public void setCulturalFacilitiesCnt(int culturalFacilitiesCnt) {
		this.culturalFacilitiesCnt = culturalFacilitiesCnt;
	}
	public int getAgencyCnt() {
		return agencyCnt;
	}
	public void setAgencyCnt(int agencyCnt) {
		this.agencyCnt = agencyCnt;
	}
	public int getGovernmentOfficeCnt() {
		return governmentOfficeCnt;
	}
	public void setGovernmentOfficeCnt(int governmentOfficeCnt) {
		this.governmentOfficeCnt = governmentOfficeCnt;
	}
	public int getTouristAttractionsCnt() {
		return touristAttractionsCnt;
	}
	public void setTouristAttractionsCnt(int touristAttractionsCnt) {
		this.touristAttractionsCnt = touristAttractionsCnt;
	}
	public int getAccommodationCnt() {
		return accommodationCnt;
	}
	public void setAccommodationCnt(int accommodationCnt) {
		this.accommodationCnt = accommodationCnt;
	}
	public int getRestaurantCnt() {
		return restaurantCnt;
	}
	public void setRestaurantCnt(int restaurantCnt) {
		this.restaurantCnt = restaurantCnt;
	}
	public int getCafeCnt() {
		return cafeCnt;
	}
	public void setCafeCnt(int cafeCnt) {
		this.cafeCnt = cafeCnt;
	}
	public int getHospitalCnt() {
		return hospitalCnt;
	}
	public void setHospitalCnt(int hospitalCnt) {
		this.hospitalCnt = hospitalCnt;
	}
	public int getPharmacyCnt() {
		return pharmacyCnt;
	}
	public void setPharmacyCnt(int pharmacyCnt) {
		this.pharmacyCnt = pharmacyCnt;
	}
	
	public void addMarket(DaumLocation market)
	{
		this.market.add(market);
	}
	public void addConvenienceStroe(DaumLocation convenienceStroe)
	{
		this.convenienceStroe.add(convenienceStroe);
	}
	public void addDaycareCenter(DaumLocation daycareCenter)
	{
		this.daycareCenter.add(daycareCenter);
	}
	public void addSchool(DaumLocation school)
	{
		this.school.add(school);
		
	}
	public void addAcademy(DaumLocation academy)
	{
		this.academy.add(academy);
	}
	public void addParking(DaumLocation parking)
	{
		this.parking.add(parking);
	}
	public void addGasStation(DaumLocation gasStation)
	{
		this.gasStation.add(gasStation);
	}
	
	public void addSubway(DaumLocation subway)
	{
		this.subway.add(subway);
	}
	public void addBank(DaumLocation bank)
	{
		this.bank.add(bank);
	}
	public void addCulturalFacilities(DaumLocation culturalFacilities)
	{
		this.culturalFacilities.add(culturalFacilities);
	}
	public void addAgency(DaumLocation agency)
	{
		this.agency.add(agency);
	}
	public void addGovernmentOffice(DaumLocation govermentOffice)
	{
		this.governmentOffice.add(govermentOffice);
	}
	public void addTouristAttractions(DaumLocation touristAttractions)
	{
		this.touristAttractions.add(touristAttractions);
	}
	public void addAccommodation(DaumLocation accomDaumLocation)
	{
		this.accommodation.add(accomDaumLocation);
	}
	public void addRestaurant(DaumLocation restaurant)
	{
		this.restaurant.add(restaurant);
	}
	public void addCafe(DaumLocation cafe)
	{
		this.cafe.add(cafe);
	}
	public void addHospital(DaumLocation hospital)
	{
		this.hospital.add(hospital);
	}
	public void addPharmacy(DaumLocation pharmacy)
	{
		this.pharmacy.add(pharmacy);
	}
	public void printAllData()
	{
		System.out.println("market Cnt : " + marketCnt);
		for(DaumLocation tmp:market)
			System.out.println(tmp);

		System.out.println("convenienceStroe Cnt : " + convenienceStroeCnt);
		for(DaumLocation tmp:convenienceStroe)
			System.out.println(tmp);

		System.out.println("daycareCenter Cnt : " + daycareCenterCnt);
		for(DaumLocation tmp:daycareCenter)
			System.out.println(tmp);

		System.out.println("school Cnt : " + schoolCnt);
		for(DaumLocation tmp:school)
			System.out.println(tmp);

		System.out.println("academy Cnt : " + academyCnt);
		for(DaumLocation tmp:academy)
			System.out.println(tmp);

		System.out.println("parking Cnt : " + parkingCnt);
		for(DaumLocation tmp:parking)
			System.out.println(tmp);

		System.out.println("gasStation Cnt : " + gasStationCnt);
		for(DaumLocation tmp:gasStation)
			System.out.println(tmp);

		System.out.println("subway Cnt : " + subwayCnt);
		for(DaumLocation tmp:subway)
			System.out.println(tmp);

		System.out.println("bank Cnt : " + bankCnt);
		for(DaumLocation tmp:bank)
			System.out.println(tmp);

		System.out.println("culturalFacilities Cnt : " + culturalFacilitiesCnt);
		for(DaumLocation tmp:culturalFacilities)
			System.out.println(tmp);

		System.out.println("agency Cnt : " + agencyCnt);
		for(DaumLocation tmp:agency)
			System.out.println(tmp);

		System.out.println("governmentOffice Cnt : " + governmentOfficeCnt);
		for(DaumLocation tmp:governmentOffice)
			System.out.println(tmp);

		System.out.println("touristAttractions Cnt : " + touristAttractionsCnt);
		for(DaumLocation tmp:touristAttractions)
			System.out.println(tmp);

		System.out.println("accommodation Cnt : " + accommodationCnt);
		for(DaumLocation tmp:accommodation)
			System.out.println(tmp);

		System.out.println("restaurant Cnt : " + restaurantCnt);
		for(DaumLocation tmp:restaurant)
			System.out.println(tmp);
		
		System.out.println("cafe Cnt : " + cafeCnt);
		for(DaumLocation tmp:cafe)
			System.out.println(tmp);
		
		System.out.println("hospital Cnt : " + hospitalCnt);
		for(DaumLocation tmp:hospital)
			System.out.println(tmp);
		
		System.out.println("pharmacy Cnt : " + pharmacyCnt);
		for(DaumLocation tmp:pharmacy)
			System.out.println(tmp);
		
	}
}
