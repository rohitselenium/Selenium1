package com.Flipkart.Java;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {

	public  static Properties prop;
	public static WebDriver driver;
	
	
	public TestBase() throws IOException{
		
	 prop=new Properties();
	File filename1= new File("C:\\Users\\rohranja\\workspace\\"
			+ "com.Auto.Test\\src\\main\\java\\com\\Config\\pkg\\ConfigFile");
	
	FileInputStream fileInput= new FileInputStream(filename1);
	
	prop.load(fileInput);
	
	
	}
	
	
	public static void init(){
	
		
		String browsername =prop.getProperty("Browser");
		
		System.out.println(browsername);
		
	if(browsername.equals("firefox"))
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\rohranja\\workspace\\com.Auto.Test"
				+ "\\src\\main\\java\\Lib\\geckodriver.exe");
		
		 driver = new FirefoxDriver();		 
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 
	}
	else if(browsername.equals("chrome"))
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rohranja\\workspace"
				+ "\\com.Auto.Test\\src\\main\\java\\Lib\\chromedriver.exe");
		
		
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		
	}
	else
	{
		System.out.println("Please enter the driver name in config file:: ");
		
	}
		
	//driver.get("https://examples.sencha.com/coworkee/#login");
	
	
	driver.get(prop.getProperty("url"));
	driver.manage().timeouts().implicitlyWait(Utility.delayunit,TimeUnit.SECONDS);
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
		/*
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\rohranja\\workspace\\com.Auto.Test"
				+ "\\src\\main\\java\\Lib\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")).sendKeys("7348842297");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input")).sendKeys("Qwaszx@123");
		
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[3]/button/span")).click();
		
		*/
		
		


}
