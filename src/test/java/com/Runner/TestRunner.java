package com.Runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.BaseClass.BaseClass;
import com.Helper.FileReaderManager;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src//test//java//com//feature",
glue="com.StepDefinition")
public class TestRunner {

	public static WebDriver driver;
	
	@BeforeClass
	public static void setUp() throws Throwable {
		String browser = FileReaderManager.getInstanceFileReaderManager().getInstanceCR().getBrowser();
		driver = BaseClass.browserName(browser);
	}
	
	@AfterClass
	public static void tearDown() {
		driver.close();
	}
}
