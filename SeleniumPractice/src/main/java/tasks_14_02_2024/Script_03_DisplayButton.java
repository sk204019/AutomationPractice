package tasks_14_02_2024;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Script_03_DisplayButton {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();

		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

		WebElement displayButton = driver.findElement(By.xpath("//button[@id='display-other-button']"));
		WebElement	buttonStatus = driver.findElement(By.xpath("//button[@id='hidden']"));
		System.out.println("before click operation perform button display status i : " +"'"+buttonStatus.isDisplayed()+"'");
		displayButton.click();
		System.out.println("after click operation perform button display status is :  " +"'"+buttonStatus.isDisplayed()+"'");
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='hidden']")));
		System.out.println("after 10 seconds button display status :  " +"'"+buttonStatus.isDisplayed()+"'");
	}
}
