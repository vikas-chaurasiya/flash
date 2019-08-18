package com.pa.ma;

public class StarPattern6 {

	public static void main(String[] args) 
	{
		
		int n=5;
		int p=n;
		int q=n;
		for(int i=1;i<=n;i++) 
		{
			for(int j=1;j<n*2;j++) 
			{
				if(j>=p && j<=q) 
				{
					System.out.print("*");
				}
				else 
				{
					System.out.print(" ");
				}
				
			}
			p--;
			q++;
			System.out.println();
		}
		
	}

}
