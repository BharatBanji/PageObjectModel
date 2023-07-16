package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Dashboard {
	
	public WebDriver driver;
	public Dashboard(WebDriver a) {
		driver=a;
	}

	// passing the webElement
	@FindBy(xpath="//*[@class=\"nav nav-pills nav-sidebar flex-column nav-legacy\"]//a[1]")
	WebElement Dashboard;
	
	//create a Dashboard object method
	public void  ClickDashboard() {
		Dashboard.click();	
	}
	
	
}
