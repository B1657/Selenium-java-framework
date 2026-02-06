package com.qa.framework.test;

import com.qa.framework.base.TestBase;
import com.qa.framework.pages.RecruitmentPage;
import com.qa.framework.pages.VacancyPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VacancyTest extends TestBase {

    @Test(groups={"smoke"})
    public void vacancTest(){

        RecruitmentPage recruitmentPage=new RecruitmentPage();
        recruitmentPage.ClickButton();


        VacancyPage vacancyPage=new VacancyPage();
        vacancyPage.ClickVacancyButton();
        vacancyPage.ClickAddVacancyButton();
        vacancyPage.EnterVacancyName("QA Tester");
        vacancyPage.SelectJobTitle();
        vacancyPage.EnterVacancyDescription("Prepare detailed٫ comprehensive and well-structured test plans and test cases\n" +
                "Review requirements٫ specifications and technical design documents to provide timely and meaningful feedback\n" +
                "Plan and coordinate testing activities٫ thoroughly identifying and documenting bugs");
        vacancyPage.EnterHiringManagerName("bala");
        vacancyPage.EnterNumberOfPosition("1");
        vacancyPage.saveButtonClick();
        vacancyPage.ClickVacancyButton();


    }
}
