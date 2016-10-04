package eonpages;

import org.openqa.selenium.WebElement;

public class EonUserHomePage extends EonLoginPage {
	
	public static String id = "input.username";
	public static String pass = "input.password";
	public static String link = "div.eon-input-button.padlock";
	
	public EonUserHomePage login(String username,String password){
		WebElement uname = driver.findElementByCssSelector(id);
		uname.sendKeys("mamataborigam@yahoo.co.uk");
		WebElement pword = driver.findElementByCssSelector(pass);
		pword.sendKeys("Divya123");
		WebElement loginlink = driver.findElementByCssSelector(link);
		loginlink.click();
		
		return new EonUserHomePage();
	}

}
