package Entity;

public class LocationCode
{

	private String code;
	private String localName;
	public String getCode()
	{
		return code;
	}
	public void setCode(String code)
	{
		this.code = code;
	}
	public String getLocalName()
	{
		return localName;
	}
	public void setLocalName(String localName)
	{
		this.localName = localName;
	}
	
	public String[] getString()
	{
		String []array={
				"안동시, ASI|KR|KS010|ANDONG",
				"안산시, ASI|KR|KS009|ANSAN",
				"청주시, ASI|KR|KS001|CHEONGJU",
				"춘천시, ASI|KR|KS007|CHUNCHEON",
				"충주시, ASI|KR|KS001|CHUNGJU",
				"하남시, ASI|KR|KS009|HANAM",
				"익산시, ASI|KR|KS004|IKSAN",
				"강릉시, ASI|KR|KS007|KANGNUNG",
				"김해시, ASI|KR|KS011|KIMHAE",
				"군산시, ASI|KR|KS004|KUNSAN",
				"광주광역시, ASI|KR|KS008|KWANGCHU",
				"경주시, ASI|KR|KSxx010|KYONG JU",
				"마산시, ASI|KR|KS011|MASAN",
				"포항시, ASI|KR|KS010|POHANG",
				"부산광역시, ASI|KR|KS012|PUSAN",
				"수원시, ASI|KR|KS002|SUWON",
				"태백시, ASI|KR|KS007|TAEBAEK",
				"대구광역시, ASI|KR|KS002|TAEGU",
				"의정부시, ASI|KR|KS009|UIJEONGBU",
				"울산광역시, ASI|KR|KS016|ULSAN",
				"원주시, ASI|KR|KS007|WONJU",
				"여수시, ASI|KR|KS005|YOSU",
				"제주시, ASI|KR|KS003|CHEJU",
				"온양시, ASI|KR|KS002|ONYANG",
				"서울특별시, ASI|KR|KS013|SEOUL",
				"성남시, ASI|KR|KS009|SEONGNAM",
				"인천광역시, ASI|KR|KS006|INCHEON",
				"포천시, ASI|KR|KS009|POCHEON",
				"동두천시, ASI|KR|KS009|DONGDUCHEON",
				"양주시, ASI|KR|KS001|YANGJU",
				"파주시, ASI|KR|KS009|PAJU",
				"남양주시, ASI|KR|KS009|NAMYANGJU",
				"강남구, ASI|KR|KS013|Gangnam-Ku",
				"서초구, ASI|KR|KS013|Seocho",
				"구리시, ASI|KR|KS013|GURI",
				"김포시, ASI|KR|KS009|GIMPO",
				"고양시, ASI|KR|KS009|GOYANG",
				"부천시, ASI|KR|KS009|BUCHEON",
				"광명시, ASI|KR|KS009|GWANGMYEONG",
				"과천시, ASI|KR|KS009|GWACHEON",
				"안양시, ASI|KR|KS009|ANYANG",
				"의왕시, ASI|KR|KS010|UIWANG",
				"시흥시, ASI|KR|KS010|SIHEUNG",
				"군포시, ASI|KR|KS013|GUNPO",
				"용인시, ASI|KR|KS009|YONGIN",
				"오산시, ASI|KR|KS009|OSAN",
				"화성시, ASI|KR|KS009|HWASEONG",
				"평택시, ASI|KR|KS009|PYEONGTAEK",
				"안성시, ASI|KR|KS009|ANSEONG",
				"양수리, ASI|KR|KS009|YANGSU-RI",
				"송도신도시, ASI|KR|KS000|SONGDO",
				"속초시, ASI|KR|KS007|SOKCHO",
				"인제시, ASI|KR|KS007|INJE",
				"양양시, ASI|KR|KS007|YANGYANG",
				"평창시, ASI|KR|KS007|PYEONGCHANG",
				"동해시, ASI|KR|KS007|DONGHAE",
				"삼척시, ASI|KR|KS007|SAMCHEOK",
				"일산시, ASI|KR|KS007|ILSAN",
				"제천시, ASI|KR|KS001|JECHEON",
				"괴산시, ASI|KR|KS001|GOESAN",
				"서산시, ASI|KR|KS002|SEOSAN",
				"아산시, ASI|KR|KS002|ASAN",
				"천안시, ASI|KR|KS002|CHEONAN",
				"예산시, ASI|KR|KS002|YESAN",
				"공주시, ASI|KR|KS002|GONGJU",
				"보령시, ASI|KR|KS002|BORYEONG",
				"대전광역시, ASI|KR|KS015|DAEJEON",
				"논산시, ASI|KR|KS002|NONSAN",
				"태안시, ASI|KR|KS016|TAEAN",
				"울진시, ASI|KR|KS010|ULJIN",
				"영주시, ASI|KR|KS010|YEONGJU",
				"문경시, ASI|KR|KS010|MUNGYEONG",
				"예천시, ASI|KR|KS010|YECHEON",
				"영양시, ASI|KR|KS010|YEONGYANG",
				"상주시, ASI|KR|KS010|SANGJU",
				"구미시, ASI|KR|KS010|GUMI",
				"영천시, ASI|KR|KS010|YEONGCHEON",
				"경산시, ASI|KR|KS011|GYEONGSAN",
				"함양시, ASI|KR|KS011|HAMYANG",
				"합천시, ASI|KR|KS011|HABCHEON",
				"밀양시, ASI|KR|KS011|MIRYANG",
				"양산시, ASI|KR|KS011|YANGSAN",
				"함안시, ASI|KR|KS011|HAMAN",
				"진해시, ASI|KR|KS011|JINHAE",
				"진주시, ASI|KR|KS011|JINJU",
				"하동시, ASI|KR|KS011|HADONG",
				"고성시, ASI|KR|KS011|GOSEONG",
				"거제시, ASI|KR|KS011|GEOJE",
				"통영시, ASI|KR|KS005|TONGYEONG",
				"남해시, ASI|KR|KS011|NAMHAE",
				"사천시, ASI|KR|KS011|SACHEON",
				"화천군, ASI|KR|KS007|HWACHEON",
				"무주시, ASI|KR|KS004|MUJU",
				"전주시, ASI|KR|KS004|JEONJU",
				"김제시, ASI|KR|KS004|GIMJE",
				"임실시, ASI|KR|KS004|IMSIL",
				"정읍시, ASI|KR|KS004|JEONGEUP",
				"남원시, ASI|KR|KS004|NAMWON",
				"무안시, ASI|KR|KS005|MUAN",
				"나주시, ASI|KR|KS005|NAJU",
				"화순시, ASI|KR|KS005|HWASUN",
				"순천시, ASI|KR|KS005|SUNCHEON",
				"신안시, ASI|KR|KS005|SINAN",
				"보성시, ASI|KR|KS005|BOSEONG",
				"광양시, ASI|KR|KS005|GWANGYANG",
				"해남시, ASI|KR|KS005|HAENAM",
				"고흥시, ASI|KR|KS005|GOHEUNG",
				"진도시, ASI|KR|KS010|JINDO",
				"완도시, ASI|KR|KS005|WANDO",
				"목포시, ASI|KR|KS005|MOKPO",
				"서귀포시, ASI|KR|KS003|SEOGWI"};
		return array;
	}
	public static void main(String []args)
	{
		
	}
}
