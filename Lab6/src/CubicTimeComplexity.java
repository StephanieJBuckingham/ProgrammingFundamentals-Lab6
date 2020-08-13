/* Write the simplest Java method that would 
 * have 𝑂(𝑁^3) time complexity, where 𝑁 is the
 *  single input parameter to the method.  */

public class CubicTimeComplexity {

	public static void main(String[] args) {

		// run method cubic complexity with input n
		cubicComplexity(2);
	}

// method that has cubic time complexity
	static void cubicComplexity(int n) {

		// triple nested loop that prints stars
		for (int x = 0; x < n; x++) {
			for (int y = 0; y < n; y++) {
				for (int z = 0; z < n; z++)
					System.out.print("*");
			}
		}
	}
}