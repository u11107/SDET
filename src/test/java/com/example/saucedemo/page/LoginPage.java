package com.example.saucedemo.page;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

// page_url = https://www.saucedemo.com/
public class LoginPage {
  
    @FindBy(css = "input[name='user-name']")
    private WebElement inputUsername;

    @FindBy(css = "input[name='password']")
    private WebElement inputPassword;

    @FindBy(css = "input[value='Login']")
    private WebElement inputLoginButton;

    @FindBy(xpath = "//h3[contains(@data-test, 'error')]")
    public WebElement h3Error;

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @Step("Login under test data")
    public LoginPage login(String login, String password) {
        inputUsername.sendKeys(login);
        inputPassword.sendKeys(password);
        inputLoginButton.click();
        return this;
    }
}
