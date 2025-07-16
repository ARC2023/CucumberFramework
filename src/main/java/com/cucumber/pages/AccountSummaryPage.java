package com.cucumber.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.cucumber.utils.CommonUtils;

public class AccountSummaryPage extends CommonUtils {

    WebDriver driver;

    // Example page objects (update locators as needed)
    @FindBy(xpath = "//h1[contains(text(),'Account Summary')]")
    private WebElement accountSummaryHeader;

    @FindBy(xpath = "//button[contains(text(),'Transfer Funds')]")
    private WebElement transferFundsBtn;

    @FindBy(xpath = "//button[contains(text(),'View Statements')]")
    private WebElement viewStatementsBtn;

    @FindBy(xpath = "//div[contains(@class,'account-balance')]")
    private WebElement accountBalance;

    // Add more elements as needed

    public AccountSummaryPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public String getHeaderText() {
        return accountSummaryHeader.getText();
    }

    public void clickTransferFunds() {
        clickElement(transferFundsBtn);
    }

    public void clickViewStatements() {
        clickElement(viewStatementsBtn);
    }

    public String getAccountBalance() {
        return accountBalance.getText();
    }

    // Add more actions as needed
}
