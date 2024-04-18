package RahulShetty_course;

import static org.testng.Assert.assertListContains;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AddtoCart {

	@Test
	public void test() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		String[] veggies = {"Pumpkin","Beetroot"};
		
		List<String> itemsToSelectList = Arrays.asList(veggies);
		

		//using explicitly giving index-wrong way

		//		WebElement Cucumber_addToCart = driver.findElement
		//				(By.xpath("(//div//h4[@class='product-name'][text()='Cucumber - 1 Kg']//following::button[text()='ADD TO CART'])[1]"));
		//		Cucumber_addToCart.click();


		List<WebElement> products = driver.findElements(By.xpath("//h4[@class='product-name']")); 
		
		
		int index = 0;
		
		for (WebElement product : products)
		{
			//if(itemsToSelectList.contains(product))
			
		    if (product.getText().contains("Pumpkin")) 
		    {
				
		        List<WebElement> buttons = driver.findElements(By.xpath("//div[@class='product-action']//button"));
		        buttons.get(index).click();
		    }
			index++;
		    
		    
		}



//working code
		/*
		 * for(int i=0;i<products.size();i++) {
		 * if(products.get(i).getText().contains("Beetroot - 1 Kg")) {
		 * driver.findElements(By.xpath("//div[@class='product-action']//button")).get(i
		 * ).click();
		 * 
		 * } }
		 */



	}
}

