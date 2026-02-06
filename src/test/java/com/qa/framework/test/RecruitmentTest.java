package com.qa.framework.test;

import com.qa.framework.base.TestBase;
import com.qa.framework.pages.DashboardPage;
import com.qa.framework.pages.LoginPage;
import com.qa.framework.pages.RecruitmentPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RecruitmentTest extends TestBase {

    @Test(groups = {"smoke"})
    public void ClickRecruitmentButton_openRecruitmentPage(){
        LoginPage loginPage = new LoginPage();
        loginPage.enterUsername("Admin");
        loginPage.enterPassword("admin123");
        loginPage.clickLogin();

        DashboardPage dashboardPage = new DashboardPage();
        Assert.assertTrue(dashboardPage.isDashboardLoaded(),
                "Dashboard page did not load after successful login");

        RecruitmentPage recruitmentPage=new RecruitmentPage();
        recruitmentPage.ClickButton();

        //Assertion
        Assert.assertTrue(recruitmentPage.IsRecruitmentPageLoaded(),"RecruitmentPage did " +
                "not open after successful login");
    }

}
