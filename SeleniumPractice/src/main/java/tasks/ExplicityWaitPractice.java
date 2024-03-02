package tasks;

import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ExplicityWaitPractice {

	public static void main(String[] args) throws Throwable{

		//System.setProperty("webdriver.chrome.driver", "D:\\Eclipse_WorkSpace\\Eclipse_WorkSpace\\Selenium_Practice\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");

		//click me
		WebElement clickMe = driver.findElement(By.xpath("//button[@id='alert']"));
		clickMe.click();

		//Explicity wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.alertIsPresent());

		Alert alerts  = driver.switchTo().alert();
		alerts.accept();

		String alertText = driver.findElement(By.xpath("//span[text() =' Alert opens in : ']")).getText();
		System.out.println("alert Text message after 5 seconds :   "+"'"+alertText+"'");


		driver.navigate().refresh();



		System.out.println("=============================== change text ================================================");

		//change Text
		WebElement changeText	= driver.findElement(By.xpath("//button[@id='populate-text']"));
		String intialTextCapture = driver.findElement(By.xpath("//h2[@id='h2']")).getText();
		System.out.println("before click operation change text status message is :  "  +"'"+intialTextCapture+"'");
		changeText.click();
		System.out.println("after click operation  change text message is :   "   +"'"+intialTextCapture+"'");

		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[text()='Selenium Webdriver']")));
		String expectedTxt = "Selenium Webdriver";
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//h2[text()='Selenium Webdriver']"), expectedTxt));

		String textCapture = driver.findElement(By.xpath("//h2[@id='h2']")).getText();
		System.out.println("After 10 seconds " +intialTextCapture+ " message  replaced with :  "  +"'"+textCapture+"'");


		driver.navigate().refresh();


		System.out.println("");
		System.out.println("+++++++++++++++++++++++++++++++ displaybutton +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

		//displayButton
		WebElement displayButton = driver.findElement(By.xpath("//button[@id='display-other-button']"));
		WebElement	buttonStatus = driver.findElement(By.xpath("//button[@id='hidden']"));
		System.out.println("before click operation perform button display status i : " +"'"+buttonStatus.isDisplayed()+"'");
		displayButton.click();
		System.out.println("after click operation perform button display status is :  " +"'"+buttonStatus.isDisplayed()+"'");
		//System.out.println(buttonStatus.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='nav-flyout-ya-signin']//span[@class='nav-action-inner'][normalize-space()='Sign in']")));
		System.out.println("after 10 seconds button display status :  " +"'"+buttonStatus.isDisplayed()+"'");
		//System.out.println(buttonStatus.isEnabled());

		driver.navigate().refresh();


		System.out.println("");
		System.out.println("=========================== enable button ====================================================");
		//enable button
		WebElement enableButton = driver.findElement(By.xpath("//button[@id='enable-button']"));
		WebElement	enableButtonStatus = driver.findElement(By.xpath("//button[@id='disable']"));
		//System.out.println("before click operation perform enable button  status" +enableButtonStatus.isDisplayed());
		System.out.println("before click operation perform enable button  status  : "  +"'"+enableButtonStatus.isEnabled()+"'");
		enableButton.click();
		System.out.println("after click operation perform enable button  status  :  " +"'"+enableButtonStatus.isEnabled()+"'");

		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@id='disable']")));

		System.out.println("after 10 seconds enable button  status : " +"'"+enableButtonStatus.isEnabled()+"'");


		driver.navigate().refresh();


		System.out.println("");
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%% checkbox %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		//checkBox
		WebElement checkBoxLink = driver.findElement(By.xpath("//button[@id='checkbox']"));
		WebElement	checkBoxStatus = driver.findElement(By.xpath("//input[@id='ch']"));
		//System.out.println(checkBoxStatus.isDisplayed());
		checkBoxLink.click();
		System.out.println("before click on "+"'"+ "Check check box link"+"'" +" of checkbox status is : " +"'"+checkBoxStatus.isSelected()+"'");
		wait.until(ExpectedConditions.elementToBeSelected(By.xpath("//input[@id='ch']")));
		//checkBoxStatus.click();
		System.out.println("after 10 seconds " +"'"+"Check check box link"+"'"+ " of checkbox status is :" +"'"+checkBoxStatus.isSelected()+"'");

	}
}