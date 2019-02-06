package com.epam.tc.automation.cucumber.demo.junit.tests.selenium;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"io.qameta.allure.cucumberjvm.AllureCucumberJvm"},
        features = { "classpath:com.epam.tc.automation.cucumber.demo.junit.tests" },
        glue = { "classpath:com.epam.tc.automation.cucumber.demo.junit.tests.selenium" }
)
public class RunAcceptanceTest {

    @BeforeClass
    public static void setUp() {
        WebDriverManager.chromedriver().setup();
    }
}
