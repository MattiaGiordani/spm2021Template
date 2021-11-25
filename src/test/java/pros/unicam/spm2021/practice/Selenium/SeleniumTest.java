package pros.unicam.spm2021.practice.Selenium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class SeleniumTest {

	static String browser;
	static String projectPath;
	
	static WebDriver driver;
	
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		 projectPath = System.getProperty("user.dir");
	}
	
	
	/**
	 * @throws java.lang.Exception
	 */
	@AfterAll
	static void tearDownAfterClass() throws Exception {		
	}

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		if(System.getProperty("os.name").equals("Ubuntu")) {
		System.setProperty("webdriver.chrome.driver", "/home/fab/Desktop/chromedriver");
		}
		if(System.getProperty("os.name").contains("Windows")) {
			System.setProperty("webdriver.chrome.driver", "/home/fab/Desktop/chromedriver");
		}
	
		driver = new ChromeDriver();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
		driver.close();
		driver.quit();
	}

	@Test
	//@Disabled
	void checkProsSite() throws InterruptedException {
		
		driver.get("http://pros.unicam.it/");

		Thread.sleep(3000);
		
		String at = driver.getTitle();
		String et = "PROS";
		
		//System.out.println(at);		
		Thread.sleep(4000);

		Assert.assertEquals(et,at);
		
		
	}
	
	@Test
	//@Disabled
	void checkProsSiteSearch() throws InterruptedException {
		
		// navigate your driver to mail.google.com
		driver.get("http://pros.unicam.it/");

		Thread.sleep(3000);
		
		//Find Element by className
		driver.findElement(By.className("toggle-search")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.className("search")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.className("search")).sendKeys("bprove");
		
		Thread.sleep(3000);
		
		//TO COMPLETE
		
	
	}

}
