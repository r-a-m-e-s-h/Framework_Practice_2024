package Interview_Questions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class printsearchresult_url {

	@Test
	public void test() throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.co.in");

		WebElement searchbox = driver.findElement(By.name("q"));
		searchbox.sendKeys("game of thrones" + Keys.ENTER);

		Thread.sleep(5000);

		List<WebElement> totalresult = driver
				.findElements(By.xpath("//*[@id=\"search\"]//following::h3//following::div/cite"));

		for (WebElement element : totalresult) {

			System.out.println(element.getText());
			

		}

		driver.quit();

	}

}
