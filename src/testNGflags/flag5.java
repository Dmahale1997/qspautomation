package testNGflags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class flag5 {
  @Test()
  public void signin() {
	  int i=0;
	  int result = 9/i;
	  Reporter.log("login feature",true);
  }
  
  @Test(dependsOnMethods = "signin",alwaysRun = true)
  public void logout() {
	  Reporter.log("logout feature",true);
  }
}
  
