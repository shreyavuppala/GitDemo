package Test;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

//ITestListener interface which implements testng interface

public class Listeners implements ITestListener {
    @Override
    public void onTestStart(ITestResult result) {
        //ITestListener.super.onTestStart(result);
    }

    @Override
    public void onTestSuccess(ITestResult result) {
       // ITestListener.super.onTestSuccess(result);
        System.out.println("I successfully executed listeners pass code");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        //ITestListener.super.onTestFailure(result);
        //System.out.println("I failed executed Listerners pass code",+ result.getName());
        System.out.println("I failed executed Listeners pass code: " + result.getName());
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        //ITestListener.super.onTestSkipped(result);
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        //ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
    }

    @Override
    public void onTestFailedWithTimeout(ITestResult result) {
        //ITestListener.super.onTestFailedWithTimeout(result);
    }

    @Override
    public void onStart(ITestContext context) {
        //ITestListener.super.onStart(context);
    }

    @Override
    public void onFinish(ITestContext context) {
        // ITestListener.super.onFinish(context);
    }
}
