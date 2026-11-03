package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;

public class GoogleStepDefinitions {
    //package StepDefinitions;



    //public class googleStepDefinitions {

        WebDriver driver;

        @Given("the user opens the Google website")
        public void openGoogleWebsite() {

            driver = new ChromeDriver();

            driver.get("https://www.google.com");
        }

        @Then("the Google page title should be displayed")
        public void verifyGooglePageTitle() {

            String actualTitle = driver.getTitle();

            System.out.println("Page Title: " + actualTitle);

            Assert.assertTrue(
                    actualTitle.contains("Google"),
                    "Google title is not displayed"
            );

            driver.quit();
        }
    }
