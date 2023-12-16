package com.openmrs.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtil2;

public class LoginPage {
    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//input[@placeholder='Enter your username']")
    WebElement userName;

    @FindBy(xpath = "//input[@placeholder='Enter your password']")
    WebElement password;

    @FindBy(xpath = "//li[.='Inpatient Ward']")
    WebElement clickWard;

    @FindBy(xpath = "//input[@class='btn confirm']")
    WebElement submitBtn;

    @FindBy(css = "#error-message")
    WebElement errorMsg;

    public String getErrorMsg(){
        return BrowserUtil2.getText(this.errorMsg);
    }
    public void setUserNameAndPassword(String name, String password){
        this.userName.sendKeys(name);
        this.password.sendKeys(password);
        this.clickWard.click();
        this.submitBtn.click();
    }


}
