package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_01 {
	 static WebDriver driver;
	
	public void browsersetup(String url)
	{
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
	}
	
	@Test
	public void Tc_FbLogin()
	{
		browsersetup("https://www.fb.com/");
		driver.close();
	}

}
