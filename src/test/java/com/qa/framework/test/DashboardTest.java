package com.qa.framework.test;

import com.qa.framework.base.TestBase;
import com.qa.framework.pages.DashboardPage;
import com.qa.framework.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DashboardTest extends TestBase {
    @Test(groups = {"smoke"})
    public void verifyDashboardIsLoadedAfterLogin() {

        // Arrange: Login
        LoginPage loginPage = new LoginPage();
        loginPage.enterUsername("Admin");
        loginPage.enterPassword("admin123");
        loginPage.clickLogin();

        //  Land on Dashboard
        DashboardPage dashboardPage = new DashboardPage();

        // Assert: Dashboard loaded
        Assert.assertTrue(dashboardPage.isDashboardLoaded(),
                "Dashboard page did not load after successful login");
    }
}
