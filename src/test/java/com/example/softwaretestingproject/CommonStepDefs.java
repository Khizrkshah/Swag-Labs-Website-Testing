package com.example.softwaretestingproject;

import io.cucumber.java.en.Given;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class CommonStepDefs extends AbstractStepDefs {

    @Given("the homepage is open")
    public void theHomepageIsOpen() {
        homePage.openPage();
    }
}