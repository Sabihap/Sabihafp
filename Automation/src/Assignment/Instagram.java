package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {

	public static void main(String[] args) {
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 driver.get("https://www.instagram.com");
		 String source = driver.getPageSource();
		 System.out.println(source);
//		 driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Sabiha");
//		 driver.findElement(By.xpath("//input[@name='password']")).sendKeys("12345678");
//		 driver.findElement(By.xpath("//button[@class=' _acan _acap _acas _aj1- _ap30']")).click();
//		 driver.close();
	}
}
