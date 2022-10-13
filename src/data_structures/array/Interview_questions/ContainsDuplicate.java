package Interview_questions;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

	public static void main(String[] args) {
		int[] num = {1,2,3,4};
		System.out.println(containsDuplicate(num));

	}

	public static boolean containsDuplicate(int[] nums) {
		
		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < nums.length; i++) {
			if(set.contains(nums[i])) {
				return true;
			}else {
				set.add(nums[i]);
			}
		}
		return false;
	}


    
}
