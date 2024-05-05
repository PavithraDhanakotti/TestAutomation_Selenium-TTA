package org.TestAutomationSelenium.Selenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class S10 {
    // Open app.vwo.com
    // Print the title and get the Current URL
    // VerIfy the Current URL is app.vwo.com

    @Test
    public void verifyurl(){
        ChromeDriver Driver = new ChromeDriver();
        Driver.get("https://app.vwo.com");
        String Title = Driver.getTitle();
        String Currenturl = Driver.getCurrentUrl();
        System.out.println(Title);
        System.out.println(Currenturl);
        Assert.assertEquals(Title,"Login - VWO");
        Assert.assertEquals(Currenturl, "https://app.vwo.com/#/login");
    }
}
