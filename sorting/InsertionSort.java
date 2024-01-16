package sorting;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] a) {
        int[] A = insertionSort(new int[]{1, 4, 7, 2,0});
        System.out.println("A :" + Arrays.toString(A));

    }
    private static int[] insertionSort(int A[]){
        for (int i = 1; i <A.length ; i++) {
            int temp= A[i];
            int j=i-1;
            while(j>=0 && temp<A[j]){
                A[j+1]=A[j];
                A[j]=temp;
                j--;
            }
        }
        return A;
    }
}
