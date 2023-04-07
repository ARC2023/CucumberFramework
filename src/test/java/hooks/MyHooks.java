package hooks;

import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import com.cucumber.configreader.ConfigurationReader;
import com.cucumber.driverutils.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import screenshotutils.ScreenShot;

public class MyHooks {
	private DriverFactory driverFactory;
	private WebDriver driver;
	private ConfigurationReader configReader;
	public static Properties prop;
	public static String folderName;
	String browser;
	String URL;

	@Before(order = 0)
	public void setUpConfiguration(Scenario sc) {
		folderName = sc.getName();
		prop = ConfigurationReader.getInstance().configurationSetup();
	}

	@Before(order = 1)
	public void launchBrowser() {
		browser = prop.getProperty("browser");
		URL = prop.getProperty("URL");
		driver = DriverFactory.getInstance().LaunchBrowser(browser, URL);

	}

	@After(order = 0)
	public void CloseBrowser() {
		 ScreenShot.counter=1;
		 driver.quit();
	}

	@After(order = 1)
	public void tearDown(Scenario sc) {
		if (sc.isFailed()) {

			try {
				// this method invokes screenshot upon failure
				ScreenShot.takeScreenShotOnFailure();
				/* This code is to attach the failure page screenshot to report*/
				String screenshotName = sc.getName().replaceAll(" ", "_");
				byte[] sourcePath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
				sc.attach(sourcePath, "image/png", screenshotName);
			} catch (Exception e) {
				e.printStackTrace();
			}

			

		}
	}

}
