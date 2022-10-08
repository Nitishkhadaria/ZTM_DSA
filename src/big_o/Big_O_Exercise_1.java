public class Big_O_Exercise_1 {

    public static void main(String[] args) {
        int[] input = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        System.out.println(funChallenge(input));

    }

    public static int funChallenge(int[] input) {
        int aNumber = 10; // O(1)
        aNumber = 50 + 3; // O(1)

        for (int i = 0; i < input.length; i++) { // O(n)
            anotherFunction(); // O(n)
            boolean stranger = true; // O(n)
            aNumber++; // O(n)
        }
        return aNumber; // O(1)
    }

    public static void anotherFunction() {

    }

// Time complexity = O(n)

}
