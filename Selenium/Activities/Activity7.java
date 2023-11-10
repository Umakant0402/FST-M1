package activities;

import dev.failsafe.internal.util.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity7 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://v1.training-support.net/selenium/drag-drop");
        String homePageTitle = driver.getTitle();
        System.out.println("Home page title: " + homePageTitle);
        Actions builder = new Actions(driver);
        builder.dragAndDrop(driver.findElement(By.xpath("//img[@id='draggable']")),driver.findElement(By.xpath("//div[@id='droppable']")))
                        .build()
                                .perform();
        driver.findElement(By.xpath("//div[@id='droppable']")).getText();

        Thread.sleep(5000);
        driver.close();
    }
}
