package myproject;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class test1 {
	WebDriver driver= null;
	@BeforeTest
	public void setuptest(){
		
		System.setProperty("webdriver.gecko.driver","/var/lib/jenkins/workspace/geckodriver");
		FirefoxOptions options = new FirefoxOptions();	
		options.setHeadless(true);
		
		driver = new FirefoxDriver(options);
		
		 System.out.println("testing started");
		
		
	}
	@Test
	public void thetest() {
		driver.get("https://www.seleniumhq.org/");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("testing complet");
	}
			@AfterTest	
		public void killtest() {
			driver.close();
			System.out.println("testing finished succefely");
		
		}
		
		
	}


