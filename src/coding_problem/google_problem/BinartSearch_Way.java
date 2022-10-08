// If given array is sorted
public class BinartSearch_Way {
	
	public static void main(String[] args) {
		int[] input = new int[] { 1, 2, 4, 4 };
		boolean result = hasPairwithSum(input, 8);
		System.out.println(result);
	}

	public static boolean hasPairwithSum(int[] array, int sum) {
		int lowIndex = 0;
		int highIndex = array.length - 1;
		boolean result = false;

		while (lowIndex < highIndex) {
			int target = sum - array[lowIndex];
			lowIndex++;
			result = binarySearch(array, lowIndex, highIndex, target);
		}
		return result;
	}

	public static boolean binarySearch(int[] array, int leftIndex, int rigntIndex, int target) {
		if (leftIndex > rigntIndex) {
			return false;
		}
		int mid = leftIndex + (rigntIndex - leftIndex) / 2;
		if (array[mid] == target) {
			return true;
		} else if (array[mid] > target) {
			rigntIndex = mid - 1;
			binarySearch(array, leftIndex, rigntIndex, target);
		} else if (array[mid] < target) {
			leftIndex = mid + 1;
			binarySearch(array, leftIndex, rigntIndex, target);
		}

		return false;
	}
// Time complexity - O(n * log n)

}
