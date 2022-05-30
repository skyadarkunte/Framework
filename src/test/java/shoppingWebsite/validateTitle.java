package shoppingWebsite;

import java.io.IOException;
import java.sql.Driver;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Util.excelUtil;
import pageObjects.landingPage;
import pageObjects.loginPage;
import resources.base;

public class validateTitle extends base {
	public WebDriver driver;
	public static Logger log=LogManager.getLogger(base.class.getName());
	public void initialize() throws IOException {
		
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));
	}
	
	@Test 
	public void basePageNavigation() throws IOException {
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));
		
		landingPage l= new landingPage(driver);
		System.out.println(l.getTitle().getText());
		//Assert.assertEquals(l.getTitle().getText(), "Try Prime, Free for 30 days");
		log.info("No text presents");

		
		}
	
	   @AfterTest
	   
	   public void TearDown()
	   {
		   driver.close();
	   }
	
}
