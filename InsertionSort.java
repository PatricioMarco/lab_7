import java.util.Arrays;

public class InsertionSort {

   
    public static <E extends Comparable<E>> void insertionSort(E[] list) {

        
        for (int i = 1; i < list.length; i++) {

          
            E current = list[i];

           
            int k;

           
            for (k = i - 1; k >= 0 && list[k].compareTo(current) > 0; k--) {
                list[k + 1] = list[k];
            }

            
            list[k + 1] = current;
        }
    }

    public static void main(String[] args) {
        Integer[] testArray = {64, 34, 25, 1, 22, 11, 2};
        System.out.println("Original array: " + Arrays.toString(testArray));

        
        insertionSort(testArray);

        System.out.println("Sorted array: " + Arrays.toString(testArray));
    }

}