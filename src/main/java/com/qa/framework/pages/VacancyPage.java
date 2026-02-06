package com.qa.framework.pages;

import com.qa.framework.driver.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class VacancyPage {
    private WebDriverWait wait;
    private WebDriver driver;
    private By vacancyTab = By.xpath("//a[text()='Vacancies']"); //vacancy button right to candidates on top
    private By addVacancyButton = By.xpath("//button[normalize-space()='Add']"); //green add button

    private By VacancynameInput = By.xpath("//label[text()='Vacancy Name']/following::input[contains(@class,'oxd-input')][1]");

    private By JobTitleDropDownLocator = By.xpath("//div[@class='oxd-select-text--after']");
    private By DropDownSelectQALead = By.xpath("//span[text()='QA Engineer']");   //div[@class='oxd-grid-3 orangehrm-full-width-grid']//div[4]

    private By VacancyDescriptionInput = By.xpath("//*[@placeholder='Type description here']");
    private String description = "Prepare detailed٫ comprehensive and well-structured test plans and test cases\n" +
            "Review requirements٫ specifications and technical design documents to provide timely and meaningful feedback\n" +
            "Plan and coordinate testing activities٫ thoroughly identifying and documenting bugs";
    private By HiringManagerNameInput = By.xpath("//input[@placeholder='Type for hints...']");
    private By HiringmanagernameSearchLocator = By.xpath("//span[text()='bala kumar ravi']");


    private By NumberOfPositionsLocator = By.xpath("//label[text()='Number of Positions']/following::input[@class='oxd-input oxd-input--active']");


    private By ClicksaveButton = By.xpath("//button[@type='submit']");
    //private By VerifyrecordInTable = By.xpath("//div[@class='oxd-table-cell oxd-padding-cell']/following::div[text()='bala ravi']");



    public VacancyPage() {
        this.driver = DriverFactory.getDriver();
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void ClickVacancyButton() {
        wait.until(ExpectedConditions.elementToBeClickable(vacancyTab)).click();
    }

    public void ClickAddVacancyButton() {
        wait.until(ExpectedConditions.elementToBeClickable(addVacancyButton))
                .click();
    }

    public void EnterVacancyName(String name) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(VacancynameInput))
                .sendKeys(name);
    }

    public void SelectJobTitle() {
        wait.until(ExpectedConditions.elementToBeClickable(JobTitleDropDownLocator))
                .click();
        wait.until(ExpectedConditions.elementToBeClickable(DropDownSelectQALead))
                .click();
    }

    public void EnterVacancyDescription(String description) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(VacancyDescriptionInput))
                .sendKeys(description);
    }

    public void EnterHiringManagerName(String name) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(HiringManagerNameInput))
                .sendKeys(name);
        wait.until(ExpectedConditions.elementToBeClickable(HiringmanagernameSearchLocator))
                .click();
    }

    public void EnterNumberOfPosition(String number) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(NumberOfPositionsLocator))
                .sendKeys(number);
    }

    public void saveButtonClick() {
        wait.until(ExpectedConditions.elementToBeClickable(ClicksaveButton)).click();
    }

}
