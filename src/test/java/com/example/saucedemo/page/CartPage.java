package com.example.saucedemo.page;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

// page_url = https://www.saucedemo.com/cart.html
public class CartPage {
    @FindBy(xpath = "//button[@id='checkout']")
    public WebElement buttonCheckout;

    public CartPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
@Step("Clicking on the Checkout button")
    public void clickButtonCheckout(){
        buttonCheckout.click();
    }
}