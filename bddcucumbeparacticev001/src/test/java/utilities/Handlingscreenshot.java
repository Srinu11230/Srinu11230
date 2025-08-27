package utilities;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Handlingscreenshot extends Launchthebrowser{
	
	public Handlingscreenshot(WebDriver driver) {
		super();
	}
	
	public void takeScreenShots() throws IOException {
		TakesScreenshot takesrcshot = (TakesScreenshot)driver;
	File srcfile = takesrcshot.getScreenshotAs(OutputType.FILE); 
	File destfile=new File("");
	//driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("sudername")));	
	FileUtils.copyFile(srcfile, destfile);
	}

}
