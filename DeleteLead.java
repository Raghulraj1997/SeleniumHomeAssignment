package homeAssignmentweek2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.xpath("//a[contains(text(), 'CRM')]")).click();
		driver.findElement(By.partialLinkText("Leads")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Find Leads')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Phone')]")).click();
		driver.findElement(By.xpath("//input[@name='phoneCountryCode']")).clear();
		driver.findElement(By.xpath("//input[@name='phoneCountryCode']")).sendKeys("8");
		driver.findElement(By.xpath("//button[contains(text(),'Find')]")).click();
	    Thread.sleep(5000);
		WebElement leadid=driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
		String check=leadid.getText();
		System.out.println("First element:"+check);
		Thread.sleep(5000);
		leadid.click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@class='subMenuButtonDangerous']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Find Leads')]")).click();
		driver.findElement(By.xpath("//span[text()='Name and ID']")).click();
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(check);
		driver.findElement(By.xpath("//button[contains(text(),'Find')]")).click();
		driver.findElement(By.xpath("//div[contains(text(),'No records to display')]")).isDisplayed();
		driver.close();
		
	}

}
