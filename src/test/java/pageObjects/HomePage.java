package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

	public WebDriver driver;
	By search = By.className("search-keyword");
	By prodName = By.cssSelector("h4.product-name");
	By dealsPage = By.linkText("Top Deals");
	By quantity = By.xpath("//a[contains(text(),'+')]");
	By addToCart = By.xpath("//button[contains(text(),'ADD TO CART')]");

	public HomePage(WebDriver driver) {
		this.driver = driver;

	}

	public void searchProduct(String name) {
		driver.findElement(search).sendKeys(name);
	}

	public String getProdName() {
		return driver.findElement(prodName).getText();
	}

	public void goToDealsPage() {
		driver.findElement(dealsPage).click();
	}

	public String getTitle() {

		return driver.getTitle();
	}

	public void addQuantity(int quan) {
		int i = quan - 1;
		while (i > 0) {
			driver.findElement(quantity).click();
			i--;
		}
	}

	public void addToCart() {
		driver.findElement(addToCart).click();
	}

}
