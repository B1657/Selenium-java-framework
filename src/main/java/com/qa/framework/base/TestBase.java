package com.qa.framework.base;

import com.qa.framework.config.ConfigReader;
import com.qa.framework.driver.DriverFactory;
import com.qa.framework.pages.DashboardPage;
import com.qa.framework.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.util.Properties;

public class TestBase {
    protected WebDriver driver;
    protected Properties prop;

    @BeforeClass
    public void setUp() {
        prop = ConfigReader.loadProperties();

        DriverFactory.initDriver(
                prop.getProperty("browser"),
                Boolean.parseBoolean(prop.getProperty("headless"))
        );

        driver = DriverFactory.getDriver();
        driver.get(prop.getProperty("url"));
    }
    @BeforeMethod
    public void Login() {
        LoginPage loginPage = new LoginPage();
        loginPage.enterUsername("Admin");
        loginPage.enterPassword("admin123");
        loginPage.clickLogin();

        DashboardPage dashboardPage = new DashboardPage();
        Assert.assertTrue(dashboardPage.isDashboardLoaded(),
                "Dashboard page did not load after login");
    }

    //@AfterMethod
    //public void tearDown() {
     //   DriverFactory.quitDriver();
   // }
}
