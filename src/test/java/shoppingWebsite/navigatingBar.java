package shoppingWebsite;

import java.io.IOException;
import java.sql.Driver;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Util.excelUtil;
import pageObjects.landingPage;
import pageObjects.loginPage;
import resources.base;

public class navigatingBar extends base {
	public WebDriver driver;
	public static Logger log=LogManager.getLogger(base.class.getName());
	@BeforeTest
	
	public void initialize() throws IOException {
		
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));
	}
	
	@Test 
	public void basePageNavigation() throws IOException {

		
		landingPage l= new landingPage(driver);
		System.out.println(l.navBar().isDisplayed());
		Assert.assertTrue(l.navBar().isDisplayed());
		log.info("NAVBar exists");
		}

   @AfterTest
   
   public void TearDown()
   {
	   driver.close();
   }
   
	
}
