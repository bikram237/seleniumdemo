package com.webtest1.webtest1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class googletestdemo {

	public static void main(String[] args) throws InterruptedException {
		
    
	WebDriver driver;
	System.setProperty("webdriver.chrome.driver","D:\\coding\\webdriver\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("http://google.com");
	String title=driver.getTitle();
	System.out.println(title);
	Assert.assertEquals(title, "Google");
	WebElement gmail=driver.findElement(By.className("gb_f"));
	gmail.click();
	Thread.sleep(3000);
	WebElement signin=driver.findElement(By.xpath("/html/body/header/div/div/div/a[2]"));
	signin.click();
	Thread.sleep(3000);
	driver.quit();
	
	
		
		
		
	
		
	}

}
