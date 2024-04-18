package Interview_Questions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class refreshBrowser {
	
	
	@Test
	public void test1() throws AWTException, IOException
	{
		WebDriver driver;
		
		driver = new ChromeDriver();
		
		driver.get("https://www.google.co.in");
		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_F5);
		robot.keyRelease(KeyEvent.VK_F5);
		
		TakesScreenshot screenshot = (TakesScreenshot)driver;
		File src = screenshot.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\rames\\sasmplescreenshot.png");
		FileUtils.copyFile(src, dest);
		
		driver.navigate().refresh();
		
		
		
		
		
	}

}
