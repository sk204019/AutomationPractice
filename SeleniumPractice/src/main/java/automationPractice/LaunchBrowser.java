package automationPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser  {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		System.out.println(driver.getTitle());
		boolean str = driver.equals(currentUrl);
		System.out.println(str);
		driver.close();	

	}
}