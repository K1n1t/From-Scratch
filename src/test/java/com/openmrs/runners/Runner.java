package com.openmrs.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = "src/test/resources/openmrs",
        glue = "com/openmrs/stepDefinition",
        dryRun = false,
   // plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
     //      "pretty", "json:target/cucumber-reports/Cucumber.json"}

        plugin = {"pretty", "html:target/uiReport.html","rerun:target/uiFailedTests.txt",
                "json:target/cucumber-reports/cucumber.json"}

        //plugin = {"pretty", "html:target/uiReport.html", "rerun:target/uiFailedTests.txt"}

)

public class Runner {
}
