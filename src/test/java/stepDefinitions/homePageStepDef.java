
package stepDefinitions;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HomePage;
import utils.TestContextSetUp;

public class homePageStepDef {

	TestContextSetUp tcs;
	HomePage hp;

	public homePageStepDef(TestContextSetUp tcs) {
		this.tcs = tcs;
		this.hp = tcs.pgeObjvar.getHomePage();
	}

	@Given("User is on Grenkart landing page")
	public void user_is_on_grenkart_landing_page() {
	Assert.assertTrue(hp.getTitle().contains("GreenKart"));

	}

	@When("^user searched for shotname (.+) and extract actual name of product$")
	public void user_searched_for_shotname_and_extract_actual_name_of_product(String name) throws InterruptedException {

		hp.searchProduct(name);
		Thread.sleep(2000);
		tcs.prodName = hp.getProdName().split("-")[0].trim();
		System.out.println(tcs.prodName);

	}
	
	
	@When("add the {string} quantity")
	public void add_the_quantity(String quantity) {
		
		hp.addQuantity(Integer.parseInt(quantity));
		hp.addToCart();
		
	} 
}
