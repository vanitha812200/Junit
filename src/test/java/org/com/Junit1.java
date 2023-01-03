package org.com;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Junit1 {
	
	 static WebDriver driver;
	@BeforeClass
public  static void test1() {
	WebDriverManager.chromedriver().setup();
   driver=new ChromeDriver();
  driver.get("https://adactinhotelapp.com/index.php");
}
	@Test
public void test2() {
	driver.findElement(By.id("username")).sendKeys("vanitha812");
	driver.findElement(By.id("password")).sendKeys("vanitha812");
	driver.findElement(By.id("login")).click();
}
	@AfterClass
public static  void test3() {
	driver.close();
}
	@Before
public void test4() {
	long currentTimeMillis = System.currentTimeMillis();
	System.out.println(currentTimeMillis);
}
	@After
public void test6() throws Exception {
	TakesScreenshot Screenshot =(TakesScreenshot) driver;
File screenshotAs = Screenshot.getScreenshotAs(OutputType.FILE);
System.out.println(screenshotAs);
File dec=new File("C:\\Users\\lenovo\\eclipse-workspace\\Junit\\ss\\ss1\\pic.png");
FileUtils.copyFile(screenshotAs, dec);
}

}
