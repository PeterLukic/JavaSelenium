package com.ea.framework.base;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DriverContext {
    static String pageLoadStatus = null;

    public static void GoToUrl(String url)
    {
        LocalDriverContext.getRemoteWebDriver().get(url);
    }

    public static void QuitDriver(){
        LocalDriverContext.getRemoteWebDriver().quit();
    }

    public static void WaitForPageToLoad() {
        do {
            JavascriptExecutor js = LocalDriverContext.getRemoteWebDriver();
            pageLoadStatus = (String) js.executeScript("return document.readyState");
            System.out.print(".");
        } while (!pageLoadStatus.equals("complete"));
    }

    public  static  void WaitForElementVisible(final WebElement elementFindBy){
        WebDriverWait wait= new WebDriverWait(LocalDriverContext.getRemoteWebDriver(), Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOf(elementFindBy));
    }

//    public static void WaitForElementTextVisible(final WebElement elementFindBy, String text){
//        WebDriverWait wait= new WebDriverWait(LocalDriverContext.getRemoteWebDriver(), Duration.ofSeconds(30));
//        wait.until(ExpectedConditions.textToBePresentInElement(elementFindBy, text));
//    }
//
//    public static void WaitUntilTextDisplayed(WebElement element, String text){
//        //WebDriverWait wait = new WebDriverWait(LocalDriverContext.getRemoteWebDriver(),Duration.ofSeconds(30));
//        elementTextDisplayed(element, text);
//    }
//
//    public static void WaitElementEnabled(final By elementFindBy){
//        WebDriverWait wait = new WebDriverWait(LocalDriverContext.getRemoteWebDriver(),Duration.ofSeconds(30));
//        wait.until(webDriver -> webDriver.findElement(elementFindBy).isEnabled());
//
//    }
//    private static ExpectedCondition elementTextDisplayed(WebElement element, String text) {
//        return new ExpectedCondition<java.lang.Boolean>() {
//            public java.lang.Boolean apply(WebDriver driver) {
//                return element.getText().equals(text);
//            }
//        };
//    }
//
//    private static Boolean elementTextDisplayedBoolean(final By elementFindBy, String text) {
//        var ele = LocalDriverContext.getRemoteWebDriver().findElement(elementFindBy);
//
//        WebDriverWait wait = new WebDriverWait(LocalDriverContext.getRemoteWebDriver(), Duration.ofSeconds(30));
//        return wait.until(ExpectedConditions.textToBePresentInElement(ele, text));
//
//    }

}
