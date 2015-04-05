package XML_Parse.sax;

import java.util.ArrayList;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import Entity.daum.DaumLocation;

public class XML_SaxParseHelper extends DefaultHandler
{

	private ArrayList<DaumLocation> list = new ArrayList<DaumLocation>();
	private DaumLocation daumLocation;
	private String position = "";
	private int totalCount = 0;
	public XML_SaxParseHelper() {}

	// 문서의 시작
	public void startDocument() throws SAXException
	{
		super.startDocument();
	}

	// 엘리먼트 시작
	public void startElement(String namespaceURI, String localName,
			String qName, Attributes attributes) throws SAXException
	{
		if (qName.equals("item"))
			daumLocation = new DaumLocation();
		else if (qName.equals(""))
			return;
		else
			position = qName;

	}

	// 엘리먼트 끝
	public void endElement(String namespaceURI, String localName, String qName)
			throws SAXException
	{
		if (qName.equals("item"))
			list.add(daumLocation);
	}
	// 텍스트 데이터
	public void characters(char ch[], int start, int length)
			throws SAXException
	{
		if (position.isEmpty())
			return;
		if (position.equals("totalCount"))
		{
			totalCount = (Integer.parseInt((new String(ch, start, length))
					.trim()));
			position = "";

		}
		else if (position.equals("newAddress"))
		{
			daumLocation.setNewAddress((new String(ch, start, length)).trim());
			position = "";
		}
		else if (position.equals("phone"))
		{
			daumLocation.setPhone((new String(ch, start, length)).trim());
			position = "";
		}
		else if (position.equals("direction"))
		{
			daumLocation.setDirection((new String(ch, start, length)).trim());
			position = "";
		}
		else if (position.equals("addressBCode"))
		{
			daumLocation
					.setAddressBCode((new String(ch, start, length)).trim());
			position = "";
		}
		else if (position.equals("title"))
		{
			daumLocation.setTitle((new String(ch, start, length)).trim());
			position = "";
		}
		else if (position.equals("zipCode"))
		{
			daumLocation.setZipCode((new String(ch, start, length)).trim());
			position = "";
		}
		else if (position.equals("placeUrl"))
		{
			daumLocation.setPlaceUrl((new String(ch, start, length)).trim());
			position = "";
		}
		else if (position.equals("category"))
		{
			daumLocation.setCategory((new String(ch, start, length)).trim());
			position = "";
		}
		else if (position.equals("id"))
		{
			daumLocation.setId(Integer.parseInt((new String(ch, start, length))
					.trim()));
			position = "";
		}
		else if (position.equals("distance"))
		{
			daumLocation.setDistance(Integer.parseInt((new String(ch, start,
					length)).trim()));
			position = "";
		}
		else if (position.equals("address"))
		{
			daumLocation.setAddress((new String(ch, start, length)).trim());
			position = "";
		}
		else if (position.equals("imageUrl"))
		{
			daumLocation.setImageUrl((new String(ch, start, length)).trim());
			position = "";
		}
		else if (position.equals("latitude"))
		{
			daumLocation.setLatitude(Float.parseFloat((new String(ch, start,
					length)).trim()));
			position = "";
		}
		else if (position.equals("longitude"))
		{
			daumLocation.setLongitude(Float.parseFloat((new String(ch, start,
					length)).trim()));
			position = "";
		}
		else
			position = "";
	}
	// 문서의 끝
	public void endDocument() throws SAXException
	{
		super.endDocument();
	}
	
	public ArrayList<DaumLocation> getList()
	{
		return list;
	}
	public int getTotalCount()
	{
		return totalCount;
	}
}
