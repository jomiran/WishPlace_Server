package Json_Parser;

import Entity.daum.DaumAddress;
import HTML_Parser.HTML_ParserHelper;

public class JSON_Parser_Daum_Address
{
	private String html = "http://apis.daum.net/local/geo/coord2addr?apikey=DAUM_LOCAL_DEMO_APIKEY&format=simple&output=xml&inputCoordSystem=WGS84";
	private double latitude;
	private double longitude;
	public JSON_Parser_Daum_Address(double latitude,double longitude) {
		this.latitude = latitude;
		this.longitude = longitude;
		html+="&latitude="+latitude;
		html+="&longitude="+longitude;
	}
	private String getJSON()
	{
		HTML_ParserHelper h_parser = new HTML_ParserHelper();
		try
		{
			String str = h_parser
					.getHttpHTML(html);
			return str;

		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
		return "Error";
	}
	
	public DaumAddress getDaumAddress()
	{
		DaumAddress daumAddress = new DaumAddress();
		String jsonStr = getJSON();
		
		return daumAddress;
	}
	public static void main(String []args)
	{
		JSON_Parser_Daum_Address json = new JSON_Parser_Daum_Address(36.1472618,128.3936118);
		
		
	}
}
