package com.PSSAP.testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.PSSAP.base.TestBase;

public class Police_extract extends TestBase {

	Login test = new Login();

	@Test
	public void PoliceextractTest () throws InterruptedException {
		test.validLogin();

		String service = "POLICE EXTRACT";
        driver.findElement(By.xpath(OR.getProperty("SERVICE_DROP_XPATH"))).sendKeys(service);

		Thread.sleep(9000);
		driver.findElement(By.name("proceedBtn")).click();

		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(3000);

		driver.findElement(By.cssSelector("div.zone.zone-content div.container-fluid.police-extract-main-content.no-margin.no-padding:nth-child(3) div.container-fluid.police-extract-container.no-padding:nth-child(2) div.container.police-extract-form-container.no-padding div.row.no-margin.no-padding div.container.col-md-6.no-padding.police-extract-form:nth-child(1) form:nth-child(4) > button.btn.btn-block:nth-child(12)")).click();
		Thread.sleep(3000);
		
		Select dropdown = new Select(driver.findElement(By.id("category")));
		dropdown.selectByVisibleText("Loss of Document");
		Thread.sleep(3000);

		Select 	Category = new Select(driver.findElement(By.id("subcategory")));
		Category.selectByVisibleText("Identification");
		Thread.sleep(3000);

		Select SUBCategory = new Select(driver.findElement(By.id("subcategory")));
		SUBCategory.selectByVisibleText("Identification");
		Thread.sleep(3000);

		Select State = new Select(driver.findElement(By.id("state")));
		State.selectByVisibleText("Lagos");
		Thread.sleep(3000);

		Select LGA = new Select(driver.findElement(By.id("lga")));
		LGA.selectByVisibleText("Mushin");
		Thread.sleep(3000);
		
		JavascriptExecutor jse1 = (JavascriptExecutor)driver;
		jse1.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(3000);
	
		String PLC = "Mushin Division(MUD)";
        driver.findElement(By.xpath(OR.getProperty("PLCCOMMAND_XPATH"))).sendKeys(PLC);

        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@class='btn btn-block']")).click();
        
        Thread.sleep(4000);
        
        JavascriptExecutor jse3 = (JavascriptExecutor)driver;
		jse3.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(3000);

		click("Generateinvoice_xpath");
		
		
		
		Thread.sleep(3000);
		Assert.assertTrue(isElementPresent(By.className(OR.getProperty("ASSERTION_Clasname"))), "Police extract request not successful");
		
		
	}
}
