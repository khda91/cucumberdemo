package com.epam.tc.automation.cucumber.demo.testng.tests.selenium;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.BeforeSuite;

@CucumberOptions(
        features = { "classpath:com.epam.tc.automation.cucumber.demo.testng.tests" },
        glue = "classpath:com.epam.tc.automation.cucumber.demo.testng.tests.selenium"
)
public class RunAcceptanceIT extends AbstractTestNGCucumberTests {

    @BeforeSuite
    public static void setUp() {
        WebDriverManager.chromedriver().setup();
    }
}
