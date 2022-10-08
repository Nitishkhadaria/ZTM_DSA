// If given array is sorted
public class Linear_way {

	public static void main(String[] args) {
		int[] input = new int[] { 1, 2, 4, 4 };
		boolean result = hasPairwithSum(input, 8);
		System.out.println(result);

	}

	public static boolean hasPairwithSum(int[] array, int sum) {

		int lowIndex = 0;
		int highIndex = array.length - 1;

		while (lowIndex < highIndex) {
			if(array[lowIndex]+array[highIndex] == sum) {
				return true;
			}else if(array[lowIndex]+array[highIndex] > sum) {
				highIndex--;
			}else if(array[lowIndex]+array[highIndex] < sum) {
				lowIndex++;
			}
		}
		return false;
	}
//Time Complexity - O(n)
}
