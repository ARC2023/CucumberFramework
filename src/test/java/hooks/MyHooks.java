package hooks;


import java.util.Properties;
import org.openqa.selenium.WebDriver;
import com.cucumber.configreader.ConfigurationReader;
import com.cucumber.driverutils.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class MyHooks {
	private DriverFactory driverFactory;
	private WebDriver driver;
	private ConfigurationReader configReader;
	public static Properties prop;
	public static String folderName;

	@Before(order = 0)
	public void setUpConfiguration(Scenario sc) {

		folderName = sc.getName();
		prop = ConfigurationReader.getInstance().configurationSetup();
	}

	@Before(order = 1)
	public void launchBrowser() {
		String browser = prop.getProperty("browser");
		String URL = prop.getProperty("URL");
		driver = DriverFactory.getInstance().LaunchBrowser(browser, URL);

	}

	@After(order = 0)
	public void CloseBrowser() {
		// ScreenShot.counter=1;
		 driver.quit();
	}

	@After(order = 1)
	public void tearDown(Scenario sc) {
		if (sc.isFailed()) {
			/*
			 * try { //ScreenShot.takeScreenShotOnFailure(); } catch (IOException e) {
			 * e.printStackTrace(); }
			 */

		}
	}

}
