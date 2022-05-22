package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {
	
	public WebDriver driver;
	public Properties prop;
	
	public WebDriver initializeDriver() throws IOException
	{
	    prop = new Properties();
	    
		FileInputStream fis = new FileInputStream("C:\\Users\\manis\\eclipse-workspace\\Framework\\src\\main\\java\\resources\\data.properties");
		
		prop.load(fis);
		String browserName= prop.getProperty("browser");
		
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\ChromeDriver\\chromedriver.exe");
			 driver = new ChromeDriver();
		}
		
		if(browserName.equals("firefox"))
		{
			System.setProperty("webdriver.geckodriver.driver","C:\\FirefoxDriver\\geckodriver.exe");
			 driver = new ChromeDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		return driver;
	}

}
