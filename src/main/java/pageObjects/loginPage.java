package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginPage {
	
	public WebDriver driver;
	
	By Email=By.name("email");
	By continueBtn= By.id("continue");
	By pwd= By.cssSelector("input[type='password']");
	By signIn=By.cssSelector("input[id='signInSubmit']");
	
	
	
	public loginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
	}



	public WebElement getEmail() {
		
		return driver.findElement(Email);
		
	}
	
public WebElement contBtn() {
		
		return driver.findElement(continueBtn);
		
	}

public WebElement password() {
	
	return driver.findElement(pwd);
	
}

public WebElement signIn() {
	
	return driver.findElement(signIn);
	
}
}
