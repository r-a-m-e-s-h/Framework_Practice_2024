package RahulShetty_course;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class try_dd {
	
	@Test
	public void test_dd() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_ddl_originStation1_CTXTaction\"]")).click();
		
		driver.findElement(By.xpath("//a[@value=\"MAA\"]")).click();
		
		Thread.sleep(3000);
		
		//driver.findElement(By.xpath("(//a[@value=\"CJB\"])[2]")).click();
		
		driver.findElement(By.xpath("//div[@id=\"glsctl00_mainContent_ddl_destinationStation1_CTNR\"]//a[@value=\"CJB\"]")).click();
		
	}

}


