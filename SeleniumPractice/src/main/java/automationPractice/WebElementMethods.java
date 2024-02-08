package automationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethods {


	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();


		/*	

		//click
		driver.get("https://trytestingthis.netlify.app/");
		WebElement clickOperation =	driver.findElement(By.xpath("//label[@for='male']"));
		clickOperation.click();


		//sendkeys & clear
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(3000);
		WebElement userName = driver.findElement(By.name("username"));
		userName.sendKeys("Admin");
		userName.clear();


		//getText
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(2000);
		String text = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/h5")).getText();
		System.out.println(text);
		driver.close();    

		//isSelected()
		driver.get("https://trytestingthis.netlify.app/");
		WebElement clickOperation =	driver.findElement(By.xpath("//label[@for='male']"));
		clickOperation.click();
		clickOperation.isSelected(); 
		System.out.println(clickOperation);


		//isEnabled
		driver.get("https://trytestingthis.netlify.app/");
		WebElement buttonVerification =	driver.findElement(By.xpath("/html/body/div[3]/div[2]/form/fieldset/button"));
		buttonVerification.isEnabled();
		System.out.println(buttonVerification.isEnabled());



		//isDisplayed
		driver.get("https://trytestingthis.netlify.app/");
		 WebElement firstName= driver.findElement(By.name("fname"));
		 firstName.isDisplayed();
		 System.out.println(firstName.isDisplayed());

		 

		//getLocation
		driver.get("https://trytestingthis.netlify.app/");
		WebElement firstName= driver.findElement(By.name("fname"));
		firstName.getLocation();
		System.out.println(firstName.getLocation());


		//
		driver.get("https://trytestingthis.netlify.app/");
		WebElement clickOperation =	driver.findElement(By.xpath("//label[@for='male']"));
		System.out.println(clickOperation.isSelected());
		clickOperation.click();
		System.out.println(clickOperation.isSelected());
		
		*/	
		
		
	}

}
