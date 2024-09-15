package cucumberOptions;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
		features = "src/test/resources/features", 
		glue={"stepDefinitions"},
		monochrome=true,
		tags="@PlaceOrder or @SearchProduct",
		plugin= {"html:target/cucumber.html", "json:target/Cucumber.json","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"rerun:target/failed_scenario.txt"})
public class TestNGRunner extends AbstractTestNGCucumberTests{
	
	
	@Override
	@DataProvider(parallel=true)
	public Object[][] scenarios() {
		return super.scenarios();
	}

}
