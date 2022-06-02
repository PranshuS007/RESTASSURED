package apitesting.sampleproject;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.relevantcodes.extentreports.LogStatus;

public class TestListner implements ITestListener{

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		ExtentReportManager.stratTest(result.getMethod().getMethodName(), result.getMethod().getDescription());
		
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		ExtentReportManager.getTest().log(LogStatus.PASS , "Test Case PASSED", result.getMethod().getMethodName());
		
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		ExtentReportManager.getTest().log(LogStatus.FAIL , "Test Case Failed", result.getMethod().getMethodName());
		
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		ExtentReportManager.getTest().log(LogStatus.SKIP , "Test Case Skipped", result.getMethod().getMethodName());
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		ExtentReportManager.endTest();
		
	}

}
