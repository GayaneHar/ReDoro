package com.web365.base.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class ReDoroBaseTest {
	
	protected WebDriver driver;

	@BeforeClass
	public void myBeforeClass() {
		driver = new ChromeDriver();
		driver.get("http://www.redoro.am");
		driver.manage().window().maximize();
		WebElement close = driver.findElement(By.xpath("//button[@class = 'close_advertisement_btn']"));
		close.click();
	}

	@AfterClass
	public void myAfterClass() {
		driver.close();
		driver.quit();
	}


}
