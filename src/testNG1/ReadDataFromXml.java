package testNG1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ReadDataFromXml {
	WebDriver driver;
	@Parameters("browser")
    @Test
  public void openBrowser(String browserValue){
if(browserValue.equals("chrome"))
	
  {
	  System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  driver.get("https://www.google.com");
	  driver.switchTo().activeElement().sendKeys("chrome browser");
  }
	  
	  else if(browserValue.equals("firefox")){
		  
	  
	  System.setProperty("webdriver.geko.driver", "./drivers/gekodriver.exe");
	  driver = new FirefoxDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  driver.get("https://www.google.com");
	  driver.switchTo().activeElement().sendKeys("chrome browser");
	  
	  
	  
	  
	  }
}
}
