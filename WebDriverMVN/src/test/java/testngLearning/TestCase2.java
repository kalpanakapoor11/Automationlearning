package testngLearning;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase2 {
	@Test(priority=1,groups="low")
	public void validateTitle() {
		String E_title="yahoo.com";
		String A_title="gmail.com";
		
		if(E_title.equals(A_title)) {
			System.out.println("Testcase Passed");
		}else {
			System.out.println("Testcase Failed");
		}
		
		//Assert.assertEquals(E_title, A_title);
		//Assert.assertTrue(false,"element not found on page");
		AssertJUnit.fail("Login not successful");
	}

}
