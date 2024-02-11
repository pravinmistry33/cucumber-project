package com.examples.cucumber.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty","json:target/cucumber.json","html:target/cucumber"},
        features = "src/test/resources/features",
        glue = "com.examples.cucumber.stepdefinitions",
        tags = "@Regression or @Smoke",
        monochrome = false)

public class RunCucumberTest{
}
