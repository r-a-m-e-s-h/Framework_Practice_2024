package javaPrograms;

import org.testng.annotations.Test;

public class tryTC {
	
	
	
	@Test(enabled=false)
	public void test()
	{
		String txt ="hello";
		String rev = "";
		char[] ca = txt.toCharArray();
		for(int i=ca.length-1;i>=0;i--)
		{
			rev=rev+ca[i];
		}
		System.out.println(rev);
		
		StringBuffer buffer = new StringBuffer("World");
		System.out.println(buffer.reverse());
		
		StringBuilder builder = new StringBuilder("12345");
		System.out.println(builder.reverse());
		
	}
	@Test(enabled=false)
	public void swap()
	{
		int a=10;
		int b=20;
		int temp;
		
		temp=a;
		a=b;
		temp=b;
		System.out.println("After swap value of A with temp  is : "+a);
		
		a=a-b;
		b=a+b;
		a=b-a;
		System.out.println("After swap value of A without temp  is : "+a);
		
	}
	@Test
	public void test_trainagle()
	{
		
		/*for(int i=0;i<5;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(" * ");
			}
			System.out.println();
		}*/
		
		int number=1;
		
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(number+" ");
				number++;
			}
			System.out.println();
			
		}
		
		
	}

}
