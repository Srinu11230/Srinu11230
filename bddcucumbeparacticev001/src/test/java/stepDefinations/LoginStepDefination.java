package stepDefinations;
import java.io.IOException;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.*;
import io.cucumber.java.en.*;
import stepDefinations.*;
import utilities.*;
import pageObjects.*;

public class LoginStepDefination extends Launchthebrowser{
	Loginpage loginpage =new Loginpage(driver);
	
public LoginStepDefination(WebDriver driver) {
	this.driver = driver;
		// TODO Auto-generated constructor stub
	}
@Given("I open the facebook login page")
public void i_open_the_facebook_login_page(){
	loginpage.openTheFaceBookPage();
	 System.out.println("Opened Facebook login page");
	
	}
@When("I enter the username and password")
public void i_enter_the_username_and_password(String username, String password) {
	loginpage.enterTheCredentials(username, password);
	 System.out.println("Username: " + username + ", Password: " + password);
	
	}
@Then("I clcik on the login button")
public void i_click_on_the_login_button() throws IOException {
	loginpage.clickOnLoginButton();
	 System.out.println("Clicked login button");
	
	}
}
