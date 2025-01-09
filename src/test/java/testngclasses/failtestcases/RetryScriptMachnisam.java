package testngclasses.failtestcases;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryScriptMachnisam implements IRetryAnalyzer {

    public static int count = 0;
    public static final int RETRY_LIMIT = 3;

    @Override
    public boolean retry(ITestResult iTestResult) {
        if (count < RETRY_LIMIT) {
            count++;
            return true;
        }
        return false;
    }
}
