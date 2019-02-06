package com.epam.tc.automation.cucumber.demo.junit.tests.selenium.steps;

import com.epam.tc.automation.cucumber.demo.junit.tests.selenium.context.TestContext;
import com.epam.tc.automation.cucumber.demo.pages.selenium.SeleniumHomePage;
import org.openqa.selenium.WebDriver;

public abstract class StepBackground {

    static final String HOME_PAGE_URL = "https://epam.github.io/JDI/index.html";

    WebDriver driver;

    static SeleniumHomePage homePage;

    protected StepBackground() {
        driver = TestContext.getInstance().getDriver();
    }

}
