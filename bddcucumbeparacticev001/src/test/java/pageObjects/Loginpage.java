package pageObjects;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.*;

public class Loginpage extends Launchthebrowser{
	
	 	@FindBy(id = "email")
	    WebElement txtUserName;

	    @FindBy(id = "pass")
	    WebElement txtpassword;

	    @FindBy(xpath = "//button[text()='Log in']")
	    WebElement btnLogin;
	    Handlingscreenshot handlingscreenshot = new Handlingscreenshot(driver);
	    
	public Loginpage(WebDriver driver) {
		super();
	}
	 public void openTheFaceBookPage() {
		 driver.get("https://www.facebook.com/");
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
		 
	 }
	 public void enterTheCredentials(String username, String password ) {
		 driver.manage().timeouts().implicitlyWait(2, TimeUnit.MILLISECONDS);
		 txtUserName.sendKeys(username);
		 txtpassword.sendKeys(password);
		 
	 }
	 public void clickOnLoginButton() throws IOException {
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
		 handlingscreenshot.takeScreenShots();
		 btnLogin.click();
	 }
	/*
	 * public static void main(String[] args) throws IOException { // TODO
	 * Auto-generated method stub WebDriverManager.chromedriver().setup(); WebDriver
	 * driver=new ChromeDriver(); driver.manage().window().maximize();
	 * driver.get("https://www.youtube.com/watch?v=lM-lqPun9P8");
	 * driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	 * //TakesScreenshot screenshot=((TakesScreenshot)driver); 
	 * File sourcefile =((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE); File
	 * Destinationfil = new
	 * File("C:\\Users\\Madhavakrishna\\OneDrive\\Desktop\\Adress details\\VMK.png"
	 * ); FileUtils.copyFile(sourcefile, Destinationfil); driver.close();
	 * 
	 * }
	 */

}
