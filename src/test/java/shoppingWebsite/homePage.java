package shoppingWebsite;

import java.io.IOException;
import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Util.excelUtil;
import pageObjects.landingPage;
import pageObjects.loginPage;
import resources.base;

public class homePage extends base {

	
	@Test (dataProvider="getData")
	public void basePageNavigation(String userName, String password) throws IOException {
		driver = initializeDriver();
		driver.get("https://www.amazon.in/");
		
		landingPage l= new landingPage(driver);
		l.getLogin().click();
		
		loginPage lp = new loginPage(driver);
		
		lp.getEmail().sendKeys("userName");
		lp.contBtn().click();
		
		lp.password().sendKeys("password");
		lp.signIn().click();
		
		
		}
	
	
	@DataProvider
	public Object[][] getData()
	{
		Object data [][]=excelUtil.getData("login");
		return data;
		
	}
	
}
