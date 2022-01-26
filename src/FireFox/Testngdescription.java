package FireFox;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Testngdescription {
	WebDriver driver;
	
  @Test(description="lunches the prakampanam.com Website")
  public void prakampANAM() {
	 driver.get("http//praaakampanam.com/");
  }
  @BeforeTest
  public void beforeTest() {

		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver ();
  }

  @AfterTest
  public void afterTest() {
  }

}
