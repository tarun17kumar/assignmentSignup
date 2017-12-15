package webElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class homePage {
	
	private static WebElement element = null;
	
	public static WebElement loginLink(WebDriver driver) {
		
		element = driver.findElement(By.xpath("//button[@onclick=\"facebook_login('','','Header');\"]"));
		return element;
		
	}
	

}
