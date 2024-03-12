package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaukariLogin {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://naukri.com");
		driver.findElement(By.id("register_Layer")).click();
		driver.findElement(By.id("name")).sendKeys("Abcdef");
		driver.findElement(By.name("email")).sendKeys("xyx@123gmail.com");
		driver.findElement(By.id("password")).sendKeys("12345678");
		driver.findElement(By.id("mobile")).sendKeys("9876543210");
		driver.findElement(By.xpath("(//div[@class='textWrap'])[2]")).click();
		driver.findElement(By.xpath("//span[text()='Pune']")).click();
		driver.findElement(By.xpath("//i[@class='ico resman-icon resman-icon-check-box']")).click();
		driver.findElement(By.xpath("//button[text()='Register now']")).click();
	}
}
