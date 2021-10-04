package newton_school;

public class rtLtDifferent {
	public static void main(String args[]) {
		int arr[] = { -7, 1, 5, 2, -4, 3, 0 };
		int ans = equalSum(arr);
		System.out.println(ans);
	}

	private static int equalSum(int a[]) {
		int lt = 0;
		int sum = 0;
		for (int i : a) {
			sum += i;

		}

		for (int i = 0; i < a.length; i++) {
			sum -= a[i];
			if (lt == sum) {
				return i;
			}
			lt += a[i];
		}
		return -1;
	}

}
