package homeAssignmentweek2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectclassusingSelenium {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		driver.findElement(By.name("firstname")).sendKeys("Learning");
		driver.findElement(By.name("lastname")).sendKeys("Selenium");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("8877445566");
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("Learing@123");
		WebElement element = driver.findElement(By.xpath("//select[@id='day']"));
	    Select option=new Select(element);
	    option.selectByValue("10");
	    WebElement element1 = driver.findElement(By.xpath("//select[@id='month']"));
	    Select option1=new Select(element1);
	    option1.selectByVisibleText("Aug");
	    WebElement element2 = driver.findElement(By.xpath("//select[@id='year']"));
	    Select option2=new Select(element2);
	    option2.selectByValue("2002");
	    driver.findElement(By.xpath("//label[text()='Male']")).click();
	
	}

}
