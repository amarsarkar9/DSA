package newton_school;

import java.util.Scanner;

public class selectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int a = 1;
		while (a <= T) {
			int N = sc.nextInt();
			int arr[] = new int[N];
			for (int i = 0; i < N; i++) {
				arr[i] = sc.nextInt();
			}
			for (int j = 0; j < N; j++) {
				int min = j;
				for (int k = j+1; k < N; k++) {
					if (arr[k] < arr[min]) {
						min = k;
					}
				}
				if (arr[min] != arr[j]) {
					int temp = arr[j];
					arr[j] = arr[min];
					arr[min] = temp;
				
				}
			}
			for (int i = 0; i < N; i++) {
				System.out.print(arr[i] + " ");
			}
			a++;
			System.out.println();
		}
		

	}
}
