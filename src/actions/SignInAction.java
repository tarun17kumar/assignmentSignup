package actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import webElements.facebookLoginPage;

public class SignInAction {
	
	
	
	public static void SignInPopxo(WebDriver driver, String username, String password) {		
		
		facebookLoginPage.emailField(driver).clear();
		facebookLoginPage.emailField(driver).sendKeys(username);
		facebookLoginPage.passField(driver).clear();
		facebookLoginPage.passField(driver).sendKeys(password);
		facebookLoginPage.loginButton(driver).click();
	}

}
