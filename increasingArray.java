package newton_school;

public class increasingArray {
	
	public static void main(String[] args)
	{

		int[] arr = { 1,3,8,4 };
		int n = arr.length;
 
		if (check(arr, n))
			System.out.print("Yes");
		else
			System.out.print("No");
	}

		// Function that returns true if arr[]
		// can be made strictly increasing after
		// modifying at most one element
		static boolean check(int arr[], int n)
		{
			// To store the number of modifications
			// required to make the array
			// strictly increasing
			int modify = 0;

			// Check whether the first element needs
			// to be modify or not
			if (arr[0] > arr[1]) {
				arr[0] = arr[1] / 2;
				modify++;
			}

			// Loop from 2nd element to the 2nd last element
			for (int i = 1; i < n - 1; i++) {

				// Check whether arr[i] needs to be modified
				if ((arr[i - 1] < arr[i] && arr[i + 1] < arr[i])
					|| (arr[i - 1] > arr[i] && arr[i + 1] > arr[i])) {

					// Modifying arr[i]
					arr[i] = (arr[i - 1] + arr[i + 1]) / 2;

					// Check if arr[i] is equal to any of
					// arr[i-1] or arr[i+1]
					if (arr[i] == arr[i - 1] || arr[i] == arr[i + 1])
						return false;

					modify++;
				}
			}

			// Check whether the last element needs
			// to be modify or not
			if (arr[n - 1] < arr[n - 2])
				modify++;

			// If more than 1 modification is required
			if (modify > 1)
				return false;

			return true;
		}

		// Driver code
		
	}


