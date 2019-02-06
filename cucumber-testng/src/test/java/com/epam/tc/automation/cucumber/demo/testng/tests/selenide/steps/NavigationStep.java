package com.epam.tc.automation.cucumber.demo.testng.tests.selenide.steps;

import com.epam.tc.automation.cucumber.demo.pages.selenide.SelenideHomePage;
import cucumber.api.java.en.Given;

import static com.codeborne.selenide.Selenide.open;

public class NavigationStep extends StepBackground {

    @Given("^I open EPAM JDI site$")
    public void iOpenEpamJdiSite() {
        open(HOME_PAGE_URL);
        homePage = new SelenideHomePage();
    }
}
