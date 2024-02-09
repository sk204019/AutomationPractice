package tasks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2_UpToFridaySelected {

	static WebDriver driver;

	public static void main(String[] args) throws Throwable {

		driver = new ChromeDriver();

		//driver = new FirefoxDriver();

		driver.manage().window().maximize();

		driver.get("https://testautomationpractice.blogspot.com/");

		Thread.sleep(2000);
		WebElement name = driver.findElement(By.xpath("//input[@id='name']"));
		name.sendKeys("R.Sunil Kumar Reddy");

		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys("rskr.qa@gmail.com");

		WebElement phone = driver.findElement(By.xpath("//input[@id='phone']"));
		phone.sendKeys("+91-9666747419");

		Thread.sleep(4000);
		WebElement address = driver.findElement(By.xpath("//textarea[@id='textarea']"));
		address.sendKeys("HNo -6/20, Godhinavari Street, Chennur(P)(V)(M), Y.S.R KADAPA, Andhra Pradesh, PINCODE -516162.");


		WebElement gender = driver.findElement(By.xpath("//input[@value='male']"));
		gender.click();
		System.out.println(gender.isSelected());

		Thread.sleep(3000);
		List< WebElement> checkBoxes = driver.findElements(By.xpath("//input[@type='checkbox' and @class='form-check-input']"));
		int count = 0;
		int i = checkBoxes.size();;
		Thread.sleep(3000);
		for (WebElement operation : checkBoxes) {

			if (count < i-1) 
			{
				operation.click();
				count++;	
			}
		}

		Thread.sleep(10000);
		driver.close();
	} 

}













/*  	int i = 0;
		while (count < 6 && i < checkBoxes.size()) {
			WebElement checkbox = checkBoxes.get(i);
			if (!checkbox.isSelected()) {
				checkbox.click(); 
				count++;
			}
			i++; 

		} */


