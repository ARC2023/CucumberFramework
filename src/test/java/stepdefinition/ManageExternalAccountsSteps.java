package com.cucumber.stepdefinitions;

import com.cucumber.pages.ManageExternalAccountsPage;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.*;
import static org.junit.Assert.*;

public class ManageExternalAccountsSteps {
    WebDriver driver;
    ManageExternalAccountsPage externalAccountsPage;

    public ManageExternalAccountsSteps() {
        // Initialize driver and page object as per your framework setup
        // driver = DriverFactory.getDriver();
        // externalAccountsPage = new ManageExternalAccountsPage(driver);
    }

    @Given("the user is on the Manage External Accounts page")
    public void user_is_on_manage_external_accounts_page() {
        // Initialize driver (replace with your actual driver factory or setup)
        driver = DriverFactory.getDriver();
        driver.get("https://www.penfed.org"); // or the correct URL
        externalAccountsPage = new ManageExternalAccountsPage(driver);
    }

    @Then("the page header should be {string}")
    public void page_header_should_be(String expectedHeader) {
        assertEquals(expectedHeader, externalAccountsPage.getHeaderText());
    }

    @Then("the user should see the bank account information")
    public void user_should_see_bank_account_info() {
        assertTrue(externalAccountsPage.getBankAccountInfo().contains("BANK OF AMERICA"));
    }

    @Then("the account number should be displayed")
    public void account_number_should_be_displayed() {
        assertNotNull(externalAccountsPage.getAccountNumber());
    }

    @Then("the routing number should be displayed")
    public void routing_number_should_be_displayed() {
        assertNotNull(externalAccountsPage.getRoutingNumber());
    }

    @Then("the account status should be Active")
    public void account_status_should_be_active() {
        assertTrue(externalAccountsPage.isActive());
    }

    @When("the user clicks on Add External Account")
    public void user_clicks_add_external_account() {
        externalAccountsPage.clickAddExternalAccount();
    }

    @Then("a new account form should be displayed")
    public void new_account_form_should_be_displayed() {
        // Add assertion for new account form visibility
    }

    @When("the user clicks on Edit Account Name")
    public void user_clicks_edit_account_name() {
        externalAccountsPage.clickEditAccountName();
    }

    @Then("the account name edit option should be available")
    public void account_name_edit_option_should_be_available() {
        // Add assertion for edit account name option visibility
    }
}
