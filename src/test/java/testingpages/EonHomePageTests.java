package testingpages;

import org.openqa.selenium.NoSuchElementException;
import org.testng.annotations.Test;

import eonpages.EonHomePage;
import junit.framework.Assert;

public class EonHomePageTests extends EonHomePage {
	
	@Test
	public void verifyEonHomePage(){
		getEonHomePage();
		Assert.assertEquals(getTitle(), title);
	}
	
	@Test
	public void verifyLonginDisplayed() throws NoSuchElementException {
		getEonHomePage();
		Assert.assertEquals(getTitle(), title);
		Assert.assertEquals(true, loginLinkisEnabled());
	}
	/*@Test
	public void verifyRegisterDisplayed(){
		getEonHomePage();
		Assert.assertEquals(getTitle(), title);
		Assert.assertEquals(true, registerlinkDisplayed());
	}*/

}
