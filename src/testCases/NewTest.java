package testCases;

import org.testng.annotations.Test;

import actions.SignInAction;
import utils.Constants;
import webElements.homePage;

import org.testng.annotations.BeforeTest;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class NewTest {
	
	private static WebDriver driver = null;
	
  @Test
  public void f() throws InterruptedException {
	  
	  homePage.loginLink(driver).click();
		
		Thread.sleep(3000);
		
		ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(tabs2.get(1));
		 
		SignInAction.SignInPopxo(driver, "9868381394", "tu567yal");
		driver.switchTo().window(tabs2.get(0));
		assertEquals(driver.getTitle(), "The Desi Girl's Guide To Life & Love! | POPxo");
		    
		Thread.sleep(5000);	
  }
  
  @BeforeTest
  public void beforeTest() {
	  
		System.setProperty("webdriver.gecko.driver", "/home/voler/Documents/Softwares/geckodriver");
		driver = new FirefoxDriver();		
		driver.get(Constants.URL);
  }

  @AfterTest
  public void afterTest() {
	  
	  System.out.println(driver.getTitle());
	  driver.quit();
  }

}
