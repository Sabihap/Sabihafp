package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchFlight {
	public static void main(String[] args) {	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://paytm.com");
		driver.findElement(By.xpath("//img[@src='https://assetscdn1.paytm.com/images/catalog/view_item/733296/1626259884425.png']")).click();
		driver.findElement(By.id("from")).click();
		driver.findElement(By.xpath("//img[@class='_3i2Wp']")).click();
		driver.findElement(By.xpath("//input[@class='_1X2Sn']")).sendKeys("PNQ");
		driver.findElement(By.xpath("//div[text()='Pune, Maharashtra, India']")).click();
		driver.findElement(By.id("to")).click();
		driver.findElement(By.xpath("//img[@class='_3i2Wp']")).click();
		driver.findElement(By.xpath("//input[@class='_1X2Sn']")).sendKeys("BOM");
		driver.findElement(By.xpath("//div[text()='Mumbai, Maharashtra, India']")).click();
		driver.findElement(By.id("departureDate")).click();
		driver.findElement(By.xpath("(//div[text()='8'])[2]")).click();
		driver.findElement(By.id("flightSearch")).click();
		//fetch the price of first flight
		WebElement flightprice = driver.findElement(By.xpath("(//span[text()='Air India']/ancestor::div[@class='_5Cbbf'])[1]/descendant::div[@class='_2MkSl']"));
		System.out.println(flightprice.getText());
	
	}
}
