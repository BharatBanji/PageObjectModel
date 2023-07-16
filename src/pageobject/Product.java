package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Product {

	public WebDriver driver;
	public Product(WebDriver a1) {
		driver=a1;
	}
	
//click the catalog than show the all inner element
	@FindBy(xpath="//li[@class=\"nav-item has-treeview menu-is-opening menu-open\"]/a")
	WebElement catalog;
// create a object of the catalog object method
	public void ClickCatalog() {
		catalog.click();
	}
	
	
	
// click the product and the fill the comman formality
	@FindBy(xpath="//a[@class=\"nav-link active\"]//following::p[2]")
	WebElement product;
// create a product object method
	public void ClickProduct() {
		product.click();
	}
}
