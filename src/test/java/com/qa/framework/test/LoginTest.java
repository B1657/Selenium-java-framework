package com.qa.framework.test;

import com.qa.framework.base.TestBase;
import com.qa.framework.driver.DriverFactory;
import com.qa.framework.pages.LoginPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {

    @Test(groups = "smoke")
    public void loginTest() {

        LoginPage loginPage = new LoginPage();
        loginPage.enterUsername("Admin");
        loginPage.enterPassword("admin123");
        loginPage.clickLogin();


    }
}
