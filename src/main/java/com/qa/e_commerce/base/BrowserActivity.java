package com.qa.e_commerce.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserActivity {

	static WebDriver driver;
		
	public static void chrome() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\Selenium Jar files\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		
	}
	
	public static void flipkart() {
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
	}
	
	public static void amazon() {
		driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=58355126069&hvpone=&hvptwo=&hvadid=610644601173&hvpos=&hvnetw=g&hvrand=4572472294766074999&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1007788&hvtargid=kwd-10573980&hydadcr=14453_2316415");
		driver.manage().window().maximize();
	}
	
	public static void close() {
		driver.close();
	}
		
	}

