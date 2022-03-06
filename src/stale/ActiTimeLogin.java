package stale;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeLogin {
    
	public static void main(String [] args) throws InterruptedException {
		System.setProperty("Webdriver.Chrome.driver","./drivers/chromedrivers/exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Timeouts implicitlyWait = driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.get("http://laptop.smc8hiai/logi.do");
		
		WebElement username = driver.findElement(By.name("username"));
		username.sendKeys("admin");
		Thread.sleep(4000);
		username.clear();
		
		
	}
	
}
