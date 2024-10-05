package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	
	ChromeDriver driver;
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.Amazon.in");
	}
	@Test
	public void test()
	{
		WebElement searchfield=driver.findElement(By.id("twotabsearchtextbox"));
		searchfield.sendKeys("mobiles",Keys.ENTER);
	WebElement cartIcon=driver.findElement(By.linkText("Today's Deals"));
	menu.click();
	}

}