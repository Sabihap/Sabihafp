package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithisEnabled {
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		WebElement TextField1 = driver.findElement(By.xpath("//input[@name='name']"));
		System.out.println(TextField1.isEnabled());
		WebElement TextField2 = driver.findElement(By.xpath("//input[@name='email']"));
		System.out.println(TextField2.isEnabled());
		WebElement TextField3 = driver.findElement(By.xpath("//input[@name='password']"));
		System.out.println(TextField3.isEnabled());
	}
}
