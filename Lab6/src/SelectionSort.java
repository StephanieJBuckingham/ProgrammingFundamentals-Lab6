import java.util.Arrays;

public class SelectionSort {

	// create method to sort array
	void sort(int arr[]) {

		// initialize n to array length
		int n = arr.length;

		// step by step move boundary of unsorted subarray
		for (int i = 0; i < n - 1; i++) {

			// find the minimum element in unsorted array
			int min_idx = i;
			for (int j = i + 1; j < n; j++)
				if (arr[j] < arr[min_idx])
					min_idx = j;

			// swap the minimum element with the first element
			int temp = arr[min_idx];
			arr[min_idx] = arr[i];
			arr[i] = temp;

			// print steps of process
			System.out.println("Step " + (i + 1) + ": " + "Move " + arr[i] + " to index " + i);
			System.out.println(Arrays.toString(arr));

		}
	}

	// prints the array
	void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	// driver code to test
	public static void main(String args[]) {
		SelectionSort ob = new SelectionSort();
		int arr[] = { 1, 29, 14, 15, 94 };
		ob.sort(arr);
		System.out.println("Result = Selection Sorted Array ");
		ob.printArray(arr);
	}
}
