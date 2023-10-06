package com.qa.e_commerce.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.e_commerce.base.BrowserActivity;

public class amazon extends BrowserActivity {

	WebDriver driver;
	
	@BeforeMethod
	public void start1() {
		BrowserActivity.chrome();
	}
	@AfterMethod
	public void stop1() {
		BrowserActivity.close();
	}
	
	@Test
	public void openurl1() {
		
		BrowserActivity.amazon();
	}
}
