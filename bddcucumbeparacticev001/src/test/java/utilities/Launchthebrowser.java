package utilities;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Launchthebrowser {
	
	 protected WebDriver driver;

	    public WebDriver getDriver() {
	        if (driver == null) {
	            System.setProperty("webdriver.chrome.driver", "C:\\Users\\Madhavakrishna\\new eclipse-workspace\\bddcucumbeparacticev001\\Drivers\\chromedriver.exe");
	            driver = new ChromeDriver();
	        }
	        return driver;
	    }

	    public void quitDriver() {
	        if (driver != null) {
	            driver.quit();                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          
    }
}

	/*
	 * public static void main(String[] args) throws IOException {
	 * 
	 * //System.setProperty(WebDriver.chromedriver.driver); //String URL =
	 * "https://www.msn.com/en-in/sports/cricket/virat-kohli-creates-world-record-becomes-first-batsman-to-achieve-huge-milestone/ar-AA1E6y1r?ocid=msedgdhp&pc=DCTS&cvid=9e69554d13c147438d3929c39eee6e1e&ei=6";
	 * WebDriverManager.chromedriver().setup(); WebDriver driver = new
	 * ChromeDriver(); //driver.get(URL); System.out.println("browser opened");
	 * driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 * TakesScreenshot srcshot = ((TakesScreenshot)driver); File
	 * Sourcefile=srcshot.getScreenshotAs(OutputType.FILE); File Dispatchfile = new
	 * File("C:\\Users\\Madhavakrishna\\OneDrive\\Desktop\\Adress details\\test3.png"
	 * ); FileUtils.copyFile(Sourcefile, Dispatchfile);
	 * driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); String CUrl
	 * = driver.getCurrentUrl(); System.out.println(CUrl); driver.close();
	 * 
	 * 
	 * }
	 */

}
