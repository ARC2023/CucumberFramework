package tester;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(

		features = { "@target/failedcases.txt" }, 
		glue = { "stepdefinition",
				"hooks" }, 
		plugin = { "pretty","rerun:target/failedcases.txt", 
				"json:target/cucumber-reports/Cucumber.json",
				"junit:target/cucumber-reports/Cucumber.xml",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"timeline:test-output-thread/" }
		//,
		//tags="@Smoke",
		//monochrome = true,
		//dryRun=true

)
public class Rerun {

}
