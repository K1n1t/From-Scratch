package com.smartBear.stepsDefinitions;

import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import utils.ConfigReader;
import utils.DriverHelper;

public class BearHook {
    WebDriver driver = DriverHelper.getDriver();

    @Before
    public void setDriver(){
        driver.get(ConfigReader.readProperty("smartBearURL"));
    }


}
