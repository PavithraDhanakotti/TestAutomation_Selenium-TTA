package org.TestAutomationSelenium.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

import java.io.File;

public class S03 {
    @Test
    public void testMethod(){
        // Extension to the Edge Browser
        // YouTube video -. Ad blocker Extension
        // Selenium ?

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addExtensions(new File(""));
        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://youtube.com");
        System.out.println(driver.getTitle());
        driver.quit();
    }
}
