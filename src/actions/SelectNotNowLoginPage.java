package actions;

import org.openqa.selenium.WebDriver;

import webElements.facebookLoginPage;

public class SelectNotNowLoginPage {
	
public static void SignInPopxo(WebDriver driver, String username, String password) {		
		
		facebookLoginPage.emailField(driver).clear();
		facebookLoginPage.emailField(driver).sendKeys(username);
		facebookLoginPage.passField(driver).clear();
		facebookLoginPage.passField(driver).sendKeys(password);
		facebookLoginPage.loginButton(driver).click();
	}

}
