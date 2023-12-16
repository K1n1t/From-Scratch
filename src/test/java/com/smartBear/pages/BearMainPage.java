package com.smartBear.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BearMainPage {
    public BearMainPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }


    @FindBy(xpath = "//h2")
    WebElement header;

    public void validateHeader(String header){
        Assert.assertEquals(this.header.getText(),header);
    }
}
