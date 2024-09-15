package pageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
	
	public WebDriver driver;
	public HomePage homePageVar;
	public OffersPage offersPageVar;
	public CheckOutPage checkOutPageVar;
	
	
	
	
	public PageObjectManager(WebDriver driver) {
		this.driver=driver;
		
	}
	
	
	public HomePage getHomePage() {
		homePageVar=new HomePage(driver);
		return homePageVar;
	}
	
	public OffersPage getOffersPage() {
		offersPageVar=new OffersPage(driver);
		return offersPageVar;
	} 

	public CheckOutPage getCheckOutPage() {
		checkOutPageVar=new CheckOutPage(driver);
		return checkOutPageVar;
	} 

}
