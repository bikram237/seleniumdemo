package com.webtest1.webtest1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class NewTest {
	WebDriver driver;
	@Test
	public void test1() {
		driver.get("http://google.com");
		String title=driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Google");
	}
    @Test
    public void test2()
    {
    	WebElement gmail=driver.findElement(By.className("gb_f"));
    	gmail.click();
    }
	
    @Test
    public void test3()
    {
    	WebElement signin=driver.findElement(By.xpath("/html/body/header/div/div/div/a[2]"));
    	signin.click();
    }
	
	
	
	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "D:\\coding\\webdriver\\chromedriver.exe");
		driver = new ChromeDriver();

	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}

}
