package pageObjectModel;

import java.io.IOException;

import KeyWordDrivenFramework.BaseTest;

public class TestActiTimeValidLogin extends BaseTest{

	public static void main(String[] args) throws IOException, InterruptedException {
	}
	BaseTest bt = new BaseTest();
	bt.openBrowser();
	LoginPage lp=new LoginPage (driver);
	lp.sendUsername();
	lp.delayOfTwoSeconds();
	lp.clickOnLoginButton();
	lp.delayOfTwoSeconds();
	bt.closeBrowser();
	
}
