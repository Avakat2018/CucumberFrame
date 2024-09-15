package cucumberOptions;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
		features = "@target/failed_scenario.txt", 
		glue={"stepDefinitions"},
		monochrome=true,
		plugin= {"html:target/cucumber.html", "json:target/Cucumber.json","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
public class FailedCaseTestRunner extends AbstractTestNGCucumberTests{
	
	
	@Override
	@DataProvider(parallel=true)
	public Object[][] scenarios() {
		return super.scenarios();
	}

}
