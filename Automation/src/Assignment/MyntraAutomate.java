package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyntraAutomate {
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.myntra.com");
		driver.findElement(By.xpath("//input[@class='desktop-searchBar']")).sendKeys("jeans",Keys.ENTER);
		
		driver.findElement(By.xpath("//label[text()='Flying Machine']")).click();
		driver.findElement(By.xpath("//label[text()='Rs. 237 to Rs. 8928']")).click();
		
		driver.findElement(By.xpath("//label[text()='Black']")).click();
		
	}
}
