package newton_school;

import java.util.Scanner;

public class maxSum {
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		  int n=sc.nextInt();
		  int arr[]=new int[n];
		  int sum=0;
		  for(int j=0;j<n;j++)
		  {
			  arr[j]=sc.nextInt();
		  }
		  for(int i=0;i<n;i++)
		  {
			  if(arr[i]>0)
				  sum+=arr[i];
		  }
		  System.out.print(sum);
	}

}
