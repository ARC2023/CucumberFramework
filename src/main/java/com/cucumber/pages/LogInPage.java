package com.cucumber.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cucumber.driverutils.DriverFactory;

import java.util.List;

import org.openqa.selenium.*;



public class LogInPage extends DriverFactory{

		WebDriver driver;	
	
	@FindBy(xpath="//div[text()='Swag Labs']")
	private WebElement HomeLogo;
	
	@FindBy(id="user-name")
	private WebElement userNameTxtbox;
	
	@FindBy(id="password")
	private WebElement passWordTxtbox;
	
	@FindBy(id="login-button")
	private WebElement logInBtn;
	
	
	//private By HomeLogo = By.xpath("//div[text()='Swag Labs']");
	//private By userNameTxtbox = By.id("user-name");
	//private By passWordTxtbox = By.id("password");
	//private By logInBtn = By.id("login-button");

	
	
	
	public LogInPage(WebDriver driver) {
		//this.driver=driver;		
		PageFactory.initElements( getDriver(),this);
		
	}
	
	
	public String getHomeLogo() throws Exception {
		
		//return getDriver().findElement(HomeLogo).getText();
		
		return HomeLogo.getText();
	}
	public void enterUserName(String UN) throws Exception {
		//throw new Exception("KK");
		//getDriver().findElement(userNameTxtbox).sendKeys(UN);
		userNameTxtbox.sendKeys(UN);
	}

	public void enterPassWord(String PW) {
		//getDriver().findElement(passWordTxtbox).sendKeys(PW);
		passWordTxtbox.sendKeys(PW);
	}

	public void clickLogInBtn() throws InterruptedException {
		//getDriver().findElement(logInBtn).click();
		moveToElement(getDriver(), logInBtn);
		logInBtn.click();
		
	}

}
