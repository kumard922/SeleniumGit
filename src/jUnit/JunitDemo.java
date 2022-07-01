package jUnit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.Ignore;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class JunitDemo {

	static WebDriver driver;

	@Test
	void facebook() {

		driver.get("https://www.facebook.com");

	}

	@Disabled
	@Test
	void search() {
		driver.findElement(By.name("q")).sendKeys("dinesh");
	}

	@Test
	void gmail() {

		driver.get("https://www.gmail.com");

	}

	@Test
	void google() {
		driver.get("https://www.google.com");

	}

	@BeforeAll
	static void setUpBeforeClass() throws Exception {

		System.setProperty("webdriver.chrome.driver", "E:\\Lib\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {

		driver.quit();
	}

}
