package newton_school;

import java.util.Scanner;

public class zeros {

	public static void main (String[] args)
		{
			Scanner sc=new Scanner(System.in);
			int T=sc.nextInt();
			int a=1;
			while(a<=T)
			{
		int	n=sc.nextInt();
			int arr[]=new int[n];
			System.out.println("enter no of array u want to take");
			for(int i=0;i<n;i++)
			{
				arr[i]=sc.nextInt();
			}
			pushZerosToEnd(arr, n);
				a++;
			}
		}

	// pushZerosToEnd(arr, n);
	// System.out.println("Array after pushing zeros to the back: ");
//			for (int i=0; i<n; i++)
//				System.out.print(arr[i]+" ");
	// }
	static void pushZerosToEnd(int arr[], int n) {
		int count = 0;
		for (int i = 0; i < n; i++)
			if (arr[i] != 0)
				arr[count++] = arr[i];
		while (count < n) {
			arr[count++] = 0;
		}
		for (int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
		// }
	}
}

