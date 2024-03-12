package SearchContext;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyntraFindElements {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.myntra.com");
		driver.findElement(By.xpath("//input[@class='desktop-searchBar']")).sendKeys("Kurti",Keys.ENTER);
		List<WebElement> prodName = driver.findElements(By.xpath("//h3[@class='product-brand']"));
		//for each loop
		for(WebElement name:prodName)
		{
			System.out.println(name.getText());
		}	
	}
}
