package javaPrograms;

import org.testng.annotations.Test;

public class swap2Number {
	
	@Test(enabled=false)
	public void swapWithTemp()
	{
		
		int a = 10;
		int b=20;
		int temp=0;
		
		System.out.println(" before swap : "+a);
		
		temp=a;
		a=b;
		temp=b;
		
		System.out.println(" after swap : "  +a);
		
		
	}
	
	@Test
	public void swapWithOutTemp()
	{
		int a = 10;
		int b=20;
		
		System.out.println(" before swap : "+a);
		
		a = a-b;
		b=a+b;
		a=b-a;
		
		System.out.println(" after swap : "  +a);
		
	}

}
