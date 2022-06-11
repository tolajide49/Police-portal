package com.PSSAP.testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.PSSAP.base.TestBase;

public class Police_Escort extends TestBase {
	
	Login test = new Login();
	
	@Test
	public void Police_EscortTest () throws InterruptedException {
		test.validLogin();
		
		
		String service = "POLICE ESCORT";
        driver.findElement(By.xpath(OR.getProperty("SERVICE_DROP_XPATH"))).sendKeys(service);
        
		Thread.sleep(3000);
		driver.findElement(By.name("proceedBtn")).click();
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector("div.zone.zone-content div.container-fluid.police-extract-main-content.no-margin.no-padding:nth-child(3) div.container-fluid.police-extract-container.no-padding:nth-child(2) div.container.police-extract-form-container.no-padding div.row.no-margin.no-padding div.container.col-md-6.no-padding.police-extract-form:nth-child(1) form:nth-child(4) > button.btn.btn-block:nth-child(12)")).click();
		Thread.sleep(3000);

		Select State = new Select(driver.findElement(By.id("state")));
		State.selectByVisibleText("Lagos");
     	Thread.sleep(3000);
		
     	Select LGA = new Select(driver.findElement(By.id("lga")));
		LGA.selectByVisibleText("Mushin");
     	Thread.sleep(3000);
     	
     	JavascriptExecutor jse3 = (JavascriptExecutor)driver;
		jse3.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(3000);
     	
		driver.findElement(By.id(OR.getProperty("address_ID"))).sendKeys(OR.getProperty("addres_TEXT"));
		Thread.sleep(3000);
		
		driver.findElement(By.id(OR.getProperty("StartDate_ID"))).sendKeys(OR.getProperty("StartDate_TEXT"));
		Thread.sleep(3000);
		driver.findElement(By.id("startDate")).click();
		
		driver.findElement(By.xpath(OR.getProperty("ENDDate_XPATH"))).sendKeys(OR.getProperty("ENDDate_TEXT"));
		driver.findElement(By.xpath("//input[@id='endDate']")).click();
		
		driver.findElement(By.xpath("//button[@class='btn blue-btn btn-block']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath(OR.getProperty("RequestReason_XPATH"))).sendKeys(OR.getProperty("Requestreason_TEXT"));
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@id='officerQty']")).clear();
		driver.findElement(By.xpath("//input[@id='officerQty']")).sendKeys("5");
	
		JavascriptExecutor jse5 = (JavascriptExecutor)driver;
		jse5.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[@class='form-group']//div[3]//label[1]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[@class='form-group']//div[3]//label[1]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@class='btn btn-block blue-btn'][contains(text(),'Proceed')]")).click();
		Thread.sleep(3000);
		
		JavascriptExecutor jse6 = (JavascriptExecutor)driver;
		jse6.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector("div.zone.zone-content div.container-fluid.confirmation-main-content.no-margin.no-padding:nth-child(3) div.container.confirmation-content-container div.container.confirmation-content.no-padding div.container.no-padding form:nth-child(4) > button.btn:nth-child(2)")).click();
		Thread.sleep(3000);


		Thread.sleep(3000);
		Assert.assertTrue(isElementPresent(By.xpath(OR.getProperty("ASSERTION2_XPATH"))), "Police escort request not successful");
		
		
	
	
	}
	

}
