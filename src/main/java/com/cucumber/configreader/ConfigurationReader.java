package com.cucumber.configreader;

import java.io.FileInputStream;

import java.util.Properties;


public class ConfigurationReader {
	
	public static Properties prop;

	public Properties configurationSetup() {

		prop = new Properties();
		try {
			String configPath = System.getProperty("user.dir") + "/src/main/resources/config/config.properties";
			FileInputStream ip = new FileInputStream(configPath);
			prop.load(ip);

		} catch (Exception e) {
			e.printStackTrace();
		} 

		return prop;

	}
	
	public static ConfigurationReader getInstance() {
		return new ConfigurationReader();
	}
	
	public String getProperTyConfig(String key) {		
		
		return prop.getProperty(key);
	}

	
	
}
