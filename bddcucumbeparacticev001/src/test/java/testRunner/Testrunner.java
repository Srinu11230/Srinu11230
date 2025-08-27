package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
@RunWith(Cucumber.class)
@CucumberOptions(
features = "src/test/resources/features",
glue={"stepDefinations", "Hooks", "utilities"},
monochrome = true,
tags = "",
plugin= {"pretty","html:target/cucumber-html-report.html",
		"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
		"json: target/cucumber-report.json "}

)
public class Testrunner{
	
	}
	/*
	 * public class Testrunner extends AbstractTestNGCucumberTests{
	 * 
	 * @Override
	 * 
	 * @DataProvider(parallel = true) public Object[][]scenarios(){ return
	 * super.scenarios(); } }
	 */

