package com.example.saucedemo.page;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

// page_url = https://www.saucedemo.com/checkout-step-one.html
public class CheckoutPage {
    @FindBy(xpath = "//*[@id='first-name']")
    public WebElement inputFirstName;

    @FindBy(xpath = "//*[@id='last-name']")
    public WebElement inputLastName;

    @FindBy(xpath = "//*[@id='postal-code']")
    public WebElement inputPostalCode;

    @FindBy(xpath = "//*[@id='continue']")
    public WebElement inputContinue;


    public CheckoutPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @Step("Entering core data at https://www.saucedemo.com/")
    public void dataInput(String firstName, String lastName, String zip) {
        inputFirstName.sendKeys(firstName);
        inputLastName.sendKeys(lastName);
        inputPostalCode.sendKeys(zip);
        inputContinue.click();
    }
}