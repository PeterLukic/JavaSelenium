package steps;

import com.ea.framework.base.DriverContext;
import com.ea.framework.base.FrameworkInitialize;
import com.ea.framework.base.LocalDriverContext;
import com.ea.framework.config.ConfigReader;
import com.ea.framework.config.Settings;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


import java.io.IOException;

public class TestInitialize extends FrameworkInitialize {


    @Before
    public void Before() throws IOException {
            ConfigReader.PopulateSettings();
            InitializeBrowser(Settings.BrowserType);
            DriverContext.GoToUrl(Settings.AUT);

    }

    @After(order=1) //Cucumber hook - runs for each scenario
    public static void quitDriver() throws Exception {
        DriverContext.QuitDriver();
    }
    @After(order = 2) // Cucumber After Hook with order 1
    public void takeScreenShotOnFailedScenario(Scenario scenario) {
        if ((scenario.isFailed())) {
            final byte[] screenshot = ((TakesScreenshot) LocalDriverContext.getRemoteWebDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
        }
    }
}
