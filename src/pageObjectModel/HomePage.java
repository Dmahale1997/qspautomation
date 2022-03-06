package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	
	
	
	
	      //declaration
	@FindBy(xpath="//a[.='Logout']") private WebElement logoutLink;
	@FindBy(name="UsersSelector.selectedUser")  private WebElement enterTimeTrackDropdown;
	@FindBy(id="SubmitButton")   private WebElement saveLeaveTimeButton;




        //initialization
public HomePage (WebDriver driver)
{
	PageFactory.initElements(driver, this);
}



              //utilization

public WebElement getLogoutLink()
{
	return logoutLink;
}
public WebElement getEnterTimeDropdown() {
	
    return enterTimeTrackDropdown;
}
public void getSaveLeaveTimeButton() {
	return ;

}
}