package com.epam.tc.automation.cucumber.demo.junit.tests.selenium.steps;

import cucumber.api.java.en.Then;

import static org.junit.Assert.assertEquals;

public class AssertionStep extends StepBackground {

    @Then("^User name should be '([^\"]*)'")
    public void t(String username) {
        assertEquals(username, homePage.getUserNameText());
    }
}
