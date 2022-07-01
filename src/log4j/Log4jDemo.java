package log4j;

import org.testng.annotations.Test;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Log4jDemo {
	WebDriver driver;

	@Test
	public void log4jDemo() throws Exception {
		Logger log = Logger.getLogger("Google");
		PropertyConfigurator.configure("Log4j.properties");

		System.setProperty("webdriver.chrome.driver", "E:\\Lib\\chromedriver.exe");
		driver = new ChromeDriver();
		log.info("Chrome Browser Launch");

		driver.manage().window().maximize();
		log.info("Browser Maximize");
		
		driver.get("https://www.google.com");
		log.info("Lauch google website url");
		
		driver.findElement(By.name("q")).sendKeys("Hello World");
		log.info("Type the Hello World in Google Search");
		
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		log.info("Enter Button Press in Keyboard");
		
		Thread.sleep(3000);
		log.info("Wait for 3 Seconds");
		
		driver.quit();
		log.info("Browser close");


	}

}
