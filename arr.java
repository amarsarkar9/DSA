package newton_school;

import java.util.Scanner;

public class arr {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("enter no. ");
		int n=sc.nextInt();
		//int a[]=new a[n];
		int a[]= {5,6,6,3,5,2};
		int even=0;
		int odd=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				System.out.println(a[i]);
				even++;
			}
			else
			{
				System.out.println(a[i]);
				odd++;
			}
		}
		System.out.println();
				
	}

}
