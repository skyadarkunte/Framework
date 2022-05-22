package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class landingPage {
	
	public WebDriver driver;
	
	By signIn1=By.className("nav-action-button");
	By signIn= By.cssSelector("a[href*='signin']");
	
	
	
	public landingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
	}







	public WebElement getLogin() {
		
		return driver.findElement(signIn);
		
	}
}
