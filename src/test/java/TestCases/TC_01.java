package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.testng.annotations.Test;

public class TC_01 {
	
	
	public void browsersetup(String url)
	{
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		//WebDriver driver=new ChromeDriver();
		WebDriver driver= new ChromeDriver(new ChromeDriverService.Builder().usingPort(34533).build());
		driver.manage().window().maximize();
		driver.get(url);
	}
	
	@Test
	public void Tc_FbLogin()
	{
		browsersetup("https://www.fb.com/");
	}

}
