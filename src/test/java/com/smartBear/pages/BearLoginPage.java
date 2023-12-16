package com.smartBear.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BearLoginPage {
    public BearLoginPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    @FindBy(css = "#ctl00_MainContent_username")
    WebElement userName;

    @FindBy(css = "#ctl00_MainContent_password")
    WebElement password;

    @FindBy(css = "#ctl00_MainContent_login_button")
    WebElement loginBTN;

    public void setUserNameAndPassword(String userName, String password) {
        this.userName.sendKeys(userName);
        this.password.sendKeys(password);
    }

    public void setLoginBTN(){
        loginBTN.click();
    }
}
