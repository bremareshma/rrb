package week1Day2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnSelectClass {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");		
		ChromeDriver driver = new ChromeDriver();		
		driver.get("http://leaftaps.com");		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();	
		driver.findElementById("username").sendKeys("DemoSalesManager",Keys.TAB);
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();			
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Create Lead").click();
		
		WebElement src = driver.findElementById("createLeadForm_dataSourceId");
		
		Select dd = new Select(src);
		List<WebElement> allOptions = dd.getOptions();
		int countOpt = allOptions.size();
		System.out.println(countOpt);
		
		for (WebElement eachOption : allOptions) {
			System.out.println(eachOption.getText());			
		}
		
		
		
		
/*		
		dd.selectByIndex(countOpt-1);
		
		
		WebElement mar = driver.findElementById("createLeadForm_marketingCampaignId");
		
		Select dd1 =  new Select(mar);
		dd1.selectByVisibleText("Car and Driver");
		
		Thread.sleep(2000);
		
		dd1.selectByValue("CATRQ_AUTOMOBILE");
*/
		
		
		
		
		
		
		
	}

}











