package com.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="src/test/resources/cucumber/PostReq.feature",
		glue="com.stepdefinitions",plugin= {"pretty","html:target/cucumber-reports.html","json:target/cucumber-reports.json"}
		
		)
public class TestRunner extends AbstractTestNGCucumberTests {
	
	

}
