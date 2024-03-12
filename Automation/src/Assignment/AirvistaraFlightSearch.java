package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AirvistaraFlightSearch {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.airvistara.com");
		driver.findElement(By.name("flightSearchFrom")).sendKeys("Pune");
		driver.findElement(By.name("flightSearchTo")).sendKeys("Delhi");
		driver.findElement(By.id("departCalendar")).click();
		driver.findElement(By.xpath("//div[@monthname='Mar']")).click();
		driver.findElement(By.xpath("//a[text()='6']")).click();
		driver.findElement(By.id("return-radio")).click();
		driver.findElement(By.xpath("//div[@monthname='Mar']")).click();
		driver.findElement(By.xpath("//a[text()='8']")).click();
		driver.findElement(By.id("book-flight-widget")).click();
	
	}
}
