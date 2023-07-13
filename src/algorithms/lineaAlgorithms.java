package algorithms;

public class lineaAlgorithms {
    public static void main(String[] args) {

    }



    // O(N)
    public int[] findMaxElement(int [] array){
        int max = array[0];
        for (int i = 0; i <array.length ; i++) {
            if (array[i] > max){
                max = array[i];
            }
        }

        return array ;
    }

    //O(N*N)
    public int[] findNewMaxElement(int [] array){
        int max = 0 ;
        for (int i = 0; i <array.length ; i++) {
            int j;
            for (j = 0; j < array.length; j++) {

            }
            if (array[i] > array[j]) {
                max ++ ;
            }
        }

        return new int[]{max};
    }

}
