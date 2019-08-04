package myproject;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

	class Test1 {
	WebDriver driver= null;
	@BeforeTest
	public void setuptest(){
		String projectpath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectpath+"/drivers/chromedriver/chromedriver");
		 driver = new ChromeDriver();
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


