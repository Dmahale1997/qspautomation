package javaScriptExecutorI;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.chrome.ChromeDriver;


public class ScrollRight {


	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Timeouts implicitlyWait = driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.get("https://dashboards.handmadeinteractive.com/jasonlove/");
		Thread.sleep(4000);
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		//scroll right
		jse.executeScript("window.scrollBy(5000,0)");
	}
}