package com.ea.framework.base;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;


public class FrameworkInitialize extends Base {
    public static void InitializeBrowser(BrowserType browserType) {

        RemoteWebDriver driver = null;
        switch (browserType)
        {
            case Chrome:
            {
                driver = new ChromeDriver();
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
                driver= new InternetExplorerDriver();
                LocalDriverContext.setRemoteWebDriverThreadLocal(driver);
                break;
            }

            case Safari:
            {
                driver= new SafariDriver();
                LocalDriverContext.setRemoteWebDriverThreadLocal(driver);
                break;
            }

            case Edge:
            {
                driver= new EdgeDriver();
                LocalDriverContext.setRemoteWebDriverThreadLocal(driver);
                break;
            }

        }

        driver.manage().window().maximize();
    }


}
