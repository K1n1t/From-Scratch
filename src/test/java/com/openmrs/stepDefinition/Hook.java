package com.openmrs.stepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;
import utils.BrowserUtil2;
import utils.ConfigReader;
import utils.DriverHelper;

public class Hook {
    WebDriver driver = DriverHelper.getDriver();
    @Before
    public void setDriver(){
        driver.get(ConfigReader.readProperty("mrsURL"));
    }
    @After
    public void tearDown(Scenario scenario){
        BrowserUtil2.takeScreenshotCucumber(scenario, driver);
        driver.quit();
    }

}
