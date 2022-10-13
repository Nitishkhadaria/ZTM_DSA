package Interview_questions;

public class MaximumSumSubArray {

	public static void main(String[] args) {
		int[] nums = new int[] { 2, -4, 1, 4, -5 };
		System.out.println(maxSubArray(nums));
	}

	public static int maxSubArray(int[] nums) {
		if (null != nums && nums.length > 0) {
			int max_so_far = Integer.MIN_VALUE;
			int max_ending = 0;
			for (int i = 0; i < nums.length; i++) {
				max_ending = max_ending + nums[i];
				if (max_ending > max_so_far) {
					max_so_far = max_ending;
				}
				if(max_ending<0) {
					max_ending = 0;
				}

			}
			return max_so_far;
		} else {
			return 0;
		}
	}


    
}
