package Runners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

 
//@RunWith(Cucumber.class) 

@CucumberOptions(features="Features111", glue={"stepDefinitions"},plugin = {"json:target/cucumber.json"},
tags={"@Successful_login"})
public class TestRunners extends AbstractTestNGCucumberTests{


}

