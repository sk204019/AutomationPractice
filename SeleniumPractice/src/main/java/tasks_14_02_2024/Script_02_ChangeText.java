package tasks_14_02_2024;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Script_02_ChangeText {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

		//change Text
		WebElement changeText	= driver.findElement(By.xpath("//button[@id='populate-text']"));
		String intialTextCapture = driver.findElement(By.xpath("//h2[@id='h2']")).getText();
		System.out.println("before click operation change text status message is :  "  +"'"+intialTextCapture+"'");
		changeText.click();
		System.out.println("after click operation  change text message is :   "   +"'"+intialTextCapture+"'");

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[text()='Selenium Webdriver']")));
		//String expectedTxt = "Selenium Webdriver";
		//wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//h2[text()='Selenium Webdriver']"), expectedTxt));

		String textCapture = driver.findElement(By.xpath("//h2[@id='h2']")).getText();
		System.out.println("After 10 seconds " +intialTextCapture+ " message  replaced with :  "  +"'"+textCapture+"'");

		driver.close();
	}

}
