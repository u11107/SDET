package com.example.saucedemo.test.util;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class GenerateData {
    protected static final Faker faker = new Faker();
    public GenerateData(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public String generateFirstName() {
        String firstName;
        return firstName = faker.name().firstName();
    }

    public String generateLastName() {
        String lastName;
        return lastName = faker.name().lastName();
    }

    public String generateZip() {
        String zip;
        return zip = faker.address().zipCode();
    }


}
