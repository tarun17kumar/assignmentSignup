package webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class facebookLoginPage {
	
	private static WebElement element = null;
	
	public static WebElement emailField(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='email']"));
		return element;
		}
	
	public static WebElement passField(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='pass']"));
		return element;
		}
	
	public static WebElement loginButton(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='loginbutton']"));
		return element;
		}
	
	public static WebElement notNowLink(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='content']/div/div/div[2]/div[2]/a/span"));
		return element;
		}
	
	

}
