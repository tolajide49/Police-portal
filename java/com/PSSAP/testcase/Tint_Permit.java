package com.PSSAP.testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.PSSAP.base.TestBase;

public class Tint_Permit extends TestBase {
	
	Login test = new Login();
	

	@Test
	public void Tint_PermitTest () throws InterruptedException {
		test.validLogin();
		
		
		String tint = "TINT PERMIT";
        driver.findElement(By.xpath(OR.getProperty("SERVICE_DROP_XPATH"))).sendKeys(tint);
        
        Thread.sleep(3000);
		driver.findElement(By.name("proceedBtn")).click();
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector("div.zone.zone-content div.container-fluid.police-extract-main-content.no-margin.no-padding:nth-child(3) div.container-fluid.police-extract-container.no-padding:nth-child(2) div.container.police-extract-form-container.no-padding div.row.no-margin.no-padding div.container.col-md-6.no-padding.police-extract-form:nth-child(1) form:nth-child(4) > button.btn.btn-block:nth-child(12)")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.id(OR.getProperty("address2_ID"))).sendKeys(OR.getProperty("addres_TEXT"));
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@class='btn btn-block']")).click();
	    Thread.sleep(3000);
	    
	    JavascriptExecutor jse7 = (JavascriptExecutor)driver;
		jse7.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(3000);
	    
		driver.findElement(By.cssSelector("div.zone.zone-content div.container-fluid.confirmation-main-content.no-margin.no-padding:nth-child(3) div.container.confirmation-content-container div.container.confirmation-content.no-padding div.container.no-padding form:nth-child(4) > button.btn:nth-child(2)")).click();
		Thread.sleep(3000);
		
		Thread.sleep(3000);
		Assert.assertTrue(isElementPresent(By.xpath(OR.getProperty("ASSERTION2_XPATH"))), "TINT Permit request not successful");
		
	
	}
	

}
