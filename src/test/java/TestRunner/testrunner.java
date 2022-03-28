package TestRunner;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import Util.testbase;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


	
	@CucumberOptions(features = {"src/test/resources/Feature"},
			plugin = {"json:target/cucumber.json", "html:target/site/cucumber-pretty"},

			glue = {"Stepdeff"},
			tags = {"@Test"},
			monochrome = true)


			public class testrunner extends AbstractTestNGCucumberTests {

				@BeforeTest
				public void LaunchAppURL() {
					testbase Open = new testbase();
					Open.initialize();
					
				}

				@AfterTest
				public void CloseAppURL() throws Exception {
					testbase Closed = new testbase();
					Thread.sleep(10000);
					Closed.driver.quit();
				
				
				}
				
			}





