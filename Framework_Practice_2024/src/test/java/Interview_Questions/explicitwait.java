package Interview_Questions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class explicitwait {

	public WebDriver driver;
	@Test
	public void ewait_test()
	{

		driver = new ChromeDriver();

		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");

		WebElement element = driver.findElement(By.xpath("//*[@id=\"checkbox\"]"));
		element.click();

		WebDriverWait ewait = new WebDriverWait(driver, Duration.ofSeconds(10));
		ewait.until(ExpectedConditions.elementToBeSelected(By.xpath("//*[@id=\"ch\"]")));

		WebElement chk = driver.findElement(By.xpath("//*[@id=\"ch\"]"));
		
		if (chk.isSelected()) {
			System.out.println("button checked");
		
		}
		else
		{
			System.out.println("nooooooooooooo");
		}
		



		driver.quit();

		
		
		
	}
}
