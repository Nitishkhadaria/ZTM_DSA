package Interview_questions;

public class MoveZeroes {

	public static void main(String[] args) {
		int[] array = { 0, 1, 0, 3, 12 };
		
		int tempIndex = 0;
		for (int i = 0; i < array.length; i++) {
			if(array[i] != 0) {
				array[tempIndex] = array[i];
				tempIndex++;
			}
		}
		
		for(int i = tempIndex ; i < array.length; i++) {
			array[i] = 0;
		}
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(" " +array[i]);
		}

	}


    
}
