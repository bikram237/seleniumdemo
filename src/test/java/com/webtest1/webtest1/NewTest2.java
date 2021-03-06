package com.webtest1.webtest1;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class NewTest2 {
    WebDriver driver;
    @Test 
    public void test11() {
        driver.get("https://www.amazon.in");
        String title = driver.getTitle();
        System.out.println(title);
    }
    @Test
    public void test22() {
        WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox"));
        searchbox.sendKeys("acer laptops");
    }
    @Test 
    public void test23() {
        WebElement submitbutton = driver.findElement(By.id("nav-search-submit-button"));
        submitbutton.click();
    }
    @Test 
    public void test24() {
        WebElement checkbox1 = driver
                .findElement(By.xpath("//*[@id=\"p_n_feature_browse-bin/1485947031\"]/span/a/div/label/i"));
        checkbox1.click();
    }
    @Test 
    public void test25() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 5000)");
    }

    @BeforeTest
    public void beforeTest() {
        System.setProperty("webdriver.chrome.driver","D:\\coding\\webdriver\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @AfterTest
    public void afterTest() {
        driver.quit();
    }

}