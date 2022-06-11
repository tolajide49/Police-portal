package com.PSSAP.testcase;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.PSSAP.base.TestBase;


public class Login extends TestBase {
	@Test
	public void validLogin () throws InterruptedException {
		
		click("HomeloginBtn_XPATH");
		Thread.sleep(2000);
		driver.findElement(By.xpath(OR.getProperty("email_ID"))).sendKeys(OR.getProperty("email_TEXT"));
		driver.findElement(By.xpath(OR.getProperty("password_ID"))).sendKeys(OR.getProperty("password_TEXT"));		
		click("loginBtn_XPATH");
		Thread.sleep(3000);
		Assert.assertTrue(isElementPresent(By.xpath(OR.getProperty("PROCEED_XPATH"))), "login not sucessful");
		log.debug("Log in successfully executed");
		
		
	}

}
