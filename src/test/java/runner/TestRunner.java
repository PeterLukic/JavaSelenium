package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

public class TestRunner {

    @CucumberOptions(
            features = {"src/test/java/features/"},
            glue = {"steps"},
            plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})

    public static class Runner extends AbstractTestNGCucumberTests {


    }
}
