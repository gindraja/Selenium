package FireFox;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class Testngexcutionpriority {
	WebDriver driver;
	
  @Test(enabled=false)
  public void hyderabadrepoet() {
	  driver.get("http//hyderabadreport.com");
  }

	  @Test(priority=1)
	  public void techlern() {
		  driver.get("http://www.techlearn.com/");
	   
  }

	  @Test(priority=3,enabled=false)
	  public void baalabharathi() {
		  driver.get("http://www.baalabharathi.com/");
	  }

	  @Test(enabled=false)
	  public void gangaaram() {
		  driver.get("http://www.gangaaram-tech.com/");
	  }

	  @Test(priority=4,enabled=false)
	  public void asttrust() {
		  driver.get("http://asttrust.org/");
	  }
	  

	  @Test(priority=2)
	  public void prakampanam() {
		  driver.get("http://www.prakampanam.com/");
	  }
	    
	  
	   
	   
  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

}
