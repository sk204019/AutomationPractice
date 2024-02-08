package tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Task1 {

	static WebDriver driver;

	public static void main(String[] args) throws Throwable {

		driver = new ChromeDriver();

		//WebDriver Methods & WebElements Commands

		//Get Url
		driver.get("https://testautomationpractice.blogspot.com/");

		//using manage window maximize
		Thread.sleep(2000);
		driver.manage().window().maximize();

		
		//using navigate refresh webpage
		Thread.sleep(3000);
		driver.navigate().refresh();

		//Current Url
		String currrentUrl =driver.getCurrentUrl();
		System.out.println(currrentUrl);

		//Get Title
		String title = 	driver.getTitle();
		System.out.println(title);

		//findelement & sendkeys
		//Using findElement method to send user data using sendkeys
		WebElement name = driver.findElement(By.id("name"));
		System.out.println(name.isDisplayed());
		name.sendKeys("R.Sunil Kumar Reddy");  

		//click operation
		WebElement clickOperation =	driver.findElement(By.xpath("//input[@id='male']"));
		System.out.println(clickOperation.isSelected());
		clickOperation.click();

		//is Selected
		clickOperation.isSelected();
		System.out.println(clickOperation.isSelected());   

		//clear   
		WebElement name1 = driver.findElement(By.id("name"));
		name1.sendKeys("R.Sunil Kumar Reddy");
		name1.clear();  


		//Get Text
		String text = driver.findElement(By.xpath("//h1[@class='title']")).getText();
		System.out.println(text);
		 
		
		
		//isEnabled   & is Displayed
		WebElement checkBox = driver.findElement(By.id("sunday"));
		checkBox.isEnabled();
		System.out.println(checkBox.isEnabled());
		
		checkBox.isDisplayed();
		System.out.println(checkBox.isDisplayed());
		
		//isDisplayed
		
		//close
		driver.close();
		//driver.quit();
		

	}
}
