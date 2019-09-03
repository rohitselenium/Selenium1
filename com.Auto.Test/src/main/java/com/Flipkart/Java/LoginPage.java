package com.Flipkart.Java;

import java.io.IOException;

import javax.swing.plaf.synth.SynthSeparatorUI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends TestBase {



	

	@FindBy(xpath="//input[@class=\"_2zrpKA _1dBPDZ\"]")
	 WebElement username1;
	
	@FindBy(xpath="//input[@class=\"_2zrpKA _3v41xv _1dBPDZ\"]")
	 WebElement password1;
	
	@FindBy(xpath="//*[@type='submit' and @class='_2AkmmA _1LctnI _7UHT_c']")
	 WebElement login;

	
	public LoginPage()throws IOException
	{
	
		PageFactory.initElements(driver, this);
	}
	


	public Homepage loginflipkart() throws IOException
	{
		
		System.out.println("Loginflipkart funciton");
		
		String user=prop.getProperty("username");
		username1.sendKeys(user);
		
		System.out.println(user);
		
		
		String pass=prop.getProperty("password");
		password1.sendKeys(pass);
		
		System.out.println(pass);
		
		//password.getAttribute("id");
		login.click();
		return new Homepage();
	}
	
	
	
	
}
