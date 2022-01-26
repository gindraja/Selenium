package FireFox;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TestngTimeOut {
	WebDriver driver;
	
  
	@Test(timeOut=11000)
	  public void prakampanam() {
		  driver.get("http//prakampanam.com/");
	  }
	  
	@Test
	  public void hyderabadreport() {
		  driver.get("http//hyderabadretport.com/");
	  }
	  
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "E:\\Selenium//chromedriver.exe");
		driver = new ChromeDriver();
  }

  @AfterTest
  public void afterTest() {
  }

}
