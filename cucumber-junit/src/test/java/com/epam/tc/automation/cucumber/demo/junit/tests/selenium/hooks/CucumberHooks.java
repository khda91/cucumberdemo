package com.epam.tc.automation.cucumber.demo.junit.tests.selenium.hooks;

import com.epam.tc.automation.cucumber.demo.junit.tests.selenium.context.TestContext;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class CucumberHooks {

    private WebDriver driver;

    @Before(value = "@multiBefore1")
    public void setUp1() {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
        driver.manage().timeouts().pageLoadTimeout(20000, TimeUnit.MILLISECONDS);
        TestContext.getInstance().setDriver(driver);
        System.out.println("@multiBefore1");
    }

    @After(value = "@multiBefore1")
    public void tearDown1() {
        driver.close();
        TestContext.getInstance().setDriver(null);
        System.out.println("@multiBefore1");
    }

    @Before(value = "@multiBefore2")
    public void setUp2() {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
        driver.manage().timeouts().pageLoadTimeout(20000, TimeUnit.MILLISECONDS);
        TestContext.getInstance().setDriver(driver);
        System.out.println("@multiBefore2");
    }

    @After(value = "@multiBefore2")
    public void tearDown2() {
        driver.close();
        TestContext.getInstance().setDriver(null);
        System.out.println("@multiBefore2");
    }
}
