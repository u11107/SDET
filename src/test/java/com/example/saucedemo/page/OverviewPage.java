package com.example.saucedemo.page;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

// page_url = https://www.saucedemo.com/checkout-step-two.html
public class OverviewPage {
    @FindBy(xpath = "//*[@id='finish']")
    public WebElement buttonFinish;

    public OverviewPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @Step("Login under test data")
    public void clickFinishButton() {
        buttonFinish.click();
    }
}