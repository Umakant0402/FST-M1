package org.example;

import org.apache.commons.collections.bag.SynchronizedSortedBag;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;


public class Activity1 {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://alchemy.hguy.co/jobs/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        driver.getTitle();
        System.out.println("Title of the page : "+driver.getTitle());
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        if(driver.getTitle().equals("Alchemy Jobs – Job Board Application")){
            System.out.println("Matched the title");
            driver.close();
        }

    }
}