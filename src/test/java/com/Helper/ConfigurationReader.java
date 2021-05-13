package com.Helper;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigurationReader {
	
	public static Properties prop;
	
	public ConfigurationReader() throws Throwable {
		File file=new File("C:\\Users\\hai\\eclipse-workspace\\FinalProject\\src\\test\\java\\com\\Properties\\Configuration.properties");
		FileInputStream fis=new FileInputStream(file); 
		prop=new Properties();
		prop.load(fis);
	}
	
	public String getBrowser() {
		String browser = prop.getProperty("browserType");
		return browser;
	}
	
	public String getUrl() {
		String url = prop.getProperty("url");
		return url;
	}
	
	public String getCVV() {
		String cvv = prop.getProperty("cvv");
		return cvv;
	}
}
