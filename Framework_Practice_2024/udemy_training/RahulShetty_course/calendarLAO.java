package RahulShetty_course;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class calendarLAO {

	@Test
	public void test_calendar() {
		WebDriver driver = new ChromeDriver();

		 driver.get("https://jqueryui.com/resources/demos/datepicker/other-months.html");

		// driver.get("https://jqueryui.com/datepicker/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		WebElement calendar_txtbox = driver.findElement(By.id("datepicker"));

		Assert.assertTrue(calendar_txtbox.isEnabled());

		Actions actions = new Actions(driver);
		actions.click(calendar_txtbox);
				
		
		/*
		 * JavascriptExecutor js = (JavascriptExecutor) driver;
		 * js.executeScript("arguments[0].click()", calendar_txtbox);
		 */

		// calendar_txtbox.sendKeys("15/08/2024"+Keys.ENTER);

		WebElement nxtBtn = driver.findElement(By.xpath("//a[@title='Next']//span[text()='Next']"));

		WebElement month = driver
				.findElement(By.xpath("//div[@class='ui-datepicker-title']//span[@class='ui-datepicker-month']"));

		WebElement dateToGive = driver.findElement(
				By.xpath("//table[@class='ui-datepicker-calendar']//following::td//a[contains(text(),'15')]"));

		List<WebElement> cal_table = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td/a"));

		for (WebElement element : cal_table) 
		{
			if (!month.equals("August"))
			{
				nxtBtn.click();
			}
			else if(month.equals("August"))
			{
				dateToGive.click();
				break;
			}
		}

	}

}
