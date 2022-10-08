public class Big_O_Exercise_2 {

	public static void main(String[] args) {
		int a = 5; // O(1)
		int b = 10; // O(1)
		int c = 50; // O(1)

		for (int i = 0; i < args.length; i++) { 
			int x = i + 1;// O(n)
			int y = i + 2;// O(n)
			int z = i + 3;// O(n)

		}

		for (int j = 0; j < args.length; j++) {
			int p = j * 2;// O(n)
			int q = j * 2;// O(n)
		}
		
		String whoAmI = "I don't know"; // O(1)
	}

}

//Time complexity -> Big O(4+5n) -> O(n)