package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;


public class Activity7 {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://alchemy.hguy.co/jobs/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        driver.findElement(By.xpath("//a[contains(@href,'post-a-job')]")).click();
        driver.findElement(By.xpath("//a[contains(@class,'button')]")).click();
        driver.findElement(By.xpath("//*[@id='user_login']")).sendKeys("root");
        driver.findElement(By.xpath("//*[@id='user_pass']")).sendKeys("pa$$w0rd");
        driver.findElement(By.xpath("//*[@id='wp-submit']")).click();
        driver.findElement(By.xpath(" //*[@id='job_title']")).sendKeys("TestJobs");//*[@id="tinymce"]
        System.out.println(driver.findElement(By.id("job_description_ifr")).isDisplayed());
        WebElement frame = driver.findElement(By.id("job_description_ifr"));
        driver.switchTo().frame(frame);
        driver.findElement(By.xpath("//iframe[contains(@id,'tinymce')]")).sendKeys("Testjobs");
//        driver.findElement(By.xpath(" //*[@id='//*[@id='tinymce']']")).sendKeys("TestJob");
//        driver.switchTo().frame("job_description_ifr");
//        WebElement editable = driver.switchTo().activeElement();
//        editable.sendKeys("Test");
//        driver.switchTo().defaultContent();
//        driver.findElement(By.xpath(" //*[@id='//*[@id='tinymce']']")).sendKeys("TestJob");
//        driver.findElement(By.xpath("//*[@id='job_preview_submit_button']")).click();
//        driver.findElement(By.xpath("//a[contains(@href,'jobs')]")).click();
//        driver.findElement(By.xpath("//*[@id='search_keywords']")).sendKeys("Test");
//       String value= driver.findElement(By.xpath("//a[contains(@href,'test-jobs')]")).getText();
//       System.out.println(value);

    }
}