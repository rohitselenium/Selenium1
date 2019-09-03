package com.Flipkart.Java;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage extends TestBase {

	
	
	@FindBy(xpath="//input[@name='q']")
	WebElement searchProduct;
	
	@FindBy(xpath="//button[@class='vh79eN']")
	WebElement searchIcon;
	
	
	@FindBy(css= "div._3wU53n")
	WebElement redmi;
	
	public Homepage() throws IOException {
	
		PageFactory.initElements(driver, this);
		
		
	}

	
	public void searchphone()
	{
		
		String ModelName=prop.getProperty("PhoneModel");
		System.out.println(ModelName);
		
		//searchProduct.sendKeys(Keys.ENTER);
		searchProduct.click();
		driver.manage().timeouts().implicitlyWait(Utility.delayunit, TimeUnit.SECONDS);
		searchProduct.sendKeys(ModelName);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		searchIcon.click();
	
//		JavascriptExecutor js= (JavascriptExecutor)driver;
//		js.executeScript("window.scrollBy(0,6000)");
		
		redmi.click();
		
		
	}
	
	
	
	
}
