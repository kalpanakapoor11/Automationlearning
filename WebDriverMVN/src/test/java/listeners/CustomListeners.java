package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class CustomListeners implements ITestListener {

	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult result) {
		Reporter.log("<a target=\"_blank\" href=\"/home/kukks/Selenium Learning/Screenshots/error.jpg\">Capture screenshot<a/>");
		Reporter.log("<a target=\"_blank\" href=\"/home/kukks/Selenium Learning/Screenshots/error.jpg\"><img src=\"/home/kukks/Selenium Learning/Screenshots/error.jpg\"height=200 width=200</img><a/>");
		System.out.println("Capture screenshot");
		
	}

	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSuccess(ITestResult arg0) {
		System.out.println("Test is successful");
		
	}

}
