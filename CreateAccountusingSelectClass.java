package homeAssignmentweek2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountusingSelectClass {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.xpath("//a[contains(text(), 'CRM')]")).click();
		driver.findElement(By.xpath("//a[contains(text(), 'Accounts')]")).click();
		driver.findElement(By.xpath("//a[contains(text(), 'Create')]")).click();
		driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("NewSeleniumLearning Testing");
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Selenium Automation Tester.");
		WebElement element = driver.findElement(By.name("industryEnumId"));
		Select option=new Select(element);
		option.selectByValue("IND_SOFTWARE");
		WebElement element2 = driver.findElement(By.name("ownershipEnumId"));
		Select op=new Select(element2);
		op.selectByVisibleText("S-Corporation");
		WebElement element3 = driver.findElement(By.id("dataSourceId"));
		Select op1=new Select(element3);
		op1.selectByValue("LEAD_EMPLOYEE");
		WebElement element4 = driver.findElement(By.id("marketingCampaignId"));
		Select op2=new Select(element4);
		op2.selectByIndex(5);
		WebElement element5 = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select op3=new Select(element5);
		op3.selectByValue("TX");
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		driver.findElement(By.xpath("//span[contains(text(),'NewSeleniumLearning')]"));
	    driver.close();
		
	}

}
