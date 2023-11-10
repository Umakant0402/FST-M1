package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AlertTestSteps {
    WebDriver driver;
    WebDriverWait wait;
    Alert alert;
    @Given("User is on the page")
    public void userIsOnThePage() {
        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        driver.get("https://v1.training-support.net/selenium/javascript-alerts");
    }

    @When("User clicks the Simple Alert button")
    public void userClicksTheSimpleAlertButton() {
        driver.findElement(By.xpath("//button[text()='Simple Alert']")).click();
        
    }

    @Then("Alert opens")
    public void alertOpens() {
        alert = driver.switchTo().alert();
        
    }

    @And("Read the text from it and print it")
    public void readTheTextFromItAndPrintIt() {
        System.out.println("Alert Text : " + alert.getText());

    }

    @And("Close the alert")
    public void closeTheAlert() {
        alert.accept();
        
    }

    @And("Read the result text")
    public void readTheResultText() {
        
    }

    @And("Close Browser")
    public void closeBrowser() {
        driver.close();
    }

    @When("User clicks the Confirm Alert button")
    public void userClicksTheConfirmAlertButton() {
        driver.findElement(By.xpath("//button[text()='Confirmation']")).click();
        
    }

    @And("Close the alert with Cancel")
    public void closeTheAlertWithCancel() {
        alert.dismiss();
    }

    @When("User clicks the Prompt Alert button")
    public void userClicksThePromptAlertButton() {
        driver.findElement(By.xpath("//button[text()='Prompt']")).click();
    }

    @And("Write a {string} in it")
    public void writeAInIt(String customMessage) {
        alert.sendKeys(customMessage);
    }
}
