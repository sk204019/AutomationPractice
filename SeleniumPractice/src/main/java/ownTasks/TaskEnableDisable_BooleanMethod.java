package ownTasks;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TaskEnableDisable_BooleanMethod {

	WebDriver driver;

	public void setUp()
	{
		driver = new FirefoxDriver();
		//driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://testautomationpractice.blogspot.com/");
	}



	public static void main(String[] args) {
		TaskEnableDisable_BooleanMethod select = new TaskEnableDisable_BooleanMethod();
		select.setUp();
		select.selectCheckBox(false);
		System.out.println("@@");
		select.disableCheckBox(true);
		System.out.println("##");
	}

	public void disableCheckBox( Boolean disable)
	{
		//WebElement gender = driver.findElement(By.xpath("//input[@value='male']"));
		//gender.click();
		List< WebElement> checkBoxes = driver.findElements(By.xpath("//input[@type='checkbox' and @class='form-check-input']"));
		for (WebElement operation : checkBoxes) {
			operation.click();
		}
	}

	
	public  void selectCheckBox(Boolean enableBoolean)
	{
		WebElement gender = driver.findElement(By.xpath("//input[@value='male']"));
		gender.click();
		List< WebElement> checkBoxes = driver.findElements(By.xpath("//input[@type='checkbox' and @class='form-check-input']"));
		for (WebElement operation : checkBoxes) {
			operation.click();
		}


	}

}
