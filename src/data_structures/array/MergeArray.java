public class MergeArray {

	public static void main(String[] args) {
		int[] arrayFirst = new int[] { 1, 2, 8, 9, 11, 15, 16 };
		int[] arraySecond = new int[] { 1, 1, 8, 9, 10 };
		final int[] output = new int[arrayFirst.length + arraySecond.length];

		int index_for_first_array = 0;
		int index_for_second_array = 0;
		for (int i = 0; i <= output.length; i++) {
			if (index_for_first_array < arrayFirst.length && (index_for_second_array == arraySecond.length
					|| arrayFirst[index_for_first_array] < arraySecond[index_for_second_array])) {
				output[i] = arrayFirst[index_for_first_array];
				index_for_first_array++;
			} else {
				if (index_for_second_array < arraySecond.length) {
					output[i] = arraySecond[index_for_second_array];
					index_for_second_array++;
				}
			}
		}

		for (int i = 0; i < output.length; i++) {
			System.out.println(output[i]);
		}

	}


    
}
