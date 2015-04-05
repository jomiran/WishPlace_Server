package XML_Parse.document;

import java.io.File;
import java.io.IOException;
import java.io.StringReader;

import javax.xml.parsers.*;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import Entity.daum.DaumLocation;
import Entity.daum.LocationTotalInformation;
import HTML_Parser.HTML_ParserHelper;

/**
 * XMLParserTest
 */
public class XML_ParseHelper
{

	private String apiKey = "15939474e298b0da3ba8ff586d9096ec";
	private float latitude = 36.144425f;
	private float longitude = 128.393269f;
	private String code = "MT1";
	private int radius = 2000;

	private LocationTotalInformation locationTotalInformation = new LocationTotalInformation();

	public static void main(String[] args)
	{
		XML_ParseHelper xmlHelper = new XML_ParseHelper();
		xmlHelper.getAllLocalData();
	}
	public XML_ParseHelper() {}

	public XML_ParseHelper(float latitude, float longitude, String code,
			int radius) {
		this.latitude = latitude;
		this.longitude = longitude;
		this.code = code;
		this.radius = radius;
	}

	public void getAllLocalData()
	{
		long startTime = System.currentTimeMillis();

		doIt("MT1"); // 대형마트
		doIt("CS2"); // 편의점
		doIt("PS3"); // 어린이집, 유치원
		doIt("SC4"); // 학교
		doIt("AC5"); // 학원
		doIt("PK6"); // 주차장 -
		doIt("OL7"); // 주유소, 충전소 //
		doIt("SW8"); // 지하철 -
		doIt("BK9"); // 은행 -
		doIt("CT1"); // 문화시설 // O 18개
		doIt("AG2"); // 중개업소
		doIt("PO3"); // 공공기관 // O
		doIt("AT4"); // 관광명소 // O
		doIt("AD5"); // 숙박 //
		doIt("FD6"); // 음식점 //
		doIt("CE7"); // 카페
		doIt("HP8"); // 병원
		doIt("PM9"); // 약국

		long endTime = System.currentTimeMillis();

		long lTime = endTime - startTime;
		
		locationTotalInformation.printAllData();
		System.out.println("TIME : " + lTime + "(ms)");

	}

