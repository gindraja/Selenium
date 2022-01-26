package launchBrowsers;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class FaceBook {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
	
		driver.get("http://google.com/");
		Thread.sleep(4000);
		List<WebElement>links=driver.findElements(By.tagName("a"));
		System.out.println("Total numer of links in google:"+links.size());
		
		List<WebElement>alllinks=driver.findElements(By.tagName("a"));
		for(WebElement link:alllinks)
		System.out.println(link.getText());
			
			

	}

}
