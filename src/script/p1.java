package script;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class p1 {
	@Test
	public void actiLoginScript() {
		// sets the path for chromedriver.exe
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		// launches the chrome browser
		WebDriver driver = new ChromeDriver();

		// defines implicitly wait of 30 seconds
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// maximizes the window
		driver.manage().window().maximize();

		// fetches the web application and waits untill it is loaded
		driver.get("https://demo.actitime.com/login.do");

		// identifies username and enters the data
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");

		// identfies password and enters the data
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");

		// identifies login and clicks
		driver.findElement(By.xpath("//a[@id='loginButton']")).click();

		// closes the browser
		driver.close();
	}	
}