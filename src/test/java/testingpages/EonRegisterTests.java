package testingpages;

import org.testng.annotations.Test;

import eonpages.EonRegisterPage;
import junit.framework.Assert;

public class EonRegisterTests extends EonRegisterPage {
	
	public static String accountno = "";
	public static String postadd = "";
	
	/*@Test
	public void verifyEonRegisterPageTitle(){
		getEonHomePage();
		Assert.assertEquals(getTitle(), title);
		String cmdInhomePage = driver.getWindowHandle();
		goToEonRegisterPage();
		for(String windowHandle : driver.getWindowHandles()){
			driver.switchTo().window(windowHandle);
		}
		Assert.assertEquals(getEonRegisterPageTitle(), rtitle);
		driver.switchTo().window(cmdInhomePage);
		
	}*/
	/*@Test
	public void verifyEonRegisterDetails(){
		getEonHomePage();
		Assert.assertEquals(getTitle(), title);
		String cmdInhomePage = driver.getWindowHandle();
		goToEonRegisterPage();
		for(String windowHandle : driver.getWindowHandles()){
			driver.switchTo().window(windowHandle);
		}
		register(accountno,postadd);

	}*/
	@Test
	public void verifyEonRegisterpagetext(){
		getEonHomePage();
		Assert.assertEquals(getTitle(), title);
		String cmdInhomePage = driver.getWindowHandle();
		goToEonRegisterPage();
		for(String windowHandle : driver.getWindowHandles()){
			driver.switchTo().window(windowHandle);
		}
		register(accountno,postadd);
		getEonRegisterpagetext();
		for(String windowHandle : driver.getWindowHandles()){
			driver.switchTo().window(windowHandle);
		}
		
		
	}
		
	}


