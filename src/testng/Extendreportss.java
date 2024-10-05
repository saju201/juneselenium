package testng;

import java.io.IOException;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.aventstack.extentreports.util.Assert;

public class Extendreportss {
	WebDriver driver;
	String baseurl="https://www.facebook.com";
	ExtentSparkReporter reporter;
	ExtentTest test;
	ExtentReports extent;
	
	@BeforeTest
	public void beftest()
	{
		//reporter=new ExtentSparkReporter(System.getProperty("user.dir")+"/reports/myreport.html");
		reporter=new ExtentSparkReporter("./reports/myreport1.html");
		reporter.config().setDocumentTitle("Automationreport");
		reporter.config().setReportName("functional test");
		reporter.config().setTheme(Theme.DARK);
		extent=new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("hostname", "localhost");
		extent.setSystemInfo("os", "windows10");
		extent.setSystemInfo("testername", "abc");
		extent.setSystemInfo("Browser Name", "chrome");
		
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void setup() {
		
		driver.get(baseurl);

}

	@Test
	public void fbtitleverification() throws IOException
	{
		
		test=extent.createTest("Fbtitleverification");
		String Exp="facebook";
		String actual=driver.getTitle();
		Assert.assertEqual(Exp, actual);
		System.out.println("hello");
			
	}
		
	
	@Test
	public void fbbuttontest() throws IOException
	{
		test=extent.createTest("Fbbuttontest");
		String buttontext=driver.findElement(By.xpath("//*[@id=\"u_0_b\"]")).getText();
		Assert.assertEquals(buttontext, "register");
		
	}
	
	
	@Test
	public void fblogotest() throws IOException
	{
		test=extent.createTest("Fblogotest");
		boolean b=driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[1]/div/img")).isDisplayed();
		Assert.assertTrue(b);
		
		
