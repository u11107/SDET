package com.example.saucedemo.test.base;

import com.example.saucedemo.page.*;
import com.example.saucedemo.test.util.GenerateData;
import org.openqa.selenium.WebDriver;


public class Base {

    protected WebDriver driver;
    protected LoginPage loginPage;
    protected ProductPage productPage;
    protected CartPage cartPage;
    protected GenerateData generateData;
    protected CheckoutPage checkoutPage;
    protected OverviewPage overviewPage;
    protected CompletePage completePage;
}
