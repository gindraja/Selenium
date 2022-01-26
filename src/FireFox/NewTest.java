package FireFox;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class NewTest {
	WebDriver driver;
  @Test
  public void prakampanam() {
	  driver.get("http://prakampanam.com/");
  }
	  @Test
	  public void techlern() {
		  driver.get("http://www.techlearn.com/");
	   
	  }
	  

	  @Test
	  public void enrichinterior() {
		  driver.get("http://www.enrichinterior.com/");
	  }

	  @Test
	  public void baalabharathi() {
		  driver.get("http://baalabharathi.com/");
	  }

	  @Test
	  public void asttrust () {
		  driver.get("http://asttrust.com/");
	  }

	  @Test
	  public void tstelugunews() {
		  driver.get("http://tstelugunews.com/");
	  }

	  @Test
	  public void hyderabadreport() {
		  driver.get("http://hyderabadreport.com/");
	  }
	   
	   
	   
	   
	     
  
  @BeforeTest
  public void beforeTest() {
	  
	  
	  
	  
	  System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
	  driver = new ChromeDriver ();
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
  }

}
