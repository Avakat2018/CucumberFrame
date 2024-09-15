
package stepDefinitions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HomePage;
import pageObjects.OffersPage;
import utils.TestContextSetUp;

public class OfferPageStepDef {

	TestContextSetUp tcs;

	public OfferPageStepDef(TestContextSetUp tcs) {
		this.tcs = tcs;
	}

	String offerName;

	public void switchToOffersPage() {

		HomePage hp = tcs.pgeObjvar.getHomePage();
		hp.goToDealsPage();
		tcs.genericUtils.switchToChildWindow();
	}

	@Then("^User searches for (.+) shortname in offers page to check$")
	public void user_searches_for_shortname_in_offers_page_to_check(String name) throws InterruptedException {

		switchToOffersPage();

		OffersPage op = tcs.pgeObjvar.getOffersPage();
		// OffersPage op = new OffersPage(tcs.driver);
		op.searchProd(name);
		Thread.sleep(2000);
		offerName = op.getProd().trim();

	}

	@Then("Validate product name between offers and Landing page")
	public void compare_product() {
		Assert.assertEquals(tcs.prodName, offerName);
		//ssstcs.driver.quit();
	}
}
