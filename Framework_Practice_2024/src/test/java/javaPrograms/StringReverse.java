package javaPrograms;

import org.testng.annotations.Test;

public class StringReverse {
	
	@Test
	public void reverse()
	{
		String txt = "world12345";
		char[] c = txt.toCharArray();
		String rev ="";
		
		for(int i=c.length-1;i>=0;i--)
		{
			rev=rev+c[i];
		}
		System.out.println(rev);
		
		System.out.println(txt.length());
		
	}

}
