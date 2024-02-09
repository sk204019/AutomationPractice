package tasks;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertPractice {

	static WebDriver driver;

	public static void main(String[] args) throws Throwable {

		//driver = new ChromeDriver();
		//driver = new EdgeDriver();

		driver = new FirefoxDriver();

		driver.get("https://testautomationpractice.blogspot.com/");

		WebElement	alert = driver.findElement(By.xpath("//button[text()='Alert']"));
		alert.click();

		Alert alertsHandle = driver.switchTo().alert();
		alertsHandle.accept();

		driver.navigate().refresh();

		WebElement	confirmBox = driver.findElement(By.xpath("//button[text()='Confirm Box']"));
		confirmBox.click();

		alertsHandle.dismiss();

		WebElement	prompt = driver.findElement(By.xpath("//button[text()='Prompt']"));
		prompt.click();


		alertsHandle.sendKeys("Successfully Automated Alrets ");
		alertsHandle.accept();

		String alertStatusMessage = driver.findElement(By.xpath("//*[@id=\"demo\"]")).getText();
		System.out.println(alertStatusMessage);
		
		driver.close();
	}

}
