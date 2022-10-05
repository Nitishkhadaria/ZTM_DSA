import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;

public class FindNemo_Linear {

	public static void main(String[] args) {
		Instant start = Instant.now(); 
		String[] input = new String[1000];
		Arrays.fill(input, "nemo");
		
		for (int i = 0; i < input.length; i++) {
			if(input[i] =="nemo") {
				System.out.println("Find Nemo");
			}
		}
		Instant end = Instant.now();
		Duration timeElapsed = Duration.between(start, end);
		System.out.println("Time taken: "+ timeElapsed.toMillis() +" milliseconds");
	}
	// Time complexity - O(n)


}
