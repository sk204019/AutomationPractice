package automationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/*
get()
getCurrentUrl()
getTitle()
getPageSource()
getText()
getTagName()
getCssValue()
getAttribute(String Name)
getSize()
close()
quit() */

public class WebDriverMethods {

	static WebDriver driver;

	public static void main(String[] args) throws Throwable{
		driver = new ChromeDriver();

		//13 WebDriver Methods 

		//1st String Url
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		/*
		 
		//2nd CurrentUrl
		driver.getCurrentUrl();
		System.out.println(driver.getCurrentUrl());

		//3rd
		driver.getPageSource();
		System.out.println(driver.getPageSource());

		//4th 
		driver.getTitle();
		System.out.println(driver.getTitle());

		//7th  manage

		driver.manage().deleteAllCookies();

		//8th navigate

		driver.navigate().back();

		//12th  & 13th

		driver.quit();
		driver.close();


		//11th switchTo

		driver.switchTo().hashCode();

		//9th

		driver.findElement(By.name("name=\"username\""));


		//10th
		driver.findElements(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/div/div"));

*/
		//5th
		driver.getWindowHandle();
		System.out.println(driver.getWindowHandle());

		//6th
		driver.getWindowHandles();



	}

}

