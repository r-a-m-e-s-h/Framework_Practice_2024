package RahulShetty_course;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion {
	
	@Test
	public void test()
	{
	
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/#");
		
		WebElement logo = driver.findElement(By.xpath("//div[@id='Div6']//input[@id='ctl00_mainContent_btn_FindFlights']"));
		Assert.assertTrue(logo.isDisplayed());
		
	}

}
