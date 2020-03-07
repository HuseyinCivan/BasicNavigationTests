package com.cbt.utilities;

import org.openqa.selenium.WebDriver;

import java.util.Arrays;
import java.util.List;

public class TitleVerification2 {
    public static void main(String[] args) throws InterruptedException {
        List<String> urls = Arrays.asList("https://luluandgeorgia.com/",
                "https://wayfair.com/", "https://walmart.com" , "https://westelm.com/");

        WebDriver driver=BrowserFactory.getDriver("chrome");

        for (String url : urls) {
            driver.get(url);
            System.out.println("The website title is = " + driver.getTitle());
            if(driver.getCurrentUrl().contains(driver.getTitle().toLowerCase().replace(" ",""))){
                System.out.println("The URL "+driver.getCurrentUrl()+" contains Title");
                System.out.println("PASSED !");

            }else{
                System.out.println("The URL "+driver.getCurrentUrl()+"  does not contain Title");
                System.out.println("FAILED !");
            }
            System.out.println();
            Thread.sleep(2000);

        }

        driver.quit();


    }
}
