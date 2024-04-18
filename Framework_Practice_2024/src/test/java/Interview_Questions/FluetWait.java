package Interview_Questions;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class FluetWait {

	public WebDriver driver;

	@Test
	public void Fwait_TC() throws InterruptedException {

		driver = new ChromeDriver();

		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");

		WebElement element = driver.findElement(By.xpath("//*[@id=\"display-other-button\"]"));
		element.click();

		Thread.sleep(4000);

		/*
		 * WebDriverWait ewait = new WebDriverWait(driver, Duration.ofSeconds(11));
		 * ewait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(
		 * "//*[@id=\"hidden\"]")));
		 */
		
		

		
		  Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
								  .withTimeout(Duration.ofSeconds(20)) 
								  .pollingEvery(Duration.ofSeconds(5))
								  .ignoring(NoSuchElementException.class);
		  
		  WebElement fwait = wait.until(new Function<WebDriver, WebElement>() {
		  
		  public WebElement apply(WebDriver driver) { 
			 
			  return driver.findElement(By.xpath("//*[@id=\"hidden\"]")); }
		  
		  });
		  fwait.click();
		 

	}

}
