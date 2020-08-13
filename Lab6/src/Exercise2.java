
public class Exercise2 {

	public static int main(String[] args) {

		return result(45, 678);
	}

	private static int result(int foo, int N) {

		int result = 0;
		for (int i = 0; i < N; i++)
			result++;
		for (int j = 0; j < 1000000; j++)
			result += j;

		return result;
	}
}
