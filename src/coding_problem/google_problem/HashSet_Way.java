// if given array is not sorted or sorted -> In both case it will work
import java.util.HashSet;

public class HashSet_Way {
	public static void main(String[] args) {
		int[] input = new int[] { 1, 2, 4, 9 };
		boolean result = hasPairwithSum(input, 8);
		System.out.println(result);

	}

	private static boolean hasPairwithSum(int[] input, int sum) {
		HashSet<Integer> setDs = new HashSet<>();
		for (int i : input) {
			int com = sum - i;
			if (setDs.contains(com)) {
				return true;
			} else {
				setDs.add(com);
			}
		}
		return false;
	}
//Time Complexity - O(n)
}
