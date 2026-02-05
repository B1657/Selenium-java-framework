package com.qa.framework.test;

import com.qa.framework.base.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SmokeTest extends TestBase {
    @Test
    public void openAppTest() {
        String title = driver.getTitle();
        System.out.println("Page title is: " + title);
        Assert.assertTrue(title.contains("OrangeHRM"), "Title does not contain OrangeHRM");
    }
}
