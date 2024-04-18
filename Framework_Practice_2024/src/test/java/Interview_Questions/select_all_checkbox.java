package Interview_Questions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class select_all_checkbox {

	@Test
	public void test_chkbox() {
		WebDriver driver = new ChromeDriver();

		driver.get("https://developer.mozilla.org/en-US/docs/Web/HTML/Element/input/checkbox");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		List<WebElement> ck = driver.findElements(By.xpath("//*[@type=\"checkbox\"]"));

		for (WebElement element : ck) {
			element.click();
		}

	}

}
