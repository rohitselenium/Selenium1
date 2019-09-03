package com.Flipkart.Java;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class MobileDescription extends TestBase {

	
	
	
	@FindBy(css="div._2_AcLJ")
	WebElement zoom1;
	
	@FindBy(css="_3MF26o SGxMsH")
	WebElement zoom2;
	
	@FindBy(how=How.CSS, using ="_3MF26o SGxMsH")
	WebElement zoom3;
	
	public MobileDescription() throws IOException {
		
		PageFactory.initElements(driver, this);
		
	}

	public void mouseover()
	{
		Actions act= new Actions(driver);
		act.moveToElement(zoom1).click().build().perform();
		driver.manage().timeouts().implicitlyWait(Utility.delayunit,TimeUnit.SECONDS);
		act.moveToElement(zoom2).click().build().perform();
	}
	
	
	
	
}
