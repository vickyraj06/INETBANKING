package com.inetbanking.PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewCustomerPage {
	
	@FindBy(xpath = "//a[normalize-space()='New Customer']")
	public static WebElement ClickNewCustomer;

	@FindBy(xpath = "//input[@name='name']")
	public static WebElement AddCustomername;
	
	@FindBy(xpath = "//input[@value='m']")
	public static WebElement AddMaleGender;
	
	@FindBy(xpath = "//input[@value='f']")
	public static WebElement AddFemaleGender;
	
	@FindBy(xpath = "//input[@name='dob']")
	public static WebElement AddDOB;
	
	@FindBy(xpath = "//textarea[@name='addr']")
	public static WebElement AddAddress;
	
	@FindBy(xpath = "//input[@name='city']")
	public static WebElement AddCity;
	
	@FindBy(xpath = "//input[@name='state']")
	public static WebElement AddState;
	
	@FindBy(xpath = "//input[@name='pinno']")
	public static WebElement AddPin;
	
	@FindBy(xpath = "//input[@name='telephoneno']")
	public static WebElement AddMobileno;
	
	@FindBy(xpath = "//input[@name='emailid']")
	public static WebElement AddEmail;
	
	@FindBy(xpath = "//input[@name='password']")
	public static WebElement AddPassword;
	
	@FindBy(xpath = "//input[@type='submit']")
	public static WebElement ClickSubmit;
	
	@FindBy(xpath = "//input[@type='reset']")
	public static WebElement ClickReset;
}
