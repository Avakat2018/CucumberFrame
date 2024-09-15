package utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import pageObjects.PageObjectManager;

public class TestContextSetUp {

	public WebDriver driver;
	public String prodName;
	public PageObjectManager pgeObjvar;
	public TestBase testBase;
	public GenericUtils genericUtils;

	public TestContextSetUp() throws IOException {

		testBase = new TestBase();
		try {
			pgeObjvar = new PageObjectManager(testBase.WebDriverManager());
		} catch (IOException e) {

			e.printStackTrace();
		}
		try {
			genericUtils = new GenericUtils(testBase.WebDriverManager());
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

}
