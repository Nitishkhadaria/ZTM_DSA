package Interview_questions;

public class ArrayRotation {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7};
        int step = 3;
        int[] array2 = rotation(array,step);

        for(int j =0 ; j < array2.length; j++){
            System.out.print(array2[j] + " ");
        }
    }


    public static int[] rotation(int[] array, int step){
        int n = array.length;
        int index = 0;
        int[] array2 = new int[n];

        for(int i = n - step; i < n; i++){
            array2[index++] = array[i];
        }

        for(int i = 0; i < n-step; i++){
            array2[index++] = array[i];
        }
        return array2;
    }
}
