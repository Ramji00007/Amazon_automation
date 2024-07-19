package org.utilityClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	public static WebDriver driver;
	public static Properties prop;
	
	
	public static void browserLaunch(String url) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		
	}
	
	public static String getValue(String key) throws IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\NewWork\\ProjectDemo\\src\\test\\resources\\config.properties");
		prop = new Properties();
		prop.load(fis);
		return prop.getProperty(key);
	}
	
	public static void scrollDown(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
	    js.executeScript("arguments[0].scrollIntoView(true);",element);
	}
	
		
	
}
