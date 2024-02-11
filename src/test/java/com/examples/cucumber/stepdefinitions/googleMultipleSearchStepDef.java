package com.examples.cucumber.stepdefinitions;

import com.examples.cucumber.pageObjects.GooglePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;

public class googleMultipleSearchStepDef {

    public GooglePage gPage = new GooglePage();

    /******* Google multi search functionality ******/
    @Given("I am on Google search page to do multiple search")
    public void i_am_on_google_search_page_to_do_multiple_search() throws IOException {
        gPage.launchGoogle();
    }
    @When("I do multiple search for {string}")
    public void i_do_multiple_search_for(String query) {
        // Write code here that turns the phrase above into concrete actions
        gPage.setSearchBox(query);
        gPage.clickSubmitBtn();
        }

    @Then("the page tile should start with {string}")
    public void checkTitle(String titleStartsWith) {
        gPage.verifyTitle(titleStartsWith);
    }

}
