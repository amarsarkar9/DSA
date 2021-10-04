package newton_school;

import java.util.Scanner;

public class simpleArrang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
		 int a;
		 int b;
		  int n=sc.nextInt();
		  int arr[]=new int[n];
		  int sum=0;
		  for(int j=0;j<n;j++)
		  {
			  arr[j]=sc.nextInt();
		  }
		  for(int j=0;j<n;j++)
		  {
			  a=arr[j];
			  b=arr[a];
			  System.out.print(b+" ");
		  }
		  
	}

}
