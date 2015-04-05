package XML_Parse.sax;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.regex.Pattern;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.xml.sax.InputSource;

import com.sun.org.apache.xerces.internal.impl.xs.identity.Selector.Matcher;

import Entity.daum.DaumLocation;
import Entity.daum.LocationTotalInformation;
import HTML_Parser.HTML_ParserHelper;

public class SaxParser
{
	private String apiKey = "15939474e298b0da3ba8ff586d9096ec";
	private float latitude = 36.144425f;
	private float longitude = 128.393269f;
	private String code = "MT1";
	private int radius = 2000;
	private LocationTotalInformation locationTotalInformation = new LocationTotalInformation();

	public static void main(String[] args)
	{
		SaxParser saxParser = new SaxParser();
		saxParser.getAllLocalData();

	}
	public void setTotalCount(String code, int totalCount)
	{
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
			locationTotalInformation.setCulturalFacilitiesCnt(totalCount);
		else if (code.equals("AG2"))
			locationTotalInformation.setAgencyCnt(totalCount);
		else if (code.equals("PO3"))
			locationTotalInformation.setGovernmentOfficeCnt(totalCount);
		else if (code.equals("AT4"))
			locationTotalInformation.setTouristAttractionsCnt(totalCount);
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
	public void setDaumLocation(String code, ArrayList<DaumLocation> list)
	{
		if (code.equals("MT1"))
			locationTotalInformation.setMarket(list);
		else if (code.equals("CS2"))
			locationTotalInformation.setConvenienceStroe(list);
		else if (code.equals("PS3"))
			locationTotalInformation.setDaycareCenter(list);
		else if (code.equals("SC4"))
			locationTotalInformation.setSchool(list);
		else if (code.equals("AC5"))
			locationTotalInformation.setAcademy(list);
		else if (code.equals("PK6"))
			locationTotalInformation.setParking(list);
		else if (code.equals("OL7"))
			locationTotalInformation.setGasStation(list);
		else if (code.equals("SW8"))
			locationTotalInformation.setSubway(list);
		else if (code.equals("BK9"))
			locationTotalInformation.setBank(list);
		else if (code.equals("CT1"))
			locationTotalInformation.setCulturalFacilities(list);
		else if (code.equals("AG2"))
			locationTotalInformation.setAgency(list);
		else if (code.equals("PO3"))
			locationTotalInformation.setGovernmentOffice(list);
		else if (code.equals("AT4"))
			locationTotalInformation.setTouristAttractions(list);
		else if (code.equals("AD5"))
			locationTotalInformation.setAccommodation(list);
		else if (code.equals("FD6"))
			locationTotalInformation.setRestaurant(list);
		else if (code.equals("CE7"))
			locationTotalInformation.setCafe(list);
		else if (code.equals("HP8"))
			locationTotalInformation.setHospital(list);
		else if (code.equals("PM9"))
			locationTotalInformation.setPharmacy(list);
	}
	public void doIt(String code)
	{
		this.code = code;
		try
		{
			SAXParser parser = SAXParserFactory.newInstance().newSAXParser();
			String xmlStr = getXML();
			// System.out.println(xmlStr);
			
			
			InputSource is = new InputSource(new StringReader(xmlStr));
			
			XML_SaxParseHelper xml_SaxParseHelper = new XML_SaxParseHelper();
			parser.parse(is, xml_SaxParseHelper);
			setTotalCount(code, xml_SaxParseHelper.getTotalCount());
			setDaumLocation(code, xml_SaxParseHelper.getList());

		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
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

	private String getXML()
	{
		HTML_ParserHelper h_parser = new HTML_ParserHelper();
		try
		{
			String str = ("https://apis.daum.net/local/v1/search/category.xml?apiKey="
					+ apiKey
					+ "&location="
					+ String.valueOf(latitude)
					+ ","
					+ String.valueOf(longitude) + "&code=" + code + "&radius=" + String
					.valueOf(radius));
			str = h_parser.getHttpHTML(str);

			return str;

		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
		return "Error";
	}

}
