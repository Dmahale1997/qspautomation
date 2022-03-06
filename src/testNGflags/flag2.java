package testNGflags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class flag2 {

@Test(description ="this test case is used tp perform the login action")
  public void login()
  {
	  Reporter.log("login is successful",true);
  }
}
