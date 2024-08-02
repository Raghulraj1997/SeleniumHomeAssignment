package homeAssignmentweek2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class InteractionswithCheckbox {

	public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.manage().window().maximize();
	driver.get("https://leafground.com/checkbox.xhtml");
	driver.findElement(By.xpath("//span[contains(text(),'Basic')]")).click();
	driver.findElement(By.xpath("//span[contains(text(),'Ajax')]")).click();
	driver.findElement(By.xpath("//span[contains(text(),'Checked')]")).isDisplayed();
	driver.findElement(By.xpath("//label[@for='j_idt87:basic:0']")).click();
	driver.findElement(By.xpath("//label[@for='j_idt87:basic:2']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//div/input[@name='j_idt87:ajaxTriState_input']/following::div[1]")).click();
	driver.findElement(By.xpath("//span[contains(text(),'State has been changed.')]")).isDisplayed();
	driver.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']")).click();
	boolean equalsdriver=driver.findElement(By.xpath("//span[text()='Disabled']/preceding-sibling::div[2]")).isSelected();
	System.out.println(equalsdriver);
    driver.findElement(By.xpath("//ul[@data-label='Cities']")).click();
    driver.findElement(By.xpath("//li[@data-item-value='London']/label")).click();
	driver.close();
	}

}
