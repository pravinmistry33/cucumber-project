package com.examples.cucumber.utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Report {

    public void extentReport(){
        ExtentSparkReporter spark = new ExtentSparkReporter("target/Report.html");
        ExtentReports extent = new ExtentReports();
        extent.attachReporter(spark);
        ExtentTest test = extent.createTest("MyFirstTest");
        test.log(Status.INFO, "This is a logging event for MyFirstTest, and it passed!");
        test.pass(MediaEntityBuilder.createScreenCaptureFromBase64String("base64").build());
        extent.flush();
    }

}
