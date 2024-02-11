package com.examples.cucumber.pageObjects;

import com.examples.cucumber.utils.TestSetUp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class GooglePage {

    public WebDriver driver;
    public TestSetUp utility = new TestSetUp();

    By searchBox = By.name("q");
    By submitBtn = By.name("btnK");

    public void killChromeInstances() throws IOException {
        String[] cmds = {"killall","Google Chrome"};
        Runtime.getRuntime().exec(cmds);
    }

    public void launchBrowser() throws IOException {
        killChromeInstances();
        driver = utility.launchBrowser();
    }

    public void launchGoogle() throws IOException {
        launchBrowser();
        driver.get("https://www.google.com");
    }

    public void setSearchBox(String query){
        driver.findElement(searchBox).sendKeys(query);
    }

    public void clickSubmitBtn(){
        driver.findElement(submitBtn).submit();
    }

    public void verifyTitle(String expectedTitle){
        String actualTitle = driver.getTitle().toLowerCase();
        if (actualTitle.startsWith(expectedTitle)){
            System.out.println("Test case passed");
        }else{
            System.out.println("Test case failed");
        }
    }

}
