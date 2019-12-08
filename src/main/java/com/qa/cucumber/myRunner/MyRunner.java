package com.qa.cucumber.myRunner;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.cucumber.testng.CucumberFeatureWrapper;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.PickleEventWrapper;
import io.cucumber.testng.TestNGCucumberRunner;

	@CucumberOptions(
	        features = "/Users/Inside/workspace/CucumberDemo/src/main/java/com/qa/cucumber/features",
	        glue = {"com.qa.cucumber.stepDefinitions"},
	        monochrome = true,
	        dryRun= false,
	        tags = {"@Test1"},
	     /*  format = {
	                "pretty",
	                "html:target/cucumber-reports/cucumber-pretty",
	                "json:target/cucumber-reports/CucumberTestReport.json",
	                "rerun:target/cucumber-reports/rerun.txt"
	        },*/plugin = "json:target/cucumber-reports/CucumberTestReport.json")
	public class MyRunner
	{
		 private TestNGCucumberRunner testNGCucumberRunner;
		 
		 @BeforeClass(alwaysRun = true)  
		    public void setUpClass() throws Exception {  
		        testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());  
		  }  

		    @Test(groups = "Cucumber", description = "Runs Cucumber Feature", dataProvider = "scenarios")  
		    public void scenario(PickleEventWrapper pickleEvent, CucumberFeatureWrapper cucumberFeature) throws Throwable {  
		        testNGCucumberRunner.runScenario(pickleEvent.getPickleEvent());  
		  }  

		    @DataProvider  
		  public Object[][] scenarios() {  
		        return testNGCucumberRunner.provideScenarios();  
		  }  

		    @AfterClass(alwaysRun = true)  
		    public void tearDownClass() throws Exception {  
		        testNGCucumberRunner.finish();  
		  }  
	}