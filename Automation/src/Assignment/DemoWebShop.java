package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebShop {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com");
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		driver.findElement(By.id("Email")).sendKeys("sabihafp6@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Sabiha@1234");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		driver.findElement(By.linkText("Books")).click();
		//driver.findElement(By.xpath("//ul[@class='top-menu']/descendant::a[contains(text(),'Books')]")).click();
		driver.findElement(By.xpath("//a[text()='Computing and Internet']/ancestor::div[@class='details']/descendant::input[@value='Add to cart']")).click();
		driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
		driver.findElement(By.name("removefromcart")).click();	
		driver.findElement(By.name("termsofservice")).click();
		driver.findElement(By.id("checkout")).click();
		driver.findElement(By.xpath("//input[@data-val-required='Street address is required']")).sendKeys("A1 Khanekar wasti, Hinjewadi");
		driver.findElement(By.xpath("//input[@onclick='Billing.save()']")).click();
		
	}
}
