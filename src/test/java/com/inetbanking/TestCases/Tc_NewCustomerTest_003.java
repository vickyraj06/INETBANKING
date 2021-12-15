package com.inetbanking.TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.PageObjects.LoginPage;
import com.inetbanking.PageObjects.NewCustomerPage;

public class Tc_NewCustomerTest_003 extends BaseClass{
	
	@Test
	public void AddNewCustomerTest() throws Exception {
		
		
		LoginPage lp = new LoginPage(driver);
		
		lp.SetUsername(username);
		lp.SetPassword(password);
		lp.ClickLogin();
		
	
		PageFactory.initElements(driver, NewCustomerPage.class);
		logger.info(" TC_NEWCUSTOMERTEST_003 ");
		
		NewCustomerPage.ClickNewCustomer.click();
		logger.info(" CLICKED NEWCUSTOMER SIDEMENU ");
		
		NewCustomerPage.AddCustomername.sendKeys(randomnames());
		logger.info(" CUSTOMERNAME ENTERED ");
		
		NewCustomerPage.AddMaleGender.click();
		logger.info(" GENDER SELECTED ");
		
		NewCustomerPage.AddDOB.sendKeys("06111998");
		logger.info(" DOB ENTERED ");
		
		
		NewCustomerPage.AddAddress.sendKeys(randomnames());
		logger.info(" ADDRESS ENTERED ");
		
		
		
		NewCustomerPage.AddCity.sendKeys(randomnames());
		//NewCustomerPage.AddCity.sendKeys(randomnumber()); ------>TO FAIL TESTCASE
		logger.info(" CITY ENTERED ");
		
		NewCustomerPage.AddState.sendKeys(randomnames());
		logger.info(" STATE ENTERED ");
		
		NewCustomerPage.AddPin.sendKeys(randomnumber());
		logger.info(" PIN ENTERED ");
		
		NewCustomerPage.AddMobileno.sendKeys(randomnumber()); 
		logger.info(" MOBILENO ENTERED ");
	
		String email=randomnames()+"@gmail.com";
		NewCustomerPage.AddEmail.sendKeys(email);
		logger.info(" EMAIL ENTERED ");
		
		NewCustomerPage.AddPassword.sendKeys(randomnumber());
		logger.info(" PASSWORD ENTERED ");
		
		NewCustomerPage.ClickSubmit.click();
		logger.info(" SUBMIT BUTTON CLICKED ");
		
		//NewCustomerPage.ClickReset.click(); ------>TO CLICK RESET
		
		boolean res=driver.getPageSource().contains("Customer Registered Successfully!!!");
		
		if(res==true) {
			Assert.assertTrue(true);
			logger.info(" ADDED DETAILS SUCCESSFULLY ");
		}else {
			
			Assert.assertTrue(false);
			logger.warn(" FAILED ADDING DETAILS ");
		}
		
		logger.info(" TC_NEWCUSTOMERTEST_003 TEST FINISHED ");
		
		
	}
	

}
