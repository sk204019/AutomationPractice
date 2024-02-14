package tasks_14_02_2024;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Script_01_Alert_ExpicityWait {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");

		//click me
		WebElement clickMe = driver.findElement(By.xpath("//button[@id='alert']"));
		clickMe.click();

		//Explicity wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.alertIsPresent());

		Alert alerts  = driver.switchTo().alert();
		alerts.accept();

		String alertText = driver.findElement(By.xpath("//span[text() =' Alert opens in : ']")).getText();
		System.out.println("alert Text message after 5 seconds :   "+"'"+alertText+"'");

		driver.close();



	}

}
