package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;




//package Runner;



    @CucumberOptions(
            features = "src/test/resources/features",
            glue = "StepDefinitions",
            plugin = {"pretty"},
            monochrome = true
    )

    public class TestRunner extends AbstractTestNGCucumberTests {

    }

