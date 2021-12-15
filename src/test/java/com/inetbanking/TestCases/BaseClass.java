package com.inetbanking.TestCases;

import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import com.inetbanking.Utilities.ReadConfig;




public class BaseClass {

	/* READING VALUES FROM READCONFIG from config.PROPERTIES */
	ReadConfig readconfig = new ReadConfig();

	public String baseurl = readconfig.GetBaseurl();
	public String username = readconfig.GetUsername();
	public String password = readconfig.GetPassword();
	public String driverlocation1 = readconfig.GetChromepath();
	public String driverlocation2 = readconfig.GetFirefoxpath();
	public String driverlocation3 = readconfig.GetIepath();
	public static WebDriver driver;
	public static Logger logger;


	@Parameters("Browser")
	@BeforeClass
	public void Setup(String Browser) {

		logger = Logger.getLogger(BaseClass.class);
		PropertyConfigurator.configure("log4j.properties");

		logger.info(" BROWSER  LAUNCHING ");

		if (Browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", driverlocation1);
			driver = new ChromeDriver();
			logger.info(" CHROME BROWSER LAUNCHED ");

		}else if (Browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", driverlocation2);
			driver = new FirefoxDriver();
			logger.info(" FIREFOX BROWSER LAUNCHED ");

		}else if (Browser.equals("ie")) {
			System.setProperty("webdriver.ie.driver", driverlocation3);
			//WebDriverManager.iedriver().setup();

			driver = new InternetExplorerDriver();
			logger.info(" INTERNETEXPLORER BROWSER LAUNCHED ");

		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(baseurl);
		driver.manage().window().maximize();

	}

	@AfterClass
	public void TearDown() {

		driver.quit();


		logger.info(" BROWSER CLOSED ");


	}
	public String randomnames() {

		String random=RandomStringUtils.randomAlphabetic(8);
		return random;

	}

	public String randomnumber() {
		String randomnum=RandomStringUtils.randomNumeric(8);
		return randomnum;
	}

}
