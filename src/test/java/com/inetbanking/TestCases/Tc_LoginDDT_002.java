package com.inetbanking.TestCases;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.inetbanking.PageObjects.LoginPage;
import com.inetbanking.Utilities.XLUtils;

public class Tc_LoginDDT_002 extends BaseClass {

	@DataProvider(name = "logindata")
	public String[][] GetExcelData() throws IOException {

		String path = "C:\\eclipse-workspace\\INetBanking\\src\\test\\java\\com\\inetbanking\\TestData\\LoginData.xlsx";

		int rowcount = XLUtils.getRowCount(path, "sheet1");

		int colcount = XLUtils.getCellCount(path, "sheet1", 1);

		String logindata[][] = new String[rowcount][colcount];

		for (int i = 1; i < rowcount; i++) {
			for (int j = 0; j < colcount; j++) {

				logindata[i - 1][j] = XLUtils.getCellData(path, "sheet1", i, j);
			}

		}
		return logindata;

	}
	
	  public static boolean isAlertpresent() 
	  { 
		  try  { 
			  driver.switchTo().alert(); 
			  return true; 
	  } 
		  catch(Exception e)
	  {
			  return false;
	  } 
	  }
	 

	@Test(dataProvider = "logindata")
	public static void LoginDDTTest(String username, String password) {

		logger.info(" LOGIN VERIFICATION STARTED ");
		PageFactory.initElements(driver, LoginPage.class);
		LoginPage.SetUsername.sendKeys(username);
		logger.info(" USERNAME ENTERED ");

		LoginPage.SetPassword.sendKeys(password);
		logger.info(" PASSWORD ENTERED ");

		LoginPage.ClickLogin.click();
		logger.info(" LOGIN CLICKED ");

		
		
		if (isAlertpresent() == true) {

			driver.switchTo().alert().accept();
			driver.switchTo().defaultContent();
			Assert.assertTrue(false);
			logger.warn(" LOGIN FAILED ");
		}

		else {
			Assert.assertTrue(true);
			LoginPage.clickLogout.click();
			driver.switchTo().alert().accept();
			driver.switchTo().defaultContent();
			logger.warn(" LOGIN PASSED ");

		}

	}

}
