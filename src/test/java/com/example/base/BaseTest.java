package com.example.base;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

    private static WebDriver driver = null;

    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("disable-notifications");
        options.addArguments("disable-popup-blocking");
        setWebDriver(new ChromeDriver(options));
        getWebDriver().navigate().to("https://www.beymen.com");

    }

    public static WebDriver getWebDriver(){
        return driver;
    }

    public static void setWebDriver(WebDriver webDriver){
        BaseTest.driver = webDriver;
    }

    public void tearDown(){
        getWebDriver().quit();
    }
    
}
