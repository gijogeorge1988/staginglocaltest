package fordemo.Stagingtitlecheck;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Check_title {
	
	public WebDriver driver;
	@BeforeTest
	public void load()
	{
		//ChromeOptions options = new ChromeOptions();
		//options.addArguments("--headless");
		driver = new ChromeDriver();
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Qbuser\\git\\repository\\Stagingtitlecheck\\chromedriver.exe");
	    
		
	}
	
	@Test
	public void check()
	{
		driver.get("http://15.206.147.106/");
		String str=driver.getTitle();
		Assert.assertEquals(str,"Test Website for demo");
		System.out.println(str);
		
	}
	   

}
