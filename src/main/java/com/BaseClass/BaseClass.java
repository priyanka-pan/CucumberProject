package com.BaseClass;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	public static WebDriver driver;
	public static Actions act;
	public static Select select;
	public static WebDriver browserName(String browser) {
		if(browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
			driver= new ChromeDriver();
		}
		else {
			System.out.println("Invalid browser");
		}
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		return driver;
	}
	
	public static void urlLink(String url) {
		driver.get(url);

	}
	public static void elementClick(WebElement element) {
		element.click();
	}
	
	public static void input(WebElement element,String value) {
		element.sendKeys(value);
	}
	
	public static WebDriver moveToFrame(WebElement element) {
		driver.switchTo().frame(element);
		return driver;
	}
	
	public static WebDriver outOfFrame() {
		driver.switchTo().defaultContent();
		return driver;
	}
	
	public static void actions(WebElement element,String method) {
		act=new Actions(driver);
		if(method.equalsIgnoreCase("moveToElement") || method.equalsIgnoreCase("move to element")) {
			act.moveToElement(element).build().perform();
		}
		else if (method.equalsIgnoreCase("click")) {
			act.click(element).build().perform();
		}
	}
	
	public static void thread(long val) throws InterruptedException {
		Thread.sleep(val);
	}
	
	public static void screenshot(String fileName) throws IOException {
		TakesScreenshot ts= (TakesScreenshot) driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File destination=new File("C:\\Users\\hai\\eclipse-workspace\\Selenium_Project\\ScreenShot\\"+fileName+".png");
		FileUtils.copyFile(source, destination);
	}
	
	public static void dropDown(WebElement element,String valueType,String value) {
		select=new Select(element);
		if(valueType.equalsIgnoreCase("selectByValue") || valueType.equalsIgnoreCase("select By Value")) {
			select.selectByValue(value);
		}
		
		else if(valueType.equalsIgnoreCase("selectByVisibleText") || valueType.equalsIgnoreCase("select By Visible Text")) {
			select.selectByVisibleText(value);
		}
		
		else if(valueType.equalsIgnoreCase("selectByIndex") || valueType.equalsIgnoreCase("select By Index")) {
			int number= Integer.parseInt(value);
			select.selectByIndex(number);
		}
	}


}
