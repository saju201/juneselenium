package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	ChromeDriver driver;
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?formName=user_details");
	}
	
	@Test
	public void test()
	{
		WebElement dayelement=driver.findElement(By.xpath("//select[contains(@name,'DOB_Day')]"));
		Select day=new Select(dayelement);
		day.selectByValue("03");
		
		WebElement monthlement=driver.findElement(By.xpath("//select[contains(@name,'DOB_Month')]"));
		Select month=new Select(monthlement);
		month.selectByVisibleText("JUN");
		
				
	}
}
