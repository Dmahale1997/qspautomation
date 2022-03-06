package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	//Declaration
	@FindBy(name="username") private WebElement usn;
	@FindBy(name="pwd") private WebElement psw;
	@FindBy(id="loginButton") private WebElement loginBtn;
	@FindBy(xpath="//img[contains(@src,'timer')]") private WebElement logo;
	@FindBy(id="keepLoggedInCheckBox") private WebElement keepMeLoggedInCheckBox;
	

	
	//initialization
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	
	

	//utilization
	public WebElement getUsn() {
		return usn;
	}
	
	public WebElement getPsw() {
		return psw;
	}
	public WebElement getLoginBtn() {
		return loginBtn;
	}
	public WebElement getLogo() {
		return logo;
	}
	public WebElement getKeepMeLoggedInCheckBox() {
		return keepMeLoggedInCheckBox;
	}
	
	
	

	

	
	
	//generic reusable method
	
	public void ValidLogin ( String validUsername, String validPassword) 
	{
		usn. sendKeys(validUsername);
		psw.sendKeys(validPassword);
		loginBtn.click();
		
	}
	
	
	

	public void invalidLogin ( String invalidUsername, String invalidPassword) 
	{
		usn. sendKeys(invalidUsername);
		psw.sendKeys(invalidPassword);
		loginBtn.click();
		usn.clear();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
