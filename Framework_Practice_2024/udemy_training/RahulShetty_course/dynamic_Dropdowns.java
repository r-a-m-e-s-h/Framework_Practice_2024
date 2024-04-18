package RahulShetty_course;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class dynamic_Dropdowns {
	
	WebDriver driver;
	
	@Test
	public void test_dd() throws InterruptedException
	{
		driver = new ChromeDriver();
		driver.get("https://www.leafground.com/select.xhtml;jsessionid=node01awdi3g4r674xs21v20pxvi1o572557.node0");
		
		WebElement dd = driver.findElement(By.xpath("//*[@class=\"ui-selectonemenu\"]"));
		
		Select select = new Select(dd);
		select.selectByVisibleText("Selenium");
		
		Thread.sleep(3000);
		
		WebElement dynamicdd = driver.findElement(By.xpath("//*[@id=\"j_idt87:country_label\"]"));
		dynamicdd.click();
		
		driver.findElement(By.xpath("//ul[@id=\"j_idt87:country_items\"]//following-sibling::li[text()=\"India\"]")).click();
		
		//driver.quit();
		
		/*
		 * Select select2 = new Select(dynamicdd); select2.selectByVisibleText("India");
		 * 
		 * Thread.sleep(3000);
		 * 
		 * WebElement dynamicdd2 =
		 * driver.findElement(By.xpath("//*[@id=\"j_idt87:city_label\"]"));
		 * 
		 * Select select3 = new Select(dynamicdd2); select3.selectByIndex(2);
		 */
		
		
	}

}
