package screenshotutils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import com.cucumber.driverutils.DriverFactory;

import hooks.MyHooks;

public class ScreenShot extends DriverFactory{
	public static int counter = 1;

	public static void takeScreenShotOnFailure() throws IOException {

		File srcFile = ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.FILE);
		File desFile = new File("C:\\Users\\glend\\eclipse-workspace\\CucumberFramework\\ScreenShotOnFailure\\" +
		MyHooks.folderName + "\\" + "Failed" + ".jpg");
		FileUtils.copyFile(srcFile, desFile);
		System.out.println("Screen Shot Taken For Failure");
	}

	public static void takeScreenShot() throws IOException {

		File srcFile = ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.FILE);
		File desFile = 
		new File("C:\\Users\\glend\\eclipse-workspace\\CucumberFramework\\ScreenShotOnSuccess\\" 
		+ MyHooks.folderName
				+ "\\" + counter + ".jpg");
		FileUtils.copyFile(srcFile, desFile);
		System.out.println("Screen Shot Taken");
		counter++;
	}
}
