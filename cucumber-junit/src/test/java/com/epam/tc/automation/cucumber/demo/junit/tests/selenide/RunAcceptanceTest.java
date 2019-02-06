package com.epam.tc.automation.cucumber.demo.junit.tests.selenide;

import com.codeborne.selenide.Browsers;
import com.codeborne.selenide.Configuration;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"io.qameta.allure.cucumberjvm.AllureCucumberJvm"},
        features = {"classpath:com.epam.tc.automation.cucumber.demo.junit.tests"},
        glue = "classpath:com.epam.tc.automation.cucumber.demo.junit.tests.selenide"
)
public class RunAcceptanceTest {

    @BeforeClass
    public static void setUp() {
        Configuration.browser = Browsers.FIREFOX;
        Configuration.timeout = 10000;
        Configuration.pollingInterval = 300;
    }
}
