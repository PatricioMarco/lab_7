import java.util.Arrays;
import java.util.Comparator;

public class BubbleSort {

    
    public static <E> void bubbleSort(E[] array, Comparator<? super E> comparator) {

        
        int n = array.length;

        
        E temp;

        
        for (int i = 0; i < n; i++) {

            
            for (int j = 1; j < (n - i); j++) {

                
                if (comparator.compare(array[j - 1], array[j]) > 0) {

                    
                    temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;

                }
            }
        }
    }

    public static void main(String[] args) {

        
        Integer[] testArray = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Original array: " + Arrays.toString(testArray));

        // Call the bubbleSort function to sort the array
        bubbleSort(testArray, Comparator.naturalOrder());

        System.out.println("Sorted array: " + Arrays.toString(testArray));

    }

}