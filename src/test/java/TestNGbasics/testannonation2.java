package TestNGbasics;

import org.testng.annotations.Test;

public class testannonation2 {

	@Test(priority=-2)
public void testC() 
{
	System.out.println("stmt1- from testA -priority= =-2");
	
}
	
	
	//o/p:
//	[RemoteTestNG] detected TestNG version 7.4.0
//	welcome to the world
//	Good evening
//	PASSED: testA
//
//	===============================================
//	    Default test
//	    Tests run: 1, Failures: 0, Skips: 0
//	===============================================
//
//
//	===============================================
//	Default suite
//	Total tests run: 1, Passes: 1, Failures: 0, Skips: 0
//	===============================================
//	
//	
//	

	
//	Test case method 2................
	
	@Test
	public void testD()
	{
		System.out.println("stmt1- from testB -priority=2");
	}
	
	
	
	
	

}
