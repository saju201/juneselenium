package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rishiherbal {

	ChromeDriver driver;
	@Before
	public void setUp()
	
	{
		driver=new ChromeDriver();
		driver.get("https://Rishiherbalindia.linker.store");
		
	}
	
	@Test
	public void test()
	
	{
	   actualtitle=driver.getTitle();
	}
	
	
}
