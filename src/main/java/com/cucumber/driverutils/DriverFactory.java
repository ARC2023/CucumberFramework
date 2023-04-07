package com.cucumber.driverutils;

import java.util.Arrays;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.cucumber.utils.CommonUtils;

public class DriverFactory extends CommonUtils{

	public WebDriver Driver;

	public static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

	/**
	 * This method is used to initialize the thread local driver on the basis of
	 * given browser
	 * 
	 * @param browser
	 * @return this will return driver.
	 */
	public WebDriver LaunchBrowser(String browser, String URL) {

		System.out.println("Browser value is: " + browser);

		switch (browser) {
		case "chrome":
			ChromeOptions option = new ChromeOptions();
			option.addArguments("--start-maximized");
			option.setExperimentalOption("excludeSwitches",
					Arrays.asList("disable-popup-blocking", "enable-automation"));
			driver.set(new ChromeDriver(option));
			getDriver().manage().deleteAllCookies();
			getDriver().get(URL);
			break;
		case "firefox":
			driver.set(new FirefoxDriver());
			break;

		default:
			System.out.println("Please pass the correct browser value: " + browser);
			break;
		}

		return getDriver();

	}

	/**
	 * this is used to get the driver with ThreadLocal
	 * 
	 * @return
	 */
	public static synchronized WebDriver getDriver() {
		return driver.get();
	}

	public static DriverFactory getInstance() {
		return new DriverFactory();
	}
}
