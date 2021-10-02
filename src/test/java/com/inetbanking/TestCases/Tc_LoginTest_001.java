package com.inetbanking.TestCases;
import java.io.IOException;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.inetbanking.PageObjects.LoginPage;

public class Tc_LoginTest_001 extends BaseClass {

	@Test
	public static void LoginTest() throws IOException {
	
		BaseClass baseclass = new BaseClass();
		logger.info(" TC_LOGINTEST_001 TESTING STARTED ");
		logger.info(" LOGIN VERIFICATION STARTED ");
		PageFactory.initElements(driver, LoginPage.class);
		LoginPage.SetUsername.sendKeys(baseclass.username);
		logger.info("USERNAME ENTERED");
		
		LoginPage.SetPassword.sendKeys(baseclass.password);
		logger.info("PASSWORD ENTERED");
		
		LoginPage.ClickLogin.click();
		
		

		if (driver.getTitle().equals("Guru99 Bank Manager HomePage")) {

			Assert.assertTrue(true);
			logger.info(" LOGINED SUCCESFULLY ");
		

		} else {
			Assert.assertTrue(false);
			logger.info(" LOGIN FAILED ");
			
			
			
			
		

		}
		logger.info(" TC_LOGINTEST_001 TESTING FINISHED ");

	}

}
