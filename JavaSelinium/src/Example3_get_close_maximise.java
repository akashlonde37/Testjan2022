import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example3_get_close_maximise
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Selinium\\chromedriver.exe");
	
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.google.com/maps/@20.9457016,77.756641,14z");
			
			driver.manage().window().maximize();
			
			driver.close();
			
	}
}
