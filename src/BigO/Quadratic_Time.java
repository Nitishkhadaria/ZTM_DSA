 //Log all pairs of array
public class Quadratic_Time {

	public static void main(String[] args) {
		char[] input = new char[] { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i' };

		for (int i = 0; i < input.length; i++) {
			for (int j = 0; j < input.length; j++) {
				System.out.println("(" + input[i] +","+ input[j] + ")");
			}
		}

	}
//Time complexity - O(n^2)
}
