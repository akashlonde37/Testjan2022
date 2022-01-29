package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Example1 
{
	@Test
	public void tc1()
	{
		//System.out.println("Running tc1");
		Reporter.log("akash londe",true);
		Reporter.log("akhil khonde",true);
	}
}
