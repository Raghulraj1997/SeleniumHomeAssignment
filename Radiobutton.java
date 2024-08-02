package homeAssignmentweek2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobutton {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/radio.xhtml");
		driver.findElement(By.xpath("//table[contains(@id,'console1')]//label[text()='Chrome']")).click();
		WebElement city=driver.findElement(By.xpath("//label[text()='Chennai']"));
		city.click();
		Thread.sleep(5000);
		if(city.isSelected()==true)
		{
			System.out.println("The city selected as Chennai");
		}
		city.click();
		if(city.isSelected()==false)
		{
			System.out.println("The city is Unselected");
		}
		WebElement browser = driver.findElement(By.xpath("//label[contains(@for,'j_idt87:console2:2')]"));
		browser.isSelected();
		System.out.println("The selected browser is: "+browser.getText());
	    WebElement element = driver.findElement(By.xpath("//label[contains(@for,'j_idt87:age:1')]"));
	    if(element.isEnabled())
	    {
	    	System.out.println("Checkbox already selected");
	    }
	    else
	    	System.out.println("Checkbox not selected");
		driver.close();
	}

}
