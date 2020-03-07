package com.cbt.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserFactory {

    public static WebDriver getDriver(String browser) {

        String operatingSystem = System.getProperty("os.name").toLowerCase();

        if (operatingSystem.contains("windows")) {
            if (browser.equalsIgnoreCase("safari")) {
                return null;
            } else {
                if (browser.equalsIgnoreCase("chrome")) {
                    WebDriverManager.chromedriver().  setup();
                    return new ChromeDriver();
                } else if (browser.equalsIgnoreCase("firefox")) {
                    WebDriverManager.firefoxdriver().setup();
                    return new FirefoxDriver();
                } else if (browser.equalsIgnoreCase("edge")) {
                    WebDriverManager.edgedriver().setup();
                    return new EdgeDriver();
                }
            }
        } else if (operatingSystem.contains("mac")) {
            if (browser.equalsIgnoreCase("edge")) {
                return null;
            } else {
                if (browser.equalsIgnoreCase("chrome")) {
                    WebDriverManager.chromedriver().setup();
                    return new ChromeDriver();
                } else if (browser.equalsIgnoreCase("firefox")) {
                    WebDriverManager.firefoxdriver().setup();
                    return new FirefoxDriver();
                } else if (browser.equalsIgnoreCase("safari")) {
                    return new SafariDriver();
                }
            }
        }
        return null;


    }
}
