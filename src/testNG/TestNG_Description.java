package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TestNG_Description {
	WebDriver driver;
	
 
  
  @Test(description="Google Hondacars Search",priority=0)
  public void testCase_1() {
	  driver.findElement(By.name("q")).sendKeys("hondacars");
	  driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
  }
  
  @Test(priority=1,description="Click on Images")
  public void testCase_2() {
	  driver.findElement(By.xpath("//*[@id=\"hdtb-msb\"]/div[1]/div/div[3]/a")).click();	
  }
  
  
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "E:\\Lib\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
  }

  @AfterTest
  public void afterTest() {
	 // driver.quit();
  }

}
