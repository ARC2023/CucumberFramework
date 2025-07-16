package com.cucumber.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class CommonUtils {

	
	
	public void moveToElement(WebDriver driver,WebElement Element) throws InterruptedException {
		Actions mouse= new Actions(driver);
		mouse.moveToElement(Element).build().perform();			
	}

	// Common click method for all page objects
	public void clickElement(WebElement element) {
		element.click();
	}
	
}
