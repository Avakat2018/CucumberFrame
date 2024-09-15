package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOutPage {

	public WebDriver driver;

	By cart = By.xpath("//header/div[1]/div[3]/a[4]/img[1]");
	By checkout = By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]");
	By promoBtn = By.cssSelector(".promoBtn");
	By placeOrder = By.xpath("//button[contains(text(),'Place Order')]");
			

	public CheckOutPage(WebDriver driver) {
		this.driver = driver;

	}

	public void checkOutPage() {
		driver.findElement(cart).click();
		driver.findElement(checkout).click();
	}
	
	public Boolean verifyPromoBtn() {
		return driver.findElement(promoBtn).isDisplayed();
	}
	
	public Boolean verifyPlaceOrder() {
		return driver.findElement(placeOrder).isDisplayed();
	}

}
