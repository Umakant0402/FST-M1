package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;


public class Activity5 {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://alchemy.hguy.co/jobs/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        driver.findElement(By.xpath("//*[contains(@id,'menu-item')]")).getText();
        if( driver.findElement(By.xpath("//*[contains(@id,'menu-item')]")).getText().equals("Jobs")){
            driver.findElement(By.xpath("//*[contains(@id,'menu-item')]")).click();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
            driver.getTitle();
            System.out.println(driver.getTitle());
            if(driver.getTitle().equals("Jobs – Alchemy Jobs")) {
                driver.close();
            }
        }
    }
}