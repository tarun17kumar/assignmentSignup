package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import actions.SignInAction;
import utils.Constants;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import webElements.facebookLoginPage;
import webElements.homePage;

public class testcase {
	
	private static WebDriver driver = null;
	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.gecko.driver", "/home/voler/Documents/Softwares/geckodriver");
		driver = new FirefoxDriver();
		
		driver.get(Constants.URL);		
		
		homePage.loginLink(driver).click();
		
		Thread.sleep(3000);
		
		 ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
		 driver.switchTo().window(tabs2.get(1));
		 
		    SignInAction.SignInPopxo(driver, "9868381394", "tu567yal");
			driver.switchTo().window(tabs2.get(0));
		    
			Thread.sleep(5000);			
			
		    System.out.println(driver.getTitle());
		    driver.quit();
		
		}

}
