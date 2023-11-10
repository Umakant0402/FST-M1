package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://v1.training-support.net/selenium/target-practice");
        System.out.println("Title : " + driver.getTitle());
        System.out.println("Text of Third Header : " + driver.findElement(By.xpath("//h3[@id='third-header']")).getText());
        System.out.println("Colour of Fifth Header : " + driver.findElement(By.xpath("//h5[text()='Fifth header']")).getCssValue("color"));
        driver.close();
    }
}
