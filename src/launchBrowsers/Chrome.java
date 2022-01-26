package launchBrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class Chrome {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.manage().window().minimize();
		Thread.sleep(5000);
		driver.close();
		
		
	}

}
