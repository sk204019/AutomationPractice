package tasks_14_02_2024;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Script_05_CheckBox {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

		//checkBox
		WebElement checkBoxLink = driver.findElement(By.xpath("//button[@id='checkbox']"));
		WebElement	checkBoxStatus = driver.findElement(By.xpath("//input[@id='ch']"));
		checkBoxLink.click();
		System.out.println("before click on "+"'"+ "Check check box link"+"'" +" of checkbox status is : " +"'"+checkBoxStatus.isSelected()+"'");
		wait.until(ExpectedConditions.elementToBeSelected(By.xpath("//input[@id='ch']")));
		System.out.println("after 10 seconds " +"'"+"Check check box link"+"'"+ " of checkbox status is :" +"'"+checkBoxStatus.isSelected()+"'");
	}

}
