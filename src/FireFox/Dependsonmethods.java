package FireFox;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Dependsonmethods {
	WebDriver driver;
	
  @Test(dependsOnMethods= {"method2"})
  public void method1() {
	  driver.findElement(By.name("q")).sendKeys("seleniumtool.com");
	 System.out.println("this is method2");
  }
  
  @Test
  public void method2() throws InterruptedException {
	  driver.get("http://www.google.com");
	  System.out.println("this is method2");
	  Thread.sleep(3000);
  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "E:\\Selenium//chromedriver.exe");
	  driver=new ChromeDriver();
  }

  @AfterTest
  public void afterTest() {
  }

}
