package com.inetbanking.PageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver) {

		this.driver=driver;
		PageFactory.initElements(driver, this);

	}


	@FindBy(xpath = "//input[@name='uid']")
	public static WebElement textUsername;



	@FindBy(xpath = "//input[@name='password']")
	public static WebElement  textPassword;



	@FindBy(xpath = "//input[@name='btnLogin']")
	public static WebElement butLogin;


	@FindBy(xpath = "//a[@href='Logout.php']")
	public static WebElement butLogout;



	public void SetUsername(String user) {

		textUsername.sendKeys(user);
	}

	public void SetPassword(String pass) {

		textPassword.sendKeys(pass);
	}

	public void ClickLogin() {

		butLogin.click();
	}

	public void ClickLogout() {

		butLogout.click();
	}







}
