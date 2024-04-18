package RahulShetty_course;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AutoSuggest {

	@Test
	public void test_suggest() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		WebElement Auto_dd = driver.findElement(By.xpath("//*[@id=\"autosuggest\"]"));
		Auto_dd.sendKeys("ind");

		Thread.sleep(3000);

		List<WebElement> elements = driver.findElements(By.xpath("//ul[@id='ui-id-1']//following::li/a"));

		for(WebElement ele : elements )
		{
			//System.out.println(ele.getText());

			if(ele.getText().equals("India")) {

				ele.click();
				break; }

		}


	}

}
