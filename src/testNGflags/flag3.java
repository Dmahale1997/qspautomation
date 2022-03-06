package testNGflags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class flag3 {
  @Test(invocationCount = 100 )
  public void a() {
	  Reporter.log("generates the inconsistent bug",true);
  }
}
