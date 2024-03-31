package dev.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class MainDriver {
    WebDriver driver;

    @BeforeMethod
    public void before(){
        driver = new ChromeDriver();
        //driver = new FirefoxDriver();
        driver.get ("https://www.selenium.dev/selenium/web/web-form.html");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    //@AfterMethod
    //public void tearDown() {
        //driver.quit();
    //}
}
