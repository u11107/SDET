package com.example.saucedemo.page;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {
    public ProductPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-backpack']")
    public WebElement buttonAddCartSauceLabs;

    @FindBy(xpath = "//a[contains(@class, 'shopping_cart_link')]")
    public WebElement linkShoppingCart;

    @FindBy(xpath = "//span[@class='title']")
    public WebElement spanProducts;

    @Step("Adding an item to the cart")
    public void addingProductTheCart(){
        buttonAddCartSauceLabs.click();
    }

    @Step("Clicking on the trash icon")
    public void clickingShoppingIcon(){
        linkShoppingCart.click();
    }
}
