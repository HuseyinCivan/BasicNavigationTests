package com.cbt.utilities;

import org.openqa.selenium.WebDriver;

import java.util.Arrays;
import java.util.List;

public class TitleVerification {
    public static void main(String[] args) {
        List<String> urls = Arrays.asList("http://practice.cybertekschool.com/",
                "http://practice.cybertekschool.com/dropdown",
                "http://practice.cybertekschool.com/login");

        String[] allTitles=new String[3];
        String [] allUrls = new String[3];

        WebDriver driver = BrowserFactory.getDriver("chrome");

        for(int x=0 ; x<urls.size(); x++){
            driver.get(urls.get(x));
            allTitles[x]=driver.getTitle();
            allUrls[x]=driver.getCurrentUrl();
        }
        driver.quit();

 //       System.out.println("allUrls = " + Arrays.toString(allUrls));
 //       System.out.println("allTitles = " + Arrays.toString(allTitles));

        System.out.println("All have same title ? "+ ( (allTitles[0] .equals(allTitles[1])) && allTitles[2].equals(allTitles[0]) ) );

        System.out.println("All the URL's starts with http://practice.cybertekschool.com ? "+ ( allUrls[0].startsWith("http://practice.cybertekschool.com") &&
                                                                                                allUrls[1].startsWith("http://practice.cybertekschool.com") &&
                                                                                                allUrls[2].startsWith("http://practice.cybertekschool.com")));










    }
}
