package com.example.saucedemo.test.base;

import com.example.saucedemo.page.*;
import com.example.saucedemo.test.util.GenerateData;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static com.example.saucedemo.test.url.Url.URL;

public class Before extends Base {

    @BeforeEach
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get(URL);
        loginPage = new LoginPage(driver);
        productPage = new ProductPage(driver);
        cartPage = new CartPage(driver);
        checkoutPage = new CheckoutPage(driver);
        generateData = new GenerateData(driver);
        overviewPage = new OverviewPage(driver);
        completePage = new CompletePage(driver);
    }
    @AfterEach
    public void tearDown() {
        driver.quit();
    }
}
