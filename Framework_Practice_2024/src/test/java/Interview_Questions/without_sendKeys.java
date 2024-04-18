package Interview_Questions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class without_sendKeys {
	
	@Test
	public void test() throws AWTException
	{
		
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.co.in");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement searchbox = 	driver.findElement(By.name("q"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("document.getElementsByName('q')[0].value='hello'","");
		js.executeScript("arguments[0].value='hello1'", searchbox);
		
	
		
		//driver.switchTo().activeElement();
		
//		Robot robot = new Robot();
//		robot.keyPress(KeyEvent.VK_I);
//		robot.keyRelease(KeyEvent.VK_I);
		
		
		
		
	}
	

}
