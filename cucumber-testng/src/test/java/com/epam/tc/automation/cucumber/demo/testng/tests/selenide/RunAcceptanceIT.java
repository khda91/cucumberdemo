package com.epam.tc.automation.cucumber.demo.testng.tests.selenide;

import com.codeborne.selenide.Browsers;
import com.codeborne.selenide.Configuration;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.BeforeSuite;

@CucumberOptions(
        features = { "classpath:com.epam.tc.automation.cucumber.demo.testng.tests" },
        glue = "classpath:com.epam.tc.automation.cucumber.demo.testng.tests.selenide"
)
public class RunAcceptanceIT extends AbstractTestNGCucumberTests {

    @BeforeSuite
    public static void setUp() {
        Configuration.browser = Browsers.FIREFOX;
        Configuration.timeout = 10000;
        Configuration.pollingInterval = 300;
    }
}
