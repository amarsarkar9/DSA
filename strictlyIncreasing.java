package newton_school;

import java.util.Scanner;

public class strictlyIncreasing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if (a ==0){
			System.out.println("YES");
		}
		else{
			int[] b = new int[a];
			for (int i = 0;i<a;i++){
				b[i] = sc.nextInt();
			}
			int count = 1;
			int j = 2;
			for (int i =1; i<a;i++){

				for ( int l = j; j <= 100000;j++){
					if (b[i] ==0 || b[i] == 1){
						continue;
					}
					if(b[i] < j){
						continue;
					}
					if (b[i] % j == 0){
						count += 1;
						j = j + 1;
						break;
					}
				}
			}
			if (count == a){
				System.out.print("YES");
			}
			else{
				System.out.print("NO");
			}

			}            	
	}
}

