package com.qa.e_commerce.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Flipkart {
	static  WebDriver driver;
			
	public static void loginbtn() {
		WebElement logbtn= driver.findElement(By.xpath("//a[text()='Login']"));
		logbtn.click();
	}
	public static void login() {
		WebElement username = driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
		username.click();
	}
	public static void reqstotp() {
	WebElement pass =  driver.findElement(By.xpath("//button[text()='Request OTP']"));
	pass.isDisplayed();
	}
	public static void loginfo1() {
		WebElement logininfo1 = driver.findElement(By.xpath("//span[@class='_36KMOx']"));
		logininfo1.isDisplayed();
	}
	public static void loginfo2() {
		WebElement logininfo2 =  driver.findElement(By.xpath("//p[@class='_1-pxlW']"));
		logininfo2.isDisplayed();
	}
	public static void terms1() {
		WebElement terms1 = driver.findElement(By.xpath("//div[@class='_1Ijv5h']"));
		terms1.isDisplayed();
	}
	public static void terms2() {
		WebElement terms2 = driver.findElement(By.xpath("//a[text()='Terms of Use']"));
		terms2.isDisplayed();
	}
}






