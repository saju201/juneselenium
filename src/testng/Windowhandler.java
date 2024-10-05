package testng;

import java.util.Set;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Windowhandler {
	
	WebDriver driver;
	
	ChromeDriver Driver;
	ChromeDriver d;
	
	
	
	@BeforeTest
	public void beforeTest() {
		
		  d = new ChromeDriver();
	}
	@Test
	public void test() {
		
		d.get("http://demo.guru99.com/popup.php");
		
		String parentWindow = d.getWindowHandle(); //currentwindow
		
		System.out.println("Parent Window Title" + d.getTitle());
		d.findElement(By.xpath("/html/body/p/a")).click(); //click here
		
		Set<String> allWindowHandles = d.getWindowHandles();
		
		for(String handle : allWindowHandles) {
			
			if (!handle.equalsIgnoreCase(parentWindow)) {
				d.switchTo().window(handle);
				d.findElement(By.xpath("/html/body/form/table/tbody/tr[5/td[2]/input")).sendKeys("anbc@gmail.com");
				d.close();
				
}
		}
	}
              d.switchTo().window(parentWindow);
