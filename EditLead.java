package homeAssignmentweek2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) {
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
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("TCS");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Raaghull");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("K");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("Raj");
		driver.findElement(By.xpath("//input[@id='createLeadForm_departmentName']")).sendKeys("CSE");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Learning Selenium");
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("selenium@abc.com");
		WebElement element = driver.findElement(By.xpath("//select[@name='generalStateProvinceGeoId']"));
		Select state=new Select(element);
		state.selectByVisibleText("New York");
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		driver.findElement(By.xpath("//textarea[@id='updateLeadForm_description']")).clear();
		driver.findElement(By.xpath("//textarea[@id='updateLeadForm_importantNote']")).sendKeys("Adding data");
		driver.findElement(By.xpath("//input[@value='Update']")).click();
        String title=driver.getTitle();
        System.out.println("the title of the page is: "+title);
        driver.close();	

	}

}
