//WAP Given 2 arrays, create a function that let's user know whether these two arrays contain any common items
import java.util.HashMap;
public class Exercise {

	public static void main(String[] args) {
		char[] array1 = new char[] { 'a', 'b', 'c', 'd', 'f' };
		char[] array2 = new char[] { 'f', 'g', 'x', 'y', 'z' };
		boolean result = false;
		HashMap<Character, Boolean> map = new HashMap<>();
		for (char c : array1) {
			if (!map.containsKey(c)) {
				map.put(c, true);
			}
		}

		for (char c : array2) {
			if (map.containsKey(c)) {
				result = true;
				break;
			}
		}
		System.out.println(result);
	}
// Time Complexity - O(n)
}
