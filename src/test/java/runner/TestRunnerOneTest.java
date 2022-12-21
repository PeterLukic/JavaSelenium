package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

public class TestRunnerOneTest {
    @CucumberOptions(
            features = {"src/test/java/features/"},
            glue = {"steps"},
            plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
            tags = "@OneTest")

    public static class Runner extends AbstractTestNGCucumberTests {


    }
}
