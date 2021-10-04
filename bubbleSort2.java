package newton_school;

import java.util.Scanner;

public class bubbleSort2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
			
			int N=sc.nextInt();
			int arr[]=new int[N];
			for(int i=0;i<N;i++)
			{
				arr[i]=sc.nextInt();
			}
			for(int j=0;j<N;j++)
			{
				for(int k=0;k<N-j-1;k++)
				{
					if(arr[k]<arr[k+1])
					{
						int temp=arr[k];
						arr[k]=arr[k+1];
						arr[k+1]=temp;
					}
				}
			}
			for(int i=0;i<N;i++)
			{
				System.out.println(arr[i]);
			}
		}
	}


