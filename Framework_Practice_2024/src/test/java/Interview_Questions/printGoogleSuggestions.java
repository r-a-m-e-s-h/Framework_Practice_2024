package Interview_Questions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class printGoogleSuggestions {
	
	
	@Test 
	public void test1() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.co.in");
		
		WebElement searchbox = driver.findElement(By.name("q"));
		searchbox.sendKeys("game of thrones");
		
		Thread.sleep(4000);
		
		List<WebElement> result = driver.findElements(By.xpath("//ul[@role=\"listbox\"]//following::li"));
		int position =0;
		for(WebElement data :result)
		{
			//System.out.println(data.getText());
			
			/*
			 * position++; if(position==3) { data.click(); break; }
			 */
			
			if(data.getText().contains("season 8"))
			{
				data.click();
				break;
			}
		}
		
		//driver.quit();
		
		
	}
	

}
