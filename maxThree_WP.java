package newton_school;

import java.util.Scanner;

public class maxThree_WP {
	public static void main(String args[])
	{
	 int a=1;
    Scanner in = new Scanner (System.in);
    int T = in.nextInt();
    while(a<=T){
        int N = in.nextInt();
        int arr[] = new int[N];
        for(int i =0 ; i< N; i++){
            arr[i]= in.nextInt();
            
        }
        FindMax(arr,N);
        a++;
    }        
}
static void FindMax(int array[], int n)
{
        int max = Integer.MIN_VALUE;
        int mid = Integer.MIN_VALUE;
        int min = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++)
        {
            if (array[i] > max)
            {
                min = mid;
                mid = max;
                max = array[i];
            }
            else if (array[i] > mid)
            {
                 min = mid;
                mid = array[i];
            }
            else if (array[i] > min)
                min = array[i];
        }
        System.out.println( max + " " + mid + " "+ min);

}

}


