package com.configuration_reader;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Configuration_reader {

	
	public static Properties proper;
	
	
	public Configuration_reader() throws Throwable {
		
		File f = new File("C:\\Users\\Dell\\eclipse-workspace\\Amazon-test\\src\\main\\java\\com\\configuaration_properties\\Configuationpropeties.properties");
		FileInputStream f1 = new FileInputStream(f);
		proper = new Properties();
		proper.load(f1);
		
		
	}
	
	public String getURL() {
		String property = proper.getProperty("URL");
		return property;

	}

	public String getphonenumber() {
		String property = proper.getProperty("phonenumber");
		return property;

	}

	public String getpassword() {
		String property = proper.getProperty("password");
		return property;

	}
	
	public String ClickLoginbutton() {
		String property = proper.getProperty("Click");
		return property;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
