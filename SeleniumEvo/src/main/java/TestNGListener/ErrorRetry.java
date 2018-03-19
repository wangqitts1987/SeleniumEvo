package TestNGListener;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class ErrorRetry implements IRetryAnalyzer{
	
	private static int maxRetryCount = 2;
    private int retryCount = 1;
	@Override
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		
		if (retryCount <= maxRetryCount) {
            String message = "Running retry for '" + result.getName()
                    + "' on class " + this.getClass().getName() + " Retrying "
                    + retryCount + " times";
            //logger.info(message);
           // Reporter.setCurrentTestResult(result);
            //Reporter.log("RunCount=" + (retryCount + 1));
            retryCount++;
            return true;
        }
        return false;
	}
}
