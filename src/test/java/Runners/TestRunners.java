package Runners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

 
//@RunWith(Cucumber.class) 

@CucumberOptions(features="Features111", glue={"stepDefinitions"},plugin = {"json:target/cucumber.json"},
tags={"@Add_to_cart__"})
public class TestRunners extends AbstractTestNGCucumberTests{


}

