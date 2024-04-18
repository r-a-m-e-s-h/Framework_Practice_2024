package Interview_Questions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class sampleTC_for_reRunfailedTC {
	
	@Test(retryAnalyzer = iretry_Analyzer_tc.class)
	public void test1()
	
	{
		String txt1 = "hello";
		String txt2 = "World";
		
		Assert.assertEquals(txt1, txt2,"This is true");
		
		
	}
	
	@Test
	public void test2()
	{
	
		String txt1 = "hello";
		String txt2 = "World";
		
		Assert.assertEquals(txt1, txt2,"This is true");
		
	}

}
