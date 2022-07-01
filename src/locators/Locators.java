package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		// WebDriver driver;

		System.setProperty("webdriver.chrome.driver", "E:\\Lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://hyderabadreport.com/user");
		
	
		
	/*	driver.findElement(By.id("edit-name")).sendKeys("alekhya"); // id
		driver.findElement(By.name("pass")).sendKeys("9000109120"); // name
	//	driver.findElement(By.className("form-submit")).click(); // className
	//	driver.findElement(By.cssSelector("input.form-submit")).click(); //cssSelector
		driver.findElement(By.cssSelector(".form-submit")).click();  //cssSelector
		
		driver.findElement(By.linkText("Photos")).click();
		
		driver.findElement(By.partialLinkText("News")).click();
		
		*/
	//	driver.findElement(By.name("q")).sendKeys("Selenium"); // Google Search

	}

}
