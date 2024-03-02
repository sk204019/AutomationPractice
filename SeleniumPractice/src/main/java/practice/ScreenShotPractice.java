package practice;

import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScreenShotPractice {

	public static void main(String[] args) throws Throwable {


		WebDriver driver = new FirefoxDriver();
		//driver = new ChromeDriver();



		driver.manage().window().maximize();

		driver.get("https://testautomationpractice.blogspot.com/");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


		WebElement name = driver.findElement(By.xpath("//input[@id='name']"));
		name.sendKeys("R.Sunil Kumar Reddy");

		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys("rskr.qa@gmail.com");

		WebElement phone = driver.findElement(By.xpath("//input[@id='phone']"));
		phone.sendKeys("+91-9666747419");


		WebElement address = driver.findElement(By.xpath("//textarea[@id='textarea']"));
		address.sendKeys("HNo -6/20, Godhinavari Street, Chennur(P)(V)(M), Y.S.R KADAPA, Andhra Pradesh, PINCODE -516162.");


		WebElement gender = driver.findElement(By.xpath("//input[@value='male']"));
		gender.click();
		System.out.println(gender.isSelected());


		List< WebElement> checkBoxes = driver.findElements(By.xpath("//input[@type='checkbox' and @class='form-check-input']"));

		for (WebElement operation : checkBoxes) {
			Thread.sleep(2000);
			operation.click();
			TakesScreenshot screenShot = (TakesScreenshot)driver;
			File image = screenShot.getScreenshotAs(OutputType.FILE);
			File destinationFolder = new File(".\\ScreenShots_Folder\\screenshot"+".png");
			FileUtils.copyFile(image, destinationFolder);
		}
		driver.close();
	}
}

