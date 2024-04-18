package javaPrograms;

import org.testng.annotations.Test;

public class numberReverser {
	
	@Test
	public void number()
	{
		int given =12345;
		int rev=0;
		
		while(given!=0)
		{
			rev=rev*10;
			rev=rev+given%10;
			given=given/10;
		}
		
		
		System.out.println(rev);
	}

}
