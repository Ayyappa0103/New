package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import net.bytebuddy.asm.Advice.This;

public class SauceDemoLoginPage_PF {

	
	@FindBy(id="user-name")
	WebElement txt_username;
	@FindBy(id = "password")
	WebElement txt_password;
	@FindBy(name = "login-button")
	WebElement login;
	
	WebDriver driver;
	public SauceDemoLoginPage_PF(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void enterUserName(String username) {
		txt_username.sendKeys(username);
		
	}
	public void enterPassword(String password) {
		txt_password.sendKeys(password);
		
	}
	public void login() {
		login.click();
	}
}
