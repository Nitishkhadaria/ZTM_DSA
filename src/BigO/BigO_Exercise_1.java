public class BigO_Exercise_1 {

	public static void main(String[] args) {
		int[] input = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println(funChallenge(input));

	}

	public static int funChallenge(int[] input) {
		int a = 10; // O(1)
		a = 50 + 3; // O(1)

		for (int i = 0; i < input.length; i++) { // O(n)
			anotherFunction(); // O(n)
			boolean stranger = true; // O(n)
			a++; // O(n)
		}
		return a; // O(1)
	}

	public static void anotherFunction() {

	}

// Time complexity - 3 + n + n + n + n
// 3 + 4n
// O(3 + 4n)
// O(n)

}
