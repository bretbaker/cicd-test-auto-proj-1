package com.cicd_test_auto_proj_1.demo1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestClass1 {
	
	public static WebDriver driver;

	@BeforeClass
	public void launchDriver() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\bretb\\OneDrive\\Documents\\cicd-test-auto-proj-1\\demo1\\webdriver\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Test
	public void Test1() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		System.out.println("Test 1 title is: " + driver.getTitle());
	}

	@Test
	public void Test2() {

	}

	@Test
	public void Test3() {

	}
	
	@AfterClass
	public void quitDriver() {
		driver.close();
	}

}
