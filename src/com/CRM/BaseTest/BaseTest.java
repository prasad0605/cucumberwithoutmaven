package com.CRM.BaseTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class BaseTest {
	
	public static WebDriver driver;
	public static Properties properties;
	public static ThreadLocal<WebDriver> tldriver=new ThreadLocal<WebDriver>();
	
	public BaseTest(){
		FileInputStream fis;
		try {
			fis = new FileInputStream(System.getProperty("user.dir")+"\\Resources\\Config\\Env.properties");
			properties=new Properties();
			properties.load(fis);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void initialization(){
		if(properties.getProperty("browser").equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Resources\\Drivers\\chromedriver.exe");
			driver=new ChromeDriver();
		}else if(properties.getProperty("browser").equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Resources\\Drivers\\geckodriver.exe");
			driver=new FirefoxDriver();
		}else if(properties.getProperty("browser").equalsIgnoreCase("ie")) {
			driver=new InternetExplorerDriver();
		}else if(properties.getProperty("browser").equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", System.getProperty("user.dir")+"\\Resources\\Drivers\\msedgedriver.exe");
			driver=new EdgeDriver();
		}
		tldriver.set(driver);
		driver=tldriver.get();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(properties.getProperty("URL"));
	}
	
   
    
}
