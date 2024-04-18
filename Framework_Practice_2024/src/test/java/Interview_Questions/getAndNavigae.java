package Interview_Questions;

import java.awt.Robot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class getAndNavigae {

	WebDriver driver;

	@Test
	public void test() throws InterruptedException {
		driver = new ChromeDriver();
		driver.navigate().to("https://www.google.co.in");
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().refresh();

		Thread.sleep(3000);

		driver.get("https://www.google.co.in");

		driver.quit();
	}

}
