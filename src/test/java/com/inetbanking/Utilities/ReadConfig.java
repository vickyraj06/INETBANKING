package com.inetbanking.Utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	
	Properties properties;

	public ReadConfig() {

		try {
			FileInputStream files = new FileInputStream("./Configurations/config.properties");
			properties = new Properties();
			properties.load(files);

		} catch (Exception e) {
			System.out.println("EXCEPTION IS " + e.getMessage());

		}

	}
	
	public String GetBaseurl() {
		String Baseurl =  (String) properties.get("baseurl");
		return Baseurl;
		
		
	}
	public String GetUsername() {
		String Username = (String) properties.get("username");
		return Username;
		
		
	}
	public String GetPassword() {
		String Password = (String) properties.get("password");
		return Password;
		
		
	}
	
	public String GetChromepath() {
		String Chromepath = (String) properties.get("chromepath");
		return Chromepath;
		
		
	}
	
	public String GetFirefoxpath() {
		String Firefoxpath = (String) properties.get("firefoxpath");
		return Firefoxpath;
		
		
	}
	public String GetIepath() {
		String Iepath= (String) properties.get("iepath");
		return Iepath;
		
		
	}
	

}
