package sorting;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] a) {
        int[] A = bubbleSort(new int[]{1, 4, 7, 2, 10});
        System.out.println("A :" + Arrays.toString(A));
    }

    private static int[] bubbleSort(int[] X) {
        for (int i = X.length-1; i >0  ; i--) {
            for (int j = 0; j < i; j++) {
                if (X[j] > X[j+1]) {
                    // swap arr[j] and arr[j+1]
                    int temp = X[j];
                    X[j] = X[j + 1];
                    X[j + 1] = temp;
                }
            }
        }
        return X;
    }
}
