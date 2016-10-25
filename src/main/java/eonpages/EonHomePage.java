package eonpages;

import org.openqa.selenium.WebElement;

import com.sample.testing.Driver;

public class EonHomePage extends Driver {
	
	String eonurl = "https://www.eonenergy.com/for-your-home";
	protected String title = "Home Energy Supplier - Gas & Electricity Suppliers - E.ON";
	
	public EonHomePage getEonHomePage(){
		driver.get(eonurl);
		return new EonHomePage();
		}
	
	public String getTitle(){
		return driver. getTitle();
		
		}
	
	public EonRegisterPage goToEonRegisterPage(){
		WebElement rlink = driver.findElementByLinkText("Register");
		rlink.click();
		return new EonRegisterPage();
		}
	
	public EonLoginPage goToEonLoginPage(){
		WebElement llink = driver.findElementByLinkText("Login");
		llink.click();
		return new EonLoginPage();
		}
	
	/*public boolean loginLinkDisplayed(){
		WebElement login = driver.findElementByLinkText("Login");
		return login.isDisplayed();	
	}
	public boolean registerlinkDisplayed(){
		WebElement register = driver.findElementByLinkText("Register");
		return register.isDisplayed();
	}*/
	public boolean loginLinkisEnabled(){
		WebElement login = driver.findElementByLinkText("Login");
		return login.isEnabled();
	}

}
