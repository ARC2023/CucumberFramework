package com.cucumber.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cucumber.driverutils.DriverFactory;
import com.cucumber.utils.CommonUtils;

public class HomePagePenFed extends DriverFactory {

    WebDriver driver;

    // Top navigation
    @FindBy(linkText = "Checking & Savings")
    private WebElement checkingSavingsLink;

    @FindBy(linkText = "Credit Cards")
    private WebElement creditCardsLink;

    @FindBy(linkText = "Auto")
    private WebElement autoLink;

    @FindBy(linkText = "Mortgage & Home Equity")
    private WebElement mortgageHomeEquityLink;

    @FindBy(linkText = "Loans")
    private WebElement loansLink;

    @FindBy(linkText = "Learn")
    private WebElement learnLink;

    // Buttons
    @FindBy(xpath = "//button[contains(text(),'Join Now')]")
    private WebElement joinNowBtn;

    @FindBy(xpath = "//button[contains(text(),'Log In')]")
    private WebElement logInBtn;

    // Main banner section
    @FindBy(xpath = "//button[contains(text(),'Start Your Journey')]")
    private WebElement startYourJourneyBtn;

    // Main feature icons
    @FindBy(xpath = "//span[contains(text(),'Auto Loans')]")
    private WebElement autoLoansIcon;

    @FindBy(xpath = "//span[contains(text(),'Checking')]")
    private WebElement checkingIcon;

    @FindBy(xpath = "//span[contains(text(),'Credit Cards')]")
    private WebElement creditCardsIcon;

    @FindBy(xpath = "//span[contains(text(),'Mortgage')]")
    private WebElement mortgageIcon;

    @FindBy(xpath = "//span[contains(text(),'Home Equity')]")
    private WebElement homeEquityIcon;

    @FindBy(xpath = "//span[contains(text(),'Real Estate Agent')]")
    private WebElement realEstateAgentIcon;

    public HomePagePenFed(WebDriver driver) {
        PageFactory.initElements(getDriver(), this);
    }

    // Use CommonUtils for common actions
    CommonUtils utils = new CommonUtils();

    // Example usage for each element using CommonUtils
    public void clickJoinNow() {
        utils.clickElement(joinNowBtn);
    }

    public void clickLogIn() {
        utils.clickElement(logInBtn);
    }

    public void clickStartYourJourney() {
        utils.clickElement(startYourJourneyBtn);
    }

    public void clickAutoLoansIcon() {
        utils.clickElement(autoLoansIcon);
    }

    public void clickCheckingIcon() {
        utils.clickElement(checkingIcon);
    }

    public void clickCreditCardsIcon() {
        utils.clickElement(creditCardsIcon);
    }

    public void clickMortgageIcon() {
        utils.clickElement(mortgageIcon);
    }

    // ...existing code...

    public void clickHomeEquityIcon() {
        utils.clickElement(homeEquityIcon);
    }

    public void clickRealEstateAgentIcon() {
        utils.clickElement(realEstateAgentIcon);
    }
}
