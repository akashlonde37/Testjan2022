package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","E:\\Selinium\\chromedriver.exe\\");
	
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://en-gb.facebook.com/");
			
			driver.findElement(By.xpath("//input[@ id='email']")).sendKeys("9881598693");
			
			driver.findElement(By.xpath("//input[@ id='pass']")).sendKeys("a9881598693");
			
			driver.findElement(By.xpath("//button[@ name='login']")).click();
			
			driver.close();
	}
}
