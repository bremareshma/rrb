package week2Day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrames {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		// Syntax
		// ClassName obj= new ClassName();
		ChromeDriver driver = new ChromeDriver();

		// Load URL
		driver.get("https://jqueryui.com/selectable/");

		// Implicit Wait

		/*
		 * Options opt = driver.manage();
		 * 
		 * Timeouts time = opt.timeouts();
		 * 
		 * time.implicitlyWait(30, TimeUnit.SECONDS);
		 */

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// driver.findElements

		// driver.findElement

		// Maximize
		driver.manage().window().maximize();
		
		driver.switchTo().frame(driver.findElementByClassName("demo-frame"));
		//driver.switchTo().frame("demo-frame");
		driver.findElementByXPath("//*[@id='selectable']/li[3]").click();
		
		driver.switchTo().defaultContent();
		
		driver.findElementByLinkText("Download").click();
		
		
		
		
		
		

	}

}
