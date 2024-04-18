package javaPrograms;

import org.testng.annotations.Test;

public class star_triangle {
	
	
	@Test(enabled=false)
	public void StarPrint_test()
	{
		
		
		for(int i=1;i<6;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	@Test
	public void print_number()
	{
		int number=1;
		
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(number+" ");
				number=number+1;
			}
			
			System.out.println();
		}
	}

}
