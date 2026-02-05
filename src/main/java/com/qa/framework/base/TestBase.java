package com.qa.framework.base;

import com.qa.framework.config.ConfigReader;
import com.qa.framework.driver.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.Properties;

public class TestBase {
    protected WebDriver driver;
    protected Properties prop;

    @BeforeMethod
    public void setUp() {
        prop = ConfigReader.loadProperties();

        DriverFactory.initDriver(
                prop.getProperty("browser"),
                Boolean.parseBoolean(prop.getProperty("headless"))
        );

        driver = DriverFactory.getDriver();
        driver.get(prop.getProperty("url"));
    }

    @AfterMethod
    public void tearDown() {
        DriverFactory.quitDriver();
    }
}
