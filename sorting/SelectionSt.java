package sorting;

import java.util.Arrays;

/**
 *
 */
public class SelectionSt {

    public static void main(String[] a) {
        int[] A = selectionSort(new int[]{1, 4, 7, 2,0});
        System.out.println("A :" + Arrays.toString(A));

    }

    private static int[] selectionSort(int[] X) {

        for(int i = 0; i < X.length-1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < X.length; j++) {
                if (X[j] < X[minIndex]) {
                    minIndex = j;
                }
            }
            //swap found min Value
            int temp = X[minIndex];
            X[minIndex] = X[i];
            X[i] = temp;

        }
            return X;
        }
}
