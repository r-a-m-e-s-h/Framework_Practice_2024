package Interview_Questions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class js_scroll {
	
	
	@Test
	public void scroll_tc() throws InterruptedException, AWTException
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/search?q=wikipedia&sca_esv=47bbd2a2bf8cf0cc&sca_upv=1&sxsrf=ACQVn09BErwkxh15AopR3xMn2BPOlQISMw%3A1712266606613&ei=bh0PZoaGJfPe2roPysSN4A0&ved=0ahUKEwiG9eOWwqmFAxVzr1YBHUpiA9wQ4dUDCBA&uact=5&oq=wikipedia&gs_lp=Egxnd3Mtd2l6LXNlcnAiCXdpa2lwZWRpYTIQEAAYgAQYigUYQxixAxjJAzIKEAAYgAQYigUYQzINEAAYgAQYigUYQxixAzIKEAAYgAQYigUYQzIFEAAYgAQyCBAAGIAEGLEDMgsQABiABBiKBRiSAzILEAAYgAQYigUYkgMyCxAuGIAEGLEDGIMBMggQABiABBixA0j2DFAAWMEKcAB4AZABAJgBtgKgAZ4OqgEHMC42LjIuMbgBA8gBAPgBAZgCCaACyQ7CAgQQIxgnwgIKECMYgAQYigUYJ8ICEBAAGIAEGIoFGEMYsQMYgwHCAhYQLhiABBiKBRhDGLEDGIMBGMcBGNEDwgILEAAYgAQYsQMYgwHCAhEQLhiABBixAxiDARjHARjRA8ICCxAAGIAEGIoFGJECwgIOEC4YgAQYigUYsQMYgwGYAwCSBwcwLjYuMi4xoAflVA&sclient=gws-wiz-serp#ip=1");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//driver.manage().window().maximize();
		
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("window.scroll(0,250)", "");
		
		Thread.sleep(3000);
		
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)", "");
		
		Thread.sleep(3000);
		
		js.executeScript("window.scroll(0,0)","");
		
		Thread.sleep(3000);
		
		WebElement element = driver.findElement(By.xpath(" //*[@id=\"rso\"]/div[2]/div[6]/div/div/div/div[1]/div/div/span/a"));
		
		js.executeScript("arguments[0].scrollIntoView(true)", element);
		
		Thread.sleep(3000);
		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_PAGE_UP);
		robot.keyRelease(KeyEvent.VK_PAGE_UP);
		
		Thread.sleep(3000);
		
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
		
		Thread.sleep(3000);
		
		driver.quit();
		
		
		
		
		
	}

}
