package com.smartBear.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/smartBear",
        glue = "com/smartBear/stepsDefinitions",
        dryRun = false,
        plugin = {"pretty", "html:target/uiReport.html","rerun:target/uiFailedTests.txt",
        "json:target/cucumber-reports/cucumber.json"}

)
public class BearRunner {
}
