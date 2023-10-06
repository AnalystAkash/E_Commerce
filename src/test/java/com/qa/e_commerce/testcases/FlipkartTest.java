package com.qa.e_commerce.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.e_commerce.base.BrowserActivity;
import com.qa.e_commerce.pages.Flipkart;

public class FlipkartTest extends BrowserActivity {
//	@BeforeMethod
//	public void start() {
//		BrowserActivity.chrome();
//		BrowserActivity.flipkart();
//	}
//	
//	@AfterMethod
//	public void stop() {
//		BrowserActivity.close();
//	}
	
	WebDriver driver;
	@BeforeTest
	public void start() {
	       BrowserActivity.chrome();
	
	}
	@AfterTest
	public void stop() {
		BrowserActivity.close();
	}
	@Test(priority=1)
	public void openurl() throws InterruptedException {
		BrowserActivity.flipkart();
		
	    Thread.sleep(5000);
	}
//	@Test(priority=2)
//	  public void loginbtn() {
//		Flipkart.loginbtn();	
//	}
//	@Test(priority=3)
//	public void username() {
//	   Flipkart.login();
//	}
//	@Test(priority=4)
//	public void reqstotp() {
//		Flipkart.reqstotp();
//	}
//	@Test(priority=5)
//	public void loginfo1() {
//		Flipkart.loginfo1();
//	}
//	@Test(priority=6)
//	public void loginfo2() {
//		Flipkart.loginfo2();
//	}
//	@Test(priority=7)
//	public void terms1() {
//		Flipkart.terms1();
//	}
//	@Test(priority=8)
//	public void terms2() {
//		Flipkart.terms2();
//	}
		
	}


