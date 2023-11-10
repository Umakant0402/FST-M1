package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginTestSteps {
    WebDriver driver;
    WebDriverWait wait;
    @Given("User is on Login page")
    public void userIsOnLoginPage() {
        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        driver.get("https://v1.training-support.net/selenium/login-form");
    }

    @When("User enters username and password")
    public void userEntersUsernameAndPassword() {
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("password");
        driver.findElement(By.xpath("//button[text()='Log in']")).click();
        
    }

    @Then("Read the page title and confirmation message")
    public void readThePageTitleAndConfirmationMessage() {
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@id='action-confirmation']")));
        System.out.println("Page Title : " + driver.getTitle());
        System.out.println("Login Message : " + driver.findElement(By.xpath("//div[@id='action-confirmation']")).getText());
        
    }

    @And("Close the Browser")
    public void closeTheBrowser() {
        driver.close();
    }

    @When("User enters {string} and {string}")
    public void userEntersAnd(String username, String password) {
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys(username);
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
        driver.findElement(By.xpath("//button[text()='Log in']")).click();
    }
}
