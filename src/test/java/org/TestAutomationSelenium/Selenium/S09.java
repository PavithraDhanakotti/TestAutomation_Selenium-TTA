package org.TestAutomationSelenium.Selenium;

import org.openqa.selenium.chrome.ChromeDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class S09 {
    public static void main(String[] args) throws MalformedURLException {

        ChromeDriver Driver = new ChromeDriver();
        Driver.get("https://bing.com");

        Driver.navigate().to("https://app.vwo.com");
        Driver.navigate().to(new URL("https://google.com"));
        Driver.navigate().back();
        Driver.navigate().forward();
        Driver.navigate().refresh();

    }
}
