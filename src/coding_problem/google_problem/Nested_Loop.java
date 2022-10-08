public class Nested_Loop {

	public static void main(String[] args) {
		// int[] input = new int[] { 1, 2, 4, 9 };
        int[] input = new int[] { 1, 2, 3, 4, 4 };
        int sum = 8 ;
		boolean result = hasPairwithSum(input, sum);
		System.out.println(result);

	}

	public static boolean hasPairwithSum(int[] array, int sum) {
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 1; j < array.length - 1; j++) {
				if (array[i] + array[j] == sum) {
					return true;
				}
			}
		}
		return false;
	}
//Time complexity - O(n^2) 
}
