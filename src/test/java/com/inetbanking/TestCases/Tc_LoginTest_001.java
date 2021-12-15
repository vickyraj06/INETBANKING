package com.inetbanking.TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.inetbanking.PageObjects.LoginPage;

public class Tc_LoginTest_001 extends BaseClass {


	public static LoginPage lp;
	@Test
	public static void LoginTest() {



		BaseClass baseclass = new BaseClass();
		logger.info(" TC_LOGINTEST_001 TESTING STARTED ");
		logger.info(" LOGIN VERIFICATION STARTED ");

		lp = new LoginPage(driver);

		lp.SetUsername(baseclass.username); logger.info("USERNAME ENTERED");

		lp.SetPassword(baseclass.password); logger.info("PASSWORD ENTERED");

		lp.ClickLogin();



		if (driver.getTitle().equals("Guru99 Bank Manager HomePage")) {

			Assert.assertTrue(true);
			logger.info(" LOGINED SUCCESFULLY ");


		} else {
			Assert.assertTrue(false);
			logger.warn("LOGIN FAILED");






		}
		logger.info(" TC_LOGINTEST_001 TESTING FINISHED ");

	}

}