package com.openmrs.stepDefinition;

import com.openmrs.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import utils.ConfigReader;
import utils.DriverHelper;

public class StepDefinitions {

    WebDriver driver = DriverHelper.getDriver();
    LoginPage loginPage = new LoginPage(driver);

    @Given("user is open mrs user provide their credentails")
    public void user_is_open_mrs_user_provide_their_credentails() {
        loginPage.setUserNameAndPassword(ConfigReader.readProperty("username"),ConfigReader.readProperty("password"));
    }

    @Then("user validates title as {string} and {string}")
    public void user_validates_title_as_and(String title, String url) {
        Assert.assertEquals(title,driver.getTitle());
        Assert.assertEquals(url,driver.getCurrentUrl());
    }


    @Given("user open mrs login page and provides invalid credential username as {string} and {string}")
    public void user_open_mrs_login_page_and_provides_invalid_credential_username_as_and(String name, String password) {
        loginPage.setUserNameAndPassword(name,password);
    }
    @Then("user validates an error message as {string}")
    public void user_validates_an_error_message_as(String errorMsg) {
        Assert.assertEquals(errorMsg, loginPage.getErrorMsg());
    }

}
