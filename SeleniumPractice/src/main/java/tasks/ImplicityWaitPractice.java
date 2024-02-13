

package tasks;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicityWaitPractice {

	static WebDriver driver;

	public static void main(String[] args) throws Throwable {

		driver = new ChromeDriver();

		//driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://trytestingthis.netlify.app/");
		
		//ImplicityWait
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		WebElement firstName = driver.findElement(By.xpath("//input[@id='fname']"));
		firstName.sendKeys("Ravula");

		WebElement lastName = driver.findElement(By.xpath("//input[@id='lname']"));
		lastName.sendKeys("Sunil Kumar Reddy");

		WebElement gender = driver.findElement(By.xpath("//input[@id='male']"));
		gender.click();
		System.out.println(" 'Gender' checkBox Selected Status(true/false) : " +gender.isSelected());


		List<WebElement> options = driver.findElements(By.xpath("//input[@id='moption']"));
		System.out.println("Total Options are : " +options.size());
		for (WebElement checkBoxOptions : options) {
			checkBoxOptions.click();
		}
		System.out.println("Total Selected Options are : " +options.size());

		//Thread.sleep(2000);
		WebElement chooseFile =  driver.findElement(By.xpath("//input[@id='myfile']"));
		System.out.println("'Choose File' Enable status(true/false) : " +chooseFile.isEnabled());

		//Thread.sleep(5000);
		WebElement longMessage =  driver.findElement(By.xpath("//textarea[@name= 'message']"));
		longMessage.clear();
		longMessage.sendKeys("100% Testing is not Possible");
		System.out.println("User message Displayed Status Of long Message feildBox(true/false) : "+longMessage.isDisplayed());

		//Thread.sleep(3000);
		WebElement submitButton =  driver.findElement(By.xpath("//button[text()=' Submit']"));
		//submitButton.click();
		submitButton.submit();

		driver.close();

	}  

}
