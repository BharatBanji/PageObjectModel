package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class Login {
	
	public WebDriver driver;
	public Login(WebDriver log) {
		driver=log;
	}
	
	@FindBy(xpath="//*[@type=\"email\"]")
	WebElement Email;
  
	public void ProvideEmail(String a) {
		Email.clear();
		Email.sendKeys(a);;
		
	}
	
	@FindBy(xpath="//*[@class=\"password\"]")
	WebElement Password;

	public void ProvidePassword(String b) {
		Password.clear();
		Password.sendKeys(b);
	}
	
	
	@FindBy(xpath="//*[@class=\"button-1 login-button\"]")
	WebElement Click;
	public void ProvideClick() {
		Click.click();
	}
	
}
