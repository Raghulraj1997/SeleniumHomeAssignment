package homeAssignmentweek2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount{

	public static void main(String[] args)  {
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
	driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("NewSeleniumLearning");
	driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Selenium Automation Tester.");
	driver.findElement(By.id("numberEmployees")).sendKeys("15");
	driver.findElement(By.name("officeSiteName")).sendKeys("LeafTaps");
	WebElement element = driver.findElement(By.name("industryEnumId"));
	Select option=new Select(element);
	option.selectByVisibleText("Media");
	driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
	String title = driver.getTitle();
	if(title.contains("Account Details | opentaps CRM"))
	{
		System.out.println("Proper Title is dispalyed");
	}
	else {
		System.out.println("Incorrect Title");
	}
	driver.close();

	}

}
