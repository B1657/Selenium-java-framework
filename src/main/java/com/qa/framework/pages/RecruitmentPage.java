package com.qa.framework.pages;

import com.qa.framework.driver.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RecruitmentPage {
    private WebDriver driver;
    private WebDriverWait wait;
    private By recruitmentPath= By.xpath("//span[text()='Recruitment']");

    public RecruitmentPage(){
        this.driver= DriverFactory.getDriver();
        this.wait=new WebDriverWait(driver,Duration.ofSeconds(10));
    }

    public  void ClickButton(){
        wait.until(ExpectedConditions.elementToBeClickable(recruitmentPath)).click();
    }
    public boolean IsRecruitmentPageLoaded(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(recruitmentPath)).isDisplayed();
    }
}
