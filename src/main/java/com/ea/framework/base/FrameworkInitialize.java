package com.ea.framework.base;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.MalformedURLException;

public class FrameworkInitialize extends Base {
    public static void InitializeBrowser(BrowserType browserType) throws MalformedURLException {

        RemoteWebDriver driver = null;
        switch (browserType)
        {
            case Chrome:
            {
                //WebDriverManager.chromedriver().setup();
                //ChromeOptions chromeOptions = new ChromeOptions();

                driver = new ChromeDriver();
                driver.manage().window().maximize();
                LocalDriverContext.setRemoteWebDriverThreadLocal(driver);
                break;
            }
            case Firefox:
            {

                driver= new FirefoxDriver();
                LocalDriverContext.setRemoteWebDriverThreadLocal(driver);
                break;
            }
            case IE:
            {
                break;
            }
        }
    }


}
