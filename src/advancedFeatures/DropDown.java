package advancedFeatures;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class DropDown {
	WebDriver driver;
	
  @Test
  public void dropdown() {
	  driver.get("http://seleniumlearn.com/program-drop-down-select-option");
	  
	//  new Select(driver.findElement(By.id("transactionType"))).selectByVisibleText("SEO");
	  
	//  new Select(driver.findElement(By.id("transactionType"))).selectByValue("4");
	  
	  new Select(driver.findElement(By.id("transactionType"))).selectByIndex(2);
  }
  
  
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "E:\\Lib\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
	//  driver.quit();
  }

}
