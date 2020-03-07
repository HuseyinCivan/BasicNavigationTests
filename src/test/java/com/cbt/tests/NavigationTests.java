package com.cbt.tests;

import com.cbt.utilities.BrowserFactory;
import com.cbt.utilities.StringUtility;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationTests {
    public static WebDriver driver;

    public static void main(String[] args) throws Exception {

        chromeTest();
        edgeTest();
        firefoxTest();





    }
    public static void chromeTest() throws Exception{
        driver=BrowserFactory.getDriver("chrome");
        testCase();

    }

    public static void edgeTest() throws Exception{
        driver=BrowserFactory.getDriver("edge");
        testCase();

    }


    public static void firefoxTest() throws Exception{
        driver=BrowserFactory.getDriver("firefox");
        testCase();

    }

    public static void testCase() throws Exception {


        driver.get("https://google.com");
        String titleGoogle = driver.getTitle();
        Thread.sleep(2000);

        driver.get("https://etsy.com");
        String titleEtsy = driver.getTitle();

        driver.navigate().back();
        StringUtility.verifyEquals(driver.getTitle(),titleGoogle);

        driver.navigate().forward();
        StringUtility.verifyEquals(driver.getTitle(),titleEtsy);

        driver.quit();

    }




}
