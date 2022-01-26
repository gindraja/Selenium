package launchBrowsers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeLaunch {

	static WebDriver driver ;
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe" );
		driver = new ChromeDriver();
		driver.get("http://hyderabadreport.com/");
		driver.findElement(By.linkText("Greater News")).click();
		
		

	}

}
