package com.qa.framework.pages;

import com.qa.framework.driver.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DashboardPage {

        private WebDriver driver;
        private WebDriverWait wait;

        // Stable locator (page header)
        private By dashboardHeader = By.xpath("//h6[text()='Dashboard']");

        public DashboardPage() {
            this.driver = DriverFactory.getDriver();
            this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        }

        public boolean isDashboardLoaded() {
            return wait.until(
                    ExpectedConditions.visibilityOfElementLocated(dashboardHeader)
            ).isDisplayed();
        }
    }

