package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class GitDemo {
  @Test
  public void gitdemo() {
	  System.out.println("Hello GitHub");
  }
  
  @Test
  public void gitSelenium() {
	  System.out.println("Hello Seleniumlearn");
  }
  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

}
