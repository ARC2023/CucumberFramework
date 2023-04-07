package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ScenarioOutline {
	@Given("I want to write a step with {string}")
	public void i_want_to_write_a_step_with(String UN) {
	   System.out.println("User name-->"+UN);
	}

	@When("I check for the {string} in step")
	public void i_check_for_the_in_step(String Email) {
		 System.out.println("Email-->"+Email);
	}

	@Then("I verify the {string} in step")
	public void i_verify_the_in_step(String PW) {
		 System.out.println("PassWord-->"+PW);
	}
}
