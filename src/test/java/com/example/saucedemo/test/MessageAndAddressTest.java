package com.example.saucedemo.test;

import com.example.saucedemo.test.base.Before;
import com.example.saucedemo.test.expected.ExpectedData;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.example.saucedemo.test.testData.loginData.LOGIN;
import static com.example.saucedemo.test.testData.loginData.PASSWORD;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MessageAndAddressTest extends Before {
    @Test
    @DisplayName("Провека адреса страницы после авторизации и заказе")
    public void checkAddressVerificationAfterOrderTest() {
        loginPage.login(LOGIN, PASSWORD);
        productPage.addingProductTheCart();
        productPage.clickingShoppingIcon();
        cartPage.clickButtonCheckout();
        checkoutPage.dataInput(generateData.generateFirstName()
                , generateData.generateLastName()
                , generateData.generateZip());
        overviewPage.clickFinishButton();
        String redirectURL = driver.getCurrentUrl();
        assertEquals(redirectURL, ExpectedData.EXPECTED_URL);
    }

    @Test
    @DisplayName("Проверка сообщения после авторизации и заказа")
    public void checkOfTheInscriptionAfterTheOrderTest() {
        loginPage.login(LOGIN, PASSWORD);
        productPage.addingProductTheCart();
        productPage.clickingShoppingIcon();
        cartPage.clickButtonCheckout();
        checkoutPage.dataInput(generateData.generateFirstName()
                , generateData.generateLastName()
                , generateData.generateZip());
        overviewPage.clickFinishButton();
        assertEquals(ExpectedData.EXPECTED_STR, completePage.getText());
    }
}
