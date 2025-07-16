package com.cucumber.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.cucumber.utils.CommonUtils;

public class ManageExternalAccountsPage extends CommonUtils {

    WebDriver driver;

    @FindBy(xpath = "//h1[contains(text(),'MANAGE EXTERNAL ACCOUNTS')]")
    private WebElement manageExternalAccountsHeader;

    @FindBy(xpath = "//a[contains(text(),'Add External Account')]")
    private WebElement addExternalAccountLink;

    @FindBy(xpath = "//div[contains(text(),'BANK OF AMERICA, N.A - 9882 - CHECKING')]")
    private WebElement bankAccountInfo;

    @FindBy(xpath = "//div[contains(text(),'Account Number')]/following-sibling::div")
    private WebElement accountNumber;

    @FindBy(xpath = "//div[contains(text(),'Routing Number')]/following-sibling::div")
    private WebElement routingNumber;

    @FindBy(xpath = "//span[contains(text(),'Active')]")
    private WebElement activeStatus;

    @FindBy(xpath = "//a[contains(text(),'Edit Account Name')]")
    private WebElement editAccountNameLink;

    public ManageExternalAccountsPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public String getHeaderText() {
        return manageExternalAccountsHeader.getText();
    }

    public void clickAddExternalAccount() {
        clickElement(addExternalAccountLink);
    }

    public String getBankAccountInfo() {
        return bankAccountInfo.getText();
    }

    public String getAccountNumber() {
        return accountNumber.getText();
    }

    public String getRoutingNumber() {
        return routingNumber.getText();
    }

    public boolean isActive() {
        return activeStatus.isDisplayed();
    }

    public void clickEditAccountName() {
        clickElement(editAccountNameLink);
    }
}
