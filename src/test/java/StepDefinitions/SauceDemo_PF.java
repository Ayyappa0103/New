package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageFactory.SauceDemoLoginPage_PF;
import io.cucumber.java.en.*;

public class SauceDemo_PF {
	
	WebDriver driver= null;
	SauceDemoLoginPage_PF login;
	
	
	@Given("user is open the browser.")
	public void user_is_open_the_browser() {
		driver=new ChromeDriver();
	    System.out.println(" == I am inside LoginDemo_");
	    System.out.println("Inside step - browser is launch");
	}

	@Given("user is on login page.")
	public void user_is_on_login_page() throws InterruptedException {
		driver.navigate().to("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	    driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
	    driver.manage().window();
		Thread.sleep(3000);
	    System.out.println("inside step - User is on login page");
	}

	@When("^user enters the (.*) and (.*)$")
	public void user_enters_the_username_and_password(String username,String password) {
	    login=new SauceDemoLoginPage_PF(driver);
	    login.enterUserName(username);
	    login.enterPassword(password);
	    
	}

	@When("user clicks on login button.")
	public void user_clicks_on_login_button() {
	    login.login();
	}

	@Then("user will navigates to home page.")
	public void user_will_navigates_to_home_page() {
	    driver.getTitle();
	    driver.close();
	}



}
