package testngLearning;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestCase3 {
	@Test(priority=1,groups="high")
	public void doUserReg() {
		AssertJUnit.fail("User not Reg successfully");
	}
	
	@Test(priority=2,dependsOnMethods="doUserReg",groups="high")
	public void doLogin() {
		System.out.println("Executing Login test");
	}
	@Test(groups="low")
	public void isSkipped() {
	throw new SkipException("skipping the test as the condition is not met");
}

}
