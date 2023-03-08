package com.example.saucedemo.test;

import com.example.saucedemo.test.base.Before;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.example.saucedemo.test.expected.ExpectedData.MESSAGE_ERROR;
import static com.example.saucedemo.test.testData.loginData.INCORRECT_LOGIN;
import static com.example.saucedemo.test.testData.loginData.INCORRECT_PASSWORD;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class InvalidLoginDataEntryTest extends Before {

    @Test
    @DisplayName("Проверка сообщения при неверных данных юзера")
    public void checkForInvalidLoginTest() {
        loginPage.login(INCORRECT_LOGIN, INCORRECT_PASSWORD);
        assertEquals(MESSAGE_ERROR, loginPage.h3Error.getText());
    }
}
