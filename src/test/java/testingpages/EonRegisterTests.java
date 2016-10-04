package testingpages;

import org.testng.annotations.Test;

import eonpages.EonRegisterPage;
import junit.framework.Assert;

public class EonRegisterTests extends EonRegisterPage {
	
	@Test
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
		
	}

}
