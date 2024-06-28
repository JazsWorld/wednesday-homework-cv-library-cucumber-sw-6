package uk.co.library.runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features", //path of feature
        glue = "uk/co/library/steps",// steps source root path
       plugin = {"html:target/cucumber-reports/cucumber.html",
               "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
               "json:target/cucumber-reports/cucumber.json"},
        tags = "@sanity"

)
public class RunCukeSanity extends AbstractTestNGCucumberTests {


}
