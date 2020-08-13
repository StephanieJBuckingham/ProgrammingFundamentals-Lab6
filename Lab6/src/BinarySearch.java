class BinarySearch {

	int binarySearch(int arr[], int l, int r, int x) {
		
		// initialize counter for iteration
		int count = 1;
		
		while (r >= l) {
			// identify middle element
			int mid = l + (r - l) / 2;

			// print out middle element in each iteration
			System.out.println("Step " + count++ + " number " + arr[mid] + " is the middle.");

			// print out left and right bonds
			System.out.println("The left bonds is " + l + " and the right bonds is " + r);
			System.out.println();

			// if the element is present at the middle
			if (arr[mid] == x)
				return mid;

			// if element is smaller than mid, then it is in left subarray
			if (arr[mid] > x)
				return binarySearch(arr, l, mid - 1, x);

			// else the element is present in right subarray
			return binarySearch(arr, mid + 1, r, x);
		}

		// if element is not in array
		return -1;
	}

	// driver method to test above
	public static void main(String args[]) {
		BinarySearch ob = new BinarySearch();
		int arr[] = { 1, 14, 15, 24, 55, 59, 73, 90, 94, 99 };
		int n = arr.length;
		int x = 73;
		int result = ob.binarySearch(arr, 0, n - 1, x);
		if (result == -1)
			System.out.println("Element not present");
		else
			System.out.println("Element found at index " + result);
	}

}
