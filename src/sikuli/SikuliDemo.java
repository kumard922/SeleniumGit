package sikuli;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;
import org.testng.annotations.BeforeTest;

public class SikuliDemo {
	WebDriver driver;
	Screen s = new Screen();
	
  @Test
  public void sikuliAutomation() throws FindFailed, Exception {
	  driver.get("http://seleniumlearn.com/program-drop-down-select-option");
	  Thread.sleep(6000);
	  s.click("E:\\Lib\\Sikuli\\Java.PNG");
	//  s.click("E:\\Lib\\Sikuli\\Windows.PNG");
	  //Thread.sleep(6000);
	 // s.click("E:\\Lib\\Sikuli\\Wether.PNG");
	//  Thread.sleep(3000);
	//  s.type("E:\\Lib\\Sikuli\\Search.PNG", "Sikuli");
	//  s.dragDrop("E:\\Lib\\Sikuli\\Recycle.PNG", "E:\\Lib\\Sikuli\\Start.PNG");
	  }
  
  
  
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "E:\\Lib\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
  }

}
