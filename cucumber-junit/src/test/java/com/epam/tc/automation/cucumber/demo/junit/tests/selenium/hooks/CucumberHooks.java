package com.epam.tc.automation.cucumber.demo.junit.tests.selenium.hooks;

import com.epam.tc.automation.cucumber.demo.junit.tests.selenium.context.TestContext;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class CucumberHooks {

    private WebDriver driver;

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
        driver.manage().timeouts().pageLoadTimeout(20000, TimeUnit.MILLISECONDS);
        TestContext.getInstance().setDriver(driver);
    }

    @After
    public void tearDown() {
        driver.close();
        TestContext.getInstance().setDriver(null);
    }
}
