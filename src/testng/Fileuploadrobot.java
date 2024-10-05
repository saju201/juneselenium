package testng;

import java.io.IOException;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Transferable;
import java.awt.event.KeyEvent;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Fileuploadrobot<StringSelection> {

	ChromeDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.ilovepdf.com/word_to_pdf");
		
	}
	
	@Test
	public void test1() throws IOException Exception
	{
		driver.findElement(By.xpath("//*[@id=\"pickfiles\"]")).click();
		fileUpload("E:\\Rugma\\CUCUmber.docx");
			
	}

	private void fileUpload(String p) throws AWTException {
		StringSelection strSelection = new StringSelection(p);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents((Transferable) strSelection,null);
		
		
	Robot robot = new Robot();
	
	robot.delay(3000);
	
	robot.keyPress(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_V);
	robot.keyRelease(KeyEvent.VK_V);
	robot.keyRelease(KeyEvent.VK_CONTROL);
	
	robot.keyPress(KeyEvent.VK_ENTER);
	
	robot.keyRelease(KeyEvent.VK_ENTER);
	
	
	}
	
}
