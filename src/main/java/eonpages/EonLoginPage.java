package eonpages;

public class EonLoginPage extends EonHomePage {
	protected String ltitle = "Your account - E.ON";
	
	
	public String getEonLonginPageTitle(){
		String lontitle = driver.getTitle();
		return lontitle;
	}
		

}
