package com.pa.ma;

public class StarPattern5 {

	public static void main(String[] args) 
	{
		
		int a=1;
		for(int i=1; i<=5; i++) 
		{
			
			for(int k=5; k>=i; k--) 
			{
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) 
			{
				System.out.print(" "+a);
				a++;
			}
			
			//i=i+1;
			//for(int l=5; l<i; l++) 
			//{
				//System.out.print("*");
			//}
			System.out.print("\n");
			
		}
		
	}

}
