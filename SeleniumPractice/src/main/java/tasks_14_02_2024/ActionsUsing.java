package tasks_14_02_2024;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
/*
mousehover
RightClick
Drag And Drop
Double Click 
 */
public class ActionsUsing {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		//mousehover
		WebElement mouseOperationPerform = driver.findElement(By.xpath("//span[@class='nav-line-2 ']//span[@style='visibility: visible;']"));

		Actions action = new Actions(driver);
		action.moveToElement(mouseOperationPerform).build().perform();
		mouseOperationPerform.click();
		//action.doubleClick();
		if (driver.getCurrentUrl().contains("https://www.amazon.in/ap/signin")) {
			System.out.println("succesfully handeld mose hover operation of sig in page");
		} else {
			System.out.println("user failed to handle through mouse operation of sign in page");
		}
		driver.quit();
		 /*
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement dragToMeMyTarget =	driver.findElement(By.id("draggable"));
		WebElement dropHere = driver.findElement(By.id("droppable"));
		Actions action = new Actions(driver);
		action.dragAndDrop(dragToMeMyTarget, dropHere).build().perform();
		System.out.println("111");  */
	}

}
