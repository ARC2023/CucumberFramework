package tester;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(

		features = { "src\\test\\resources\\FeatureFiles\\Electronics" }, 
		glue = { "stepdefinition",
				"hooks" }, 
		plugin = { "pretty",
				
				"rerun:target/failedcases.txt", 
				
				"json:target/cucumber-reports/Cucumber.json",
				"junit:target/cucumber-reports/Cucumber.xml",
				
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"timeline:test-output-thread/" }
		,
		tags="not @SO and not @DataTablesMap" 
		// If we need to add multiple not condition to skip scenario use and instead of or
		//monochrome = true,
		//dryRun=true

)

public class Executor {
	//Jenkins Command
	//mvn verify -DCucumber.options="--tags '@DataTablesMap and not @new'"
}
