package com.inetbanking.PageObjects;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
	
	@FindBy(xpath = "//input[@name='uid']")
	public static WebElement SetUsername;
		
	

	@FindBy(xpath = "//input[@name='password']")
	public static WebElement  SetPassword;
		
	
	
	@FindBy(xpath = "//input[@name='btnLogin']")
	public static WebElement ClickLogin;
	

	@FindBy(xpath = "//a[@href='Logout.php']")
	public static WebElement clickLogout;
	
		
	
	
	
	

			

}
