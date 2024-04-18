package RahulShetty_course;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class calendar {

	@Test
	public void test_calendar() throws InterruptedException {

		//// *[@id='flightSearchContainer']//div[@class='picker-first2']//div//following::button//following::span[@id='view_fulldate_id_1']

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/#");

		WebElement autoSuggest_country = driver.findElement(By.xpath("//input[@id='autosuggest']"));
		autoSuggest_country.sendKeys("ind");

		List<WebElement> selectCountry = driver.findElements(By.xpath(
				"//ul[@class='ui-autocomplete ui-front ui-menu ui-widget ui-widget-content ui-corner-all']//li//a"));

		for (WebElement ele : selectCountry) {
			if (ele.getText().equalsIgnoreCase("India")) {
				ele.click();
				break;
			}
		}

		WebElement oneWaytrip = driver
				.findElement(By.xpath("//label[@for='ctl00_mainContent_rbtnl_Trip_0'][text()='One Way']"));
		oneWaytrip.click();

		/*
		 * WebElement Roundtrip =
		 * driver.findElement(By.xpath("//label[contains(text(),'Round Trip')]"));
		 * Roundtrip.click();
		 */

		WebElement fromdd = driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']"));
		fromdd.click();

		WebElement fromloc = driver.findElement(By.xpath("//a[@value='AMD']"));
		fromloc.click();

		WebElement toloc = driver.findElement(
				By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='MAA']"));
		toloc.click();

		List<WebElement> cal_fromDate = driver
				.findElements(By.xpath("//div[@id='ui-datepicker-div']//div//div//following::table//td/a"));

		for (WebElement element : cal_fromDate) {
			if (element.getText().equalsIgnoreCase("15")) {
				element.click();
				break;
			}
		}

		Thread.sleep(2000);

		WebElement toCalendar = driver
				.findElement(By.xpath("//div[@class='picker-second']//button[@class='ui-datepicker-trigger']"));
		toCalendar.click();

		List<WebElement> cal_toDate = driver
				.findElements(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-last']//table//td"));
		for (WebElement ele : cal_toDate) {
			if (ele.getText().equalsIgnoreCase("20")) {
				ele.click();
				break;
			}
		}
		Thread.sleep(2000);

		WebElement passengerBtn = driver.findElement(By.xpath("//div[@id='divpaxinfo']"));
		passengerBtn.click();

		WebElement selectAdult = driver.findElement(By.id("hrefIncAdt"));

		for (int i = 1; i < 4; i++) {
			selectAdult.click();

		}

		Thread.sleep(2000);

		WebElement doneBtn = driver.findElement(By.xpath("//*[@id='btnclosepaxoption']"));
		doneBtn.click();

		Thread.sleep(2000);

		WebElement searchBtn = driver.findElement(By.xpath("//input[@id='ctl00_mainContent_btn_FindFlights']"));
		searchBtn.click();

	}

}
