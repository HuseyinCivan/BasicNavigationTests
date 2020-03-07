package com.cbt.utilities;

import org.openqa.selenium.WebDriver;

import java.util.Arrays;
import java.util.List;

public class TitleVerification3 {
    public static void main(String[] args) throws InterruptedException {
        List<String> urls = Arrays.asList("https://luluandgeorgia.com/",
                "https://wayfair.com/", "https://walmart.com" , "https://westelm.com/");

        WebDriver driver=BrowserFactory.getDriver("chrome");

        for (int x=0; x<urls.size();x++) {
            driver.get(urls.get(x));
            System.out.println("The website title is = " + driver.getTitle());
            if(driver.getCurrentUrl().contains(driver.getTitle().toLowerCase().replace(" ",""))){
                System.out.println("The URL "+driver.getCurrentUrl()+" contains Title");
                System.out.println("PASSED !");

            }else{
                System.out.println("The URL "+driver.getCurrentUrl()+"  does not contain Title");
                System.out.println("FAILED !");
            }
            driver.close();

           driver=BrowserFactory.getDriver("chrome");

        }

            driver.quit();

    }
}