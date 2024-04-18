package RahulShetty_course;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class checkall_ck {


	@Test
	public void test()
	{
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.leafground.com/checkbox.xhtml");

		List<WebElement> noraml_check_all = driver.findElements(By.xpath("//*[contains(@class,'ui-chkbox-box ')]"));

		int position=0;
		
		for(WebElement ele: noraml_check_all)
		{
			position++;
			
			if(position<9)
			{

				ele.click();
				
			}
		}



	}

}
