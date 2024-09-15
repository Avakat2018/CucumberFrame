package stepDefinitions;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.CheckOutPage;
import utils.TestContextSetUp;

public class CheckOutStepDef {	
	
 TestContextSetUp tcs;
	public CheckOutPage checkOutPage;

	public CheckOutStepDef(TestContextSetUp tcs) {
		this.tcs = tcs;
		this.checkOutPage= tcs.pgeObjvar.getCheckOutPage();
	}
	
	@Then("^go to checkout and validate the (.+) in checkout Page$")
	public void go_to_checkout_and_validate_in_checkout_Page(String name) throws InterruptedException {
		checkOutPage.checkOutPage();
		//Thread.sleep(2000);
		
	}
	
	@Then("enter promo code and place order")
	public void enter_promo_code_and_place_order() {
		
		Assert.assertTrue(checkOutPage.verifyPromoBtn());
		Assert.assertTrue(checkOutPage.verifyPlaceOrder());
		
		
	}
}
