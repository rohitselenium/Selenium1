package com.Flipkart.Test;

import java.io.IOException;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.Flipkart.Java.Homepage;
import com.Flipkart.Java.LoginPage;
import com.Flipkart.Java.MobileDescription;
import com.Flipkart.Java.TestBase;

public class TestLogin extends TestBase {


	
	public LoginPage page;
	public Homepage homepage;
	public MobileDescription mobilechk;
	//WebDriver driver;
	
	public TestLogin() throws IOException {
		
		super();

		//page=new LoginPage();
		
		
	}

	
	@BeforeTest
	public void setup() throws IOException
	{
		init();
		page=new LoginPage();
		//homepage= new Homepage();
	}
	
	@Test(priority=1)
	public void Login() throws IOException
	{
		System.out.println("This is the test method");
		
		homepage = page.loginflipkart();
		homepage= new Homepage();
		mobilechk= new MobileDescription();
		
	}
	
	@Test(priority=2)
	public void Search() throws IOException
	{
		//homepage = page.loginflipkart();
		homepage.searchphone();
		
	}
	
	@Test(priority=3)
	
	public void CheckModel()
	{
		
		mobilechk.mouseover();
		
	}


	@AfterTest
	public void clean()
	{
		
		//driver.close();
	}
	
	
	
}
