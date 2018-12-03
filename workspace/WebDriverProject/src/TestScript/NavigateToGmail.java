package TestScript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigateToGmail {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    System.setProperty("webdriver.gecko.driver",
	            "D:/geckodriver-0.23.0/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		// Navigate to URL
		driver.get("http://gmail.com");
		// Maximize the window.
		driver.manage().window().maximize();
		// Enter UserName
		driver.findElement(By.id("Email or Phone")).sendKeys(" ganeshece2001@gmail.com");
		//driver.findElement(By.id("Next")).click();
		// Enter Password
		//driver.findElement(By.id("Enter your password")).sendKeys("ganeshang");
		//driver.findElement(By.id("Next")).click();
		// Wait For Page To Load
		//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}
}
