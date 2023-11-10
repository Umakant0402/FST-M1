package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;


public class Activity9 {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://alchemy.hguy.co/jobs/wp-admin");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        driver.findElement(By.xpath("//*[@id='user_login']")).sendKeys("root");
        driver.findElement(By.xpath("//*[@id='user_pass']")).sendKeys("pa$$w0rd");
        driver.findElement(By.xpath("//*[@id='wp-submit']")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        driver.findElement(By.xpath("//*[@id='menu-posts-job_listing']/a/div[3]")).click();
        driver.findElement(By.xpath("//*[@id='menu-posts-job_listing']/ul/li[2]/a")).click();
        driver.findElement(By.xpath("//*[@id='wpbody-content']/div[4]/a")).click();
        driver.findElement(By.xpath("//*[@id='post-title-0']")).sendKeys("Testing Jobs");
        driver.findElement(By.xpath("//*[@id='editor']/div/div/div[1]/div/div[1]/div/div[2]/button[2]")).click();
        driver.findElement(By.xpath("//*[@id='editor']/div/div/div[1]/div/div[2]/div[3]/div/div/div/div[1]/div/button")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100000));
        driver.get("https://alchemy.hguy.co/jobs/wp-admin/edit.php?post_type=job_listing");
        WebElement element=driver.findElement(By.tagName("table"));
        WebElement element1=element.findElement(By.tagName("tbody"));
        List<WebElement> element2=element1.findElements(By.tagName("a"));
        for(int i=0;i<element2.size();i++){
            if(element2.get(i).getText().equals("Testing Jobs")){
                System.out.println("Job Listing has been created");
                driver.close();
            }
        }
    }
}