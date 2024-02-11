package com.examples.cucumber.utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestSetUp {

    public WebDriver driver;

    public WebDriver launchBrowser() {
        // Write code here that turns the phrase above into concrete actions
        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriverManager.chromedriver().driverVersion("120.0.6099.10900").setup();
        driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        return driver;
    }

}
