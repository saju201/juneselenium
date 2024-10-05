package junitpkg;

import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazaon {
	

	ChromeDriver driver;
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.Amazon.in");
		
		driver.findElement(By.xpath('//input[@id="twoabsearchtextbox"]')).senkeys('mobiles',key.RETURN);
		driver.wait(until.elementLocated(By.xpath('//span[contains(@class,"a-size-medium")]')),10000);
		driver.findElement(By.ByXPath('//a[@id="nav-cart"]')).click();
		driver.wait(until.elementLocated(By.xpath('//h1[contains(@class, "a-spacing-mini")]')), 10000);
		driver.findElement(By.xpath('//a[text()="Today\'s Deals"]')).click();
		driver.wait(until.elementLocated(By.xpath('//div[contains(@class, "a-section")]')), 10000)
		driver.findElement(By.xpath('//a[@id="nav-link-accountList"]')).click();
		driver.navigate().back();
		driver.findElement(By.xpath('//a[@id="nav-hamburger-menu"]')).click();
	}
	 {
		await driver.quit();
	}


	
	

}
