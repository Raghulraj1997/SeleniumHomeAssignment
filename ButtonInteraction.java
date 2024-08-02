package homeAssignmentweek2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonInteraction {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://leafground.com/button.xhtml");
		
        driver.findElement(By.xpath("//span[text()='Click']")).click();
		String a="Dashboard";
		String b=driver.getTitle();
		System.out.println(b);
		if(a==b)
		{ System.out.println("The title is verified");
		}
		else
		{
			System.out.println("The title is incorrect");
		}
		driver.navigate().back();
		boolean button=driver.findElement(By.xpath("//button[@disabled='disabled']")).isEnabled();
		System.out.println("The button is Disabled: "+button);
		WebElement element = driver.findElement(By.xpath("//button[contains(@name,'j_idt88:j_idt94')]"));
		Point find=element.getLocation();
		System.out.println(find);
		WebElement element2 = driver.findElement(By.xpath("//button[contains(@name,'j_idt88:j_idt96')]"));
	    System.out.println(element2.getCssValue("background-color"));
	    WebElement element3 = driver.findElement(By.xpath("//button[contains(@name,'j_idt88:j_idt98')]"));
	    Dimension size=element3.getSize();
	    System.out.println("The size of the button height: "+size.getHeight());
	    System.out.println("The size of the button width: "+size.getWidth());
	    driver.close();
        
		
	}

}
