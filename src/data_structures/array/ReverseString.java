
public class ReverseString {

	public static void main(String[] args) {
		String input = "My name is nitish khadaria and live in india";
		String result = reverseStringWithBuilder(input);
		System.out.println(result);

	}

	public static String reverseStringWithOutArray(String input) {
		StringBuilder sb = new StringBuilder();
		for (int i = input.length() - 1; i >= 0; i--) {
			sb.append(input.charAt(i));
		}
		return sb.toString();
	}

	public static String reverseStringWihtArray(String input) {
		char[] array = input.toCharArray();
		String sb = "";
		for (int i = array.length - 1; i >= 0; i--) {
			sb=sb+array[i];
		}
		return sb.toString();
	}
	
	public static String reverseStringWithBuilder(String input) {
		return new StringBuilder(input).reverse().toString();
	}

}
