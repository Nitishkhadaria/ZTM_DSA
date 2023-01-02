package Interview_questions;

public class MoveZeroes_InPlace {
    public static void main(String[] args) {
        int[] array = {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};
        int length = array.length ;
        int count = 0;
        for(int i = 0 ; i < length; i++) {
            if(array[i] != 0 ){
                array[count++] = array[i];
            }
        }
        while(count < length){
            array[count++] = 0;
        }

        for(int j = 0; j < length; j++){
            System.out.print(array[j] + " ");
        }
    }
}