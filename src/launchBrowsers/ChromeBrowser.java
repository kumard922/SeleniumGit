package launchBrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Lib\\chromedriver.exe");
		driver = new ChromeDriver();
		
		//System.setProperty("webdriver.gecko.driver", "E:\\Lib\\geckodriver.exe");
		//driver = new FirefoxDriver();
		
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com");
		
	/*	driver.navigate().to("https://www.facebook.com");
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.navigate().refresh();
	*/	
		
	driver.close();
	
	driver.quit();
		
	}

}
