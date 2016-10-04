package testingpages;

import org.testng.annotations.Test;

import eonpages.EonHomePage;
import junit.framework.Assert;

public class EonHomePageTests extends EonHomePage {
	@Test
	public void verifyEonHomePage(){
		getEonHomePage();
		Assert.assertEquals(getTitle(), title);
	}

}
