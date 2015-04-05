package Control;

public class DistanceCalculator {
	private double  EARTH_R = 6371000.0;
	private double Rad = Math.PI/180;
	 public String calcDistance(double lat1, double lon1, double lat2, double lon2){
	     double radLat1, radLat2, radDist; 
	     double distance, ret;
	        radLat1 = Rad * lat1;
	        radLat2 = Rad * lat2;
	        radDist = Rad * (lon1 - lon2);
	        distance = Math.sin(radLat1) * Math.sin(radLat2);
	        distance = distance + Math.cos(radLat1) * Math.cos(radLat2) * Math.cos(radDist);
	        ret = EARTH_R * Math.acos(distance);
	        double rslt = Math.round(Math.round(ret) / 1000);
	        String result = rslt + " km";
	        if(rslt == 0) result = Math.round(ret) +" m";
	        return result;
	    } 

}
