package com.example.saucedemo.page;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

// page_url = https://www.saucedemo.com/checkout-complete.html
public class CompletePage {
    @FindBy(xpath = "//h2[@class='complete-header']")
    public WebElement h2ThankYouForYour;


    public CompletePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @Step("Getting the text of the actual message")
    public String getText() {
        return h2ThankYouForYour.getText();
    }
}