package testingpages;

import org.testng.Assert;
import org.testng.annotations.Test;

import eonpages.EonLoginPage;

public class EonLoginTests extends EonLoginPage{
	
	@Test
	public void verifyEonLoginPageTitle(){
		getEonHomePage();
		Assert.assertEquals(getTitle(), title);
		String cmdInhomePage = driver.getWindowHandle();
		goToEonLoginPage();
		for(String widowHandle : driver.getWindowHandles()){
			driver.switchTo().window(widowHandle);
		}
		Assert.assertEquals(getEonLonginPageTitle(), ltitle);
		driver.switchTo().window(cmdInhomePage);
	}

}
