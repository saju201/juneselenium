package junitpkg;



import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junitdemo {
	ChromeDriver driver;
	@BeforeClass
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
	}
	
	@Test
	public void titleverification()
	{
		String actualtitle=driver.getTitle();
		String exptitle="Google";
		if(actualtitle.equals(exptitle))
		{
			System.out.println("pass");
	
		}
		else 
		{
			System.out.println("fail");
		}
	}
	@Test
	public void textVerifcation()
	{
		String src=driver.getPageSource();
		if(src.contains("images"))

	{
		System.out.println("text is present");
	}
		else
		{
			System.out.println("text missing");
		}
	
}
}
