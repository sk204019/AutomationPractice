package automationPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods {

	static WebDriver driver;

	public static void main(String[] args) throws Throwable{
		driver = new ChromeDriver();

		//13 WebDriver Methods 

		//1st String Url
		driver.get("https://opensource-demo.orangehrmlive.com/");

		//2nd CurrentUrl
		driver.getCurrentUrl();
		System.out.println(driver.getCurrentUrl());

		//3rd
		driver.getPageSource();
		System.out.println(driver.getPageSource());
		//driver.

	}

}
