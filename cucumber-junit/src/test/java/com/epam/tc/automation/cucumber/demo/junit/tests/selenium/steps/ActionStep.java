package com.epam.tc.automation.cucumber.demo.junit.tests.selenium.steps;

import cucumber.api.java.en.When;

public class ActionStep extends StepBackground {

    @When("^I login as user '([^\"]*)' with password '([^\"]*)'$")
    public void iLoginAsUserWithPassword(String username, String password) {
        homePage.login(username, password);
    }
}
