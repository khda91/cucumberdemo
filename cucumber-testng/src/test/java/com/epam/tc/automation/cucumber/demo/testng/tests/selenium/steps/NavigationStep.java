package com.epam.tc.automation.cucumber.demo.testng.tests.selenium.steps;

import com.epam.tc.automation.cucumber.demo.pages.selenium.SeleniumHomePage;
import cucumber.api.java.en.Given;

public class NavigationStep extends StepBackground {

    @Given("^I open EPAM JDI site$")
    public void iOpenEpamJdiSite() {
        driver.get(HOME_PAGE_URL);
        homePage = new SeleniumHomePage(driver);
    }
}
