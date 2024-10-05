package junitpkg;


import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	ChromeDriver driver;
	@Before
	public void setUp()
	{
		
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
	}
	@Test
	public void fb()
	{
		driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
	    driver.findElements(By.id("pass")).sendkeys("1224");
		driver.findElements(By.name("login")).click
	}
}
