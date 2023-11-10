package org.example;

import org.apache.commons.collections.bag.SynchronizedSortedBag;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

public class Activity2 {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://alchemy.hguy.co/jobs/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
       String h1= driver.findElement(By.className("entry-title")).getText();
        System.out.println(h1);
        if(h1.equals("Welcome to Alchemy Jobs")){
            System.out.println("Matched the website heading");
            driver.close();
        }
    }
}