package com.epam.tc.automation.cucumber.demo.testng.tests.selenide.steps;

import cucumber.api.java.en.Then;

import static org.testng.Assert.assertEquals;

public class AssertionStep extends StepBackground {

    @Then("^User name should be '([^\"]*)'")
    public void t(String username) {
        assertEquals(username, homePage.getUserNameText());
    }
}
