package eonpages;

import org.openqa.selenium.WebElement;

public class EonRegisterPage extends EonHomePage {
	protected String rtitle = "Register to manage your account online - E.ON";
	public static String acc = "input.form-answer-textbox.account-number";
	public static String code = "input.form-answer-textbox.postcode";
	public static String contin = "input.causesValidation";
	public static String errortx = "div.error-summary";
	
	public String  getEonRegisterPageTitle(){
		String title = driver.getTitle();
		return title;
		
	}

	public EonRegisterPage register(String number,String address){
		WebElement accountnumber = driver.findElementByCssSelector(acc);
		accountnumber.sendKeys("123456789");
		WebElement postcode = driver.findElementByCssSelector(code);
		postcode.sendKeys("tw47et");
		WebElement continuelink = driver.findElementByCssSelector(contin);
		continuelink.click();
		return new EonRegisterPage();
		
	}
	public void getEonRegisterpagetext(){
		WebElement errortext = driver.findElementByCssSelector(errortx);
		String str = errortext.getText();
		System.out.println("print : "+str);
		
	}

	

}
