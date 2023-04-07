package stepdefinition;

import java.io.IOException;

import org.testng.Assert;

import com.cucumber.configreader.ConfigurationReader;
import com.cucumber.driverutils.DriverFactory;
import com.cucumber.pages.LogInPage;

import io.cucumber.java.en.*;
import screenshotutils.ScreenShot;

public class LogInSauceDemo extends ScreenShot{

	LogInPage LIP = new LogInPage(getDriver());
	
	

	@Given("I am on login page of sauce demo")
	public void i_am_on_login_page_of_sauce_demo() throws Exception {

		String logoActual = LIP.getHomeLogo();
		String logoExpected = ConfigurationReader.getInstance().configurationSetup().getProperty("LogInPageLable");
		Assert.assertEquals(logoActual, logoExpected);
		takeScreenShot();

	}

	@When("I enter User name {string}")
	public void i_enter_user_name(String UN) throws Exception {
		LIP.enterUserName(UN);
		takeScreenShot();
		
	}

	@When("I enter Password {string}")
	public void i_enter_password(String PW) throws IOException {
		LIP.enterPassWord(PW);
		takeScreenShot();
	}

	@When("I click on login button")
	public void i_click_on_login_button() throws IOException {
		try {
			LIP.clickLogInBtn();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		takeScreenShot();
	}

	@Then("I land on home page of sauce demo")
	public void i_land_on_home_page_of_sauce_demo() throws Exception {
		System.out.println("Work In Progress");
		throw new Exception("Screen On failure");
	}
}
