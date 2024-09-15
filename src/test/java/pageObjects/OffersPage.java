package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OffersPage {
	
	public WebDriver driver;
	By search = By.id("search-field");
	By prodName = By.xpath("//tbody/tr/td[1]");
	
	public OffersPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void searchProd(String name) {
		driver.findElement(search).sendKeys(name);
		
	}
	
	public String getProd() {
		return driver.findElement(prodName).getText();
	}

}
