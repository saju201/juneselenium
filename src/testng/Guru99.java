package testng;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class Guru99 {
	
	WebDriver driver;
	
	@Parameters("browser")
	@BeforeTest
	public void setUp(String browser)
	{
		
	}
	

}
