package tasks_14_02_2024;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_DynamicDropDown {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("apple");

		List< WebElement> listOfSuggestion = driver.findElements(By.xpath("//div[@class='left-pane-results-container']//div[@class='s-suggestion-container']//span"));
		System.out.println(listOfSuggestion.size());


		//only charger
		//	List< WebElement> suggestionDropdowns = driver.findElements(By.xpath("//div[@class='left-pane-results-container']//div[@role='button']//span[text()=' charger']"));		
		//	System.out.println(suggestionDropdowns.size());

		for (WebElement options : listOfSuggestion) {

			String suggestionsPrint = options.getText();
			System.out.println(options.getText());

			if (suggestionsPrint.contains("charger")) {
				options.click();

			}
		}

	}

}
