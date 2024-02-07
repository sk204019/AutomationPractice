package automationPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchingAutomationManyWays {

	public static void main(String[] args) {
		WebDriver driver ;
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse_WorkSpace\\Eclipse_WorkSpace\\SeleniumPractice\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		//WebDriverManager.chromedriver().setup();
		//WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		System.out.println("111");
		driver.quit();

	}

}
