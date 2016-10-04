package testingpages;

import org.testng.Assert;
import org.testng.annotations.Test;

import eonpages.EonUserHomePage;

public class EonUserHomePageTests extends EonUserHomePage {
	public static String username = "";
	public static String password = "";
	@Test
	public void verifyEonUserHomePage(){
		getEonHomePage();
		Assert.assertEquals(getTitle(), title);
		String cmdInhomePage = driver.getWindowHandle();
		goToEonLoginPage();
		for(String widowHandle :driver.getWindowHandles()){
			driver.switchTo().window(widowHandle);
		}
		Assert.assertEquals(getEonLonginPageTitle(),ltitle );
		login(username,password);
		for(String windowHandle : driver.getWindowHandles()){
			driver.switchTo().window(windowHandle);
		}
	 }
	
	}

