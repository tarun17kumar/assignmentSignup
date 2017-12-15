package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GetMetaContent {
	
	private static WebDriver driver = null;
	public static WebElement element = null;
	
	public static void openPage(String URL)
	{
		driver.get(URL);
		
	}
	
	public static String getMetaDescription(WebDriver driver) {
		
		element = driver.findElement(By.xpath("//meta[@name='description']"));
		return element.getAttribute("content");
	}
	
    public static String getMetakewords(WebDriver driver) {
		
		element = driver.findElement(By.xpath("//meta[@name='keywords']"));
		return element.getAttribute("content");
	}
    
    public static String getOgURL(WebDriver driver) {
		
		element = driver.findElement(By.xpath("//meta[@property='og:url']"));
		return element.getAttribute("content");
	}
 
     public static String getOgTitle(WebDriver driver) {
		
		element = driver.findElement(By.xpath("//meta[@property='og:title']"));
		return element.getAttribute("content");
	}


}
