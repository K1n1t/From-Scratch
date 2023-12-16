package com.smartBear.stepsDefinitions;

import com.smartBear.pages.BearLoginPage;
import com.smartBear.pages.BearMainPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.it.Ma;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import utils.BrowserUtil2;
import utils.DriverHelper;

import java.util.Map;

public class BearStepsDefinition {
    WebDriver driver = DriverHelper.getDriver();
    BearLoginPage loginPage = new BearLoginPage(driver);
    BearMainPage mainPage = new BearMainPage(driver);

    @When("user on login page and user validates title")
    public void user_on_login_page_and_user_validates_title(io.cucumber.datatable.DataTable dataTable) {
        Map<String, String> validateTitle = dataTable.asMap();
        Assert.assertEquals(BrowserUtil2.getTitle(driver), validateTitle.get("title1"));
    }
    @Then("user enters username and password")
    public void user_enters_username_and_password(io.cucumber.datatable.DataTable dataTable) {
        Map<String, String> userNameAndPassword = dataTable.asMap();
        loginPage.setUserNameAndPassword(userNameAndPassword.get("username"),userNameAndPassword.get("password"));
    }
    @Then("user clicks login button")
    public void user_clicks_login_button() {
        loginPage.setLoginBTN();
    }
    @Then("user validates the title of the next page")
    public void user_validates_the_title_of_the_next_page(io.cucumber.datatable.DataTable dataTable) {
        Map<String, String> validateSecondTitle = dataTable.asMap();
        Assert.assertEquals(driver.getTitle(), validateSecondTitle.get("title2"));
    }
    @Then("user validates header of the page")
    public void user_validates_header_of_the_page(io.cucumber.datatable.DataTable dataTable) {
        Map<String, String> headerMap = dataTable.asMap();
        mainPage.validateHeader(headerMap.get("header"));
    }
}
