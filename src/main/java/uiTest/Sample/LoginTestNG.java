package uiTest.Sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTestNG {
	@Test
	public void setupTestNG()
	{
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/V4/");
		driver.manage().window().maximize();
		driver.close();
	}
}
