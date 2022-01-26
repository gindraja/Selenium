package FireFox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class firefoxbrowser {

	static WebDriver driver;
	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver", "E:\\Selenium//chromedriver.exe");
		driver = new ChromeDriver();
		
	}

}
