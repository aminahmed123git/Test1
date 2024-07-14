package com.TestsOne.NetCompanyCi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCase {
	
	public static WebDriver driver;
	
	@BeforeMethod
	public void launchDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\chromedriver_win32\\chromediver.exe");
		driver = new ChromeDriver();
		driver.manage().window().fullscreen();	
	}
	@Test
	public void test1() {
		driver.navigate().to("https://netcompany.com/");
		System.out.println("Test 1 title is"+driver.getTitle());		
	}
	
	@Test
	public void test2() {
		driver.navigate().to("https://netcompany.com/");
		System.out.println("Test 2 title is"+driver.getTitle());
		
	}
	
	@Test
	public void test3() {
		driver.navigate().to("https://netcompany.com/");
		System.out.println("Test 3 title is"+driver.getTitle());
		
	}

	@AfterMethod
	public void quit() {
		driver.quit();
		
	}
	
}