	public void doIt(String code)
	{

		this.code = code;
		// XML Documnet 객체 파싱받아옴
		String xmlStr = getXML();

		InputSource is = new InputSource(new StringReader(xmlStr));
		Document document = null;
		try
		{
			document = DocumentBuilderFactory.newInstance()
					.newDocumentBuilder().parse(is);
		}
		catch (SAXException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (ParserConfigurationException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// 인터넷 상의 XML 문서는 요렇게 생성하면 편리함.
		// Document document =
		// DocumentBuilderFactory.newInstance().newDocumentBuilder()
		// .parse("http://www.example.com/test.xml");

		NodeList totalCountNode = document.getElementsByTagName("totalCount");
		NodeList newAddressNode = document.getElementsByTagName("newAddress");
		NodeList phoneNode = document.getElementsByTagName("phone");
		NodeList directionNode = document.getElementsByTagName("direction");
		NodeList addressBCodeNode = document
				.getElementsByTagName("addressBCode");
		NodeList titleNode = document.getElementsByTagName("title");
		NodeList zipcodeNode = document.getElementsByTagName("zipcode");
		NodeList placeUrlNode = document.getElementsByTagName("placeUrl");
		NodeList categoryNode = document.getElementsByTagName("category");
		NodeList idNode = document.getElementsByTagName("id");
		NodeList distanceNode = document.getElementsByTagName("distance");
		NodeList addressNode = document.getElementsByTagName("address");
		NodeList imageUrlNode = document.getElementsByTagName("imageUrl");
		NodeList latitudeNode = document.getElementsByTagName("latitude");
		NodeList longitudeNode = document.getElementsByTagName("longitude");

		int i = 0;

		while (newAddressNode.item(i) != null)
		{
			Element element1, element2, element3, element4, element5, element6, element7, element8, element9, element10, element11, element12, element13, element14, element15;

			element2 = (Element) newAddressNode.item(i);
			element3 = (Element) phoneNode.item(i);
			element4 = (Element) directionNode.item(i);
			element5 = (Element) addressBCodeNode.item(i);
			element6 = (Element) titleNode.item(i);
			element7 = (Element) zipcodeNode.item(i);
			element8 = (Element) placeUrlNode.item(i);
			element9 = (Element) categoryNode.item(i);
			element10 = (Element) idNode.item(i);
			element11 = (Element) distanceNode.item(i);
			element12 = (Element) addressNode.item(i);
			element13 = (Element) imageUrlNode.item(i);
			element14 = (Element) latitudeNode.item(i);
			element15 = (Element) longitudeNode.item(i);

			String newAddress = element2.getTextContent();
			String phone = element3.getTextContent();
			String direction = element4.getTextContent();
			String addressBCode = element5.getTextContent();
			String title = element6.getTextContent();
			String zipCode = element7.getTextContent();

			String placeUrl = element8.getTextContent();
			String category = element9.getTextContent();
			int id = Integer.parseInt(element10.getTextContent());
			int distance = Integer.parseInt(element11.getTextContent());
			String address = element12.getTextContent();
			String imageUrl = element13.getTextContent();
			float latitude = Float.parseFloat(element14.getTextContent());
			float longitude = Float.parseFloat(element15.getTextContent());
			int totalCount = 0;

			DaumLocation daumLocation = new DaumLocation(newAddress, phone,
					direction, addressBCode, title, zipCode, placeUrl,
					category, id, distance, address, imageUrl, latitude,
					longitude);
			if (i == 0)
			{
				element1 = (Element) totalCountNode.item(i);
				totalCount = Integer.parseInt(element1.getTextContent());
				if (code.equals("MT1"))
					locationTotalInformation.setMarketCnt(totalCount);
				else if (code.equals("CS2"))
					locationTotalInformation.setConvenienceStroeCnt(totalCount);
				else if (code.equals("PS3"))
					locationTotalInformation.setDaycareCenterCnt(totalCount);
				else if (code.equals("SC4"))
					locationTotalInformation.setSchoolCnt(totalCount);
				else if (code.equals("AC5"))
					locationTotalInformation.setAcademyCnt(totalCount);
				else if (code.equals("PK6"))
					locationTotalInformation.setParkingCnt(totalCount);
				else if (code.equals("OL7"))
					locationTotalInformation.setGasStationCnt(totalCount);
				else if (code.equals("SW8"))
					locationTotalInformation.setSubwayCnt(totalCount);
				else if (code.equals("BK9"))
					locationTotalInformation.setBankCnt(totalCount);
				else if (code.equals("CT1"))
					locationTotalInformation
							.setCulturalFacilitiesCnt(totalCount);
				else if (code.equals("AG2"))
					locationTotalInformation.setAgencyCnt(totalCount);
				else if (code.equals("PO3"))
					locationTotalInformation.setGovernmentOfficeCnt(totalCount);
				else if (code.equals("AT4"))
					locationTotalInformation
							.setTouristAttractionsCnt(totalCount);
				else if (code.equals("AD5"))
					locationTotalInformation.setAccommodationCnt(totalCount);
				else if (code.equals("FD6"))
					locationTotalInformation.setRestaurantCnt(totalCount);
				else if (code.equals("CE7"))
					locationTotalInformation.setCafeCnt(totalCount);
				else if (code.equals("HP8"))
					locationTotalInformation.setHospitalCnt(totalCount);
				else if (code.equals("PM9"))
					locationTotalInformation.setPharmacyCnt(totalCount);

			}
			else
			{
				if (code.equals("MT1"))
					locationTotalInformation.addMarket(daumLocation);
				else if (code.equals("CS2"))
					locationTotalInformation.addConvenienceStroe(daumLocation);

				else if (code.equals("PS3"))

					locationTotalInformation.addDaycareCenter(daumLocation);

				else if (code.equals("SC4"))

					locationTotalInformation.addSchool(daumLocation);

				else if (code.equals("AC5"))
					locationTotalInformation.addAcademy(daumLocation);

				else if (code.equals("PK6"))
					locationTotalInformation.addParking(daumLocation);

				else if (code.equals("OL7"))
					locationTotalInformation.addGasStation(daumLocation);

				else if (code.equals("SW8"))
					locationTotalInformation.addSubway(daumLocation);

				else if (code.equals("BK9"))
					locationTotalInformation.addBank(daumLocation);

				else if (code.equals("CT1"))

					locationTotalInformation
							.addCulturalFacilities(daumLocation);

				else if (code.equals("AG2"))
					locationTotalInformation.addAgency(daumLocation);

				else if (code.equals("PO3"))
					locationTotalInformation.addGovernmentOffice(daumLocation);

				else if (code.equals("AT4"))

					locationTotalInformation
							.addTouristAttractions(daumLocation);

				else if (code.equals("AD5"))

					locationTotalInformation.addAccommodation(daumLocation);

				else if (code.equals("FD6"))
					locationTotalInformation.addRestaurant(daumLocation);

				else if (code.equals("CE7"))

					locationTotalInformation.addCafe(daumLocation);

				else if (code.equals("HP8"))
					locationTotalInformation.addHospital(daumLocation);

				else if (code.equals("PM9"))
					locationTotalInformation.addPharmacy(daumLocation);

			}
			i++;

			// System.out.println(daumLocation.toString());
		}

	}
	private String getXML()
	{
		HTML_ParserHelper h_parser = new HTML_ParserHelper();
		try
		{
			String str = h_parser
					.getHttpHTML("https://apis.daum.net/local/v1/search/category.xml?apiKey="
							+ apiKey
							+ "&location="
							+ String.valueOf(latitude)
							+ ","
							+ String.valueOf(longitude)
							+ "&code="
							+ code
							+ "&radius=" + String.valueOf(radius));
			return str;

		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
		return "Error";
	}

}