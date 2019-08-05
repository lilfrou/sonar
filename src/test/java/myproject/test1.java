package myproject;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

	public class test1 {
	WebDriver driver= null;
	@BeforeTest
	public void setuptest(){
		
		System.setProperty("webdriver.chrome.driver", "/var/lib/jenkins/chromedriver");
		ChromeOptions options = new ChromeOptions();
options.addArguments("start-maximized"); // open Browser in maximized mode
options.addArguments("disable-infobars"); // disabling infobars
options.addArguments("--disable-extensions"); // disabling extensions
options.addArguments("--disable-gpu"); // applicable to windows os only
options.addArguments("--disable-dev-shm-usage"); // overcome limited resource problems
options.addArguments("--no-sandbox"); // Bypass OS security model
driver = new ChromeDriver(options);
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


