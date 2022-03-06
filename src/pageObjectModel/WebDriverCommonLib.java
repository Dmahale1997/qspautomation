package pageObjectModel;

import org.openqa.selenium.interactions.Actions;

public class WebDriverCommonLib extends BaseTest{
	
//getthetitlewebpage
	public String getTheTitleOfTHeWebPage {
	
		String title =driver.getTitle();
		return title;
		
}

     public void verifyThePageTitleOfWebPage(String expectedTitle)
     {
    	 String title = driver.getTitle();
    	 if(expectedTitle.equals("actualTitle"))
    	 {
    		 System.out.println("title is verified")
    	 }
    	 else
    	 {
    		 System.out.println("title is not verified");
    	 }
     }
     
     //mousehover
     public void mouseHoverAction(WebElement target)
     {
    	 Actions act = new Actions(driver);
    	 act.moveToElement(target).perform();
    	 
     }
     
     
     
     
     //rightclick
     public void DoubleClick(WebElement target)
     