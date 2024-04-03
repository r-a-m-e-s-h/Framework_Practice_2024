package TestCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Utilites.readConfig;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass_April3 {
	
	public WebDriver driver;
	
	readConfig config = new readConfig();
	String baseURL = config.getbaseURL();
	String browserName = config.getBrowser();
	String userName = config.getUserName();
	String passWord = config.getPassWord();
	
	@BeforeSuite
	public void setUp()
	{
		if(browserName.equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();
			WebDriverManager.chromedriver().setup();
		}
		else
		{
			driver = new EdgeDriver();
			WebDriverManager.edgedriver().setup();
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get(baseURL);
	}
	
	@Test
	public void trySample_test()
	{
		System.out.println("hello test passed");
	}
	
	@AfterSuite
	public void tearDown()
	{
		 driver.quit();
	}

}
