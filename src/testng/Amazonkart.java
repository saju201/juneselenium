package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Amazonkart {
	
	WebDriver driver;
	ChromeDriver d;
	
	
	@BeforeTest
	public void beforeTest() {
		
		d=new ChromeDriver();
		
	}
	
	@Test
	public void test() {
		
		d.get("https://www.amazon.in/");
		String parentWindow = d,getWindowHandle
	}
	
	

}
