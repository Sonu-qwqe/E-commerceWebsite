package com.amazon.utility;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.amazon.TestBase.TestBase;

public class Listener extends TestBase implements ITestListener
{

	@Override
	public void onTestStart(ITestResult result) 
	{
		System.out.println("Testcase start ");
	}

	@Override
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("Testcase get success");
	}

	@Override
	public void onTestFailure(ITestResult result) 
	{
		
		try 
		{
			Utility.screenshot(result.getName()+System.currentTimeMillis());
		} 
		catch (IOException e) 
		{
		    System.out.println("fail test case");
			e.printStackTrace();
		}
	
	
	}

	@Override
	public void onTestSkipped(ITestResult result)
	{
		System.out.println("Test case got Skipped");
	}

	
	
}
