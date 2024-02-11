package com.examples.cucumber.stepdefinitions;

import com.examples.cucumber.pageObjects.GooglePage;
//import com.examples.cucumber.utils.Report;
import com.examples.cucumber.utils.Report;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;

public class googleSingleSearchStepDef {

    public GooglePage gPage = new GooglePage();
    public  Report report = new Report();

    /******* Google single search functionality ******/
    @Given("I am on Google search page to do single search")
    public void i_am_on_google_search_page_to_do_single_search() throws IOException {
        gPage.launchGoogle();
        report.extentReport();
    }
    @When("I search for watch")
    public void i_search_for_watch() {
        gPage.setSearchBox("watch");
        gPage.clickSubmitBtn();
    }

    @Then("the page tile should start with watch")
    public void verifyTitle() {
        gPage.verifyTitle("watch");
    }

}
