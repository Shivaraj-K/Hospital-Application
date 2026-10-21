package driveManager;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InitializeDiver 
{
	public void InitializeWebDriver()
	{
		WebDriver d= new ChromeDriver();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.manage().window().maximize();
		d.get("https://rahulshettyacademy.com/");
		
	}
}
