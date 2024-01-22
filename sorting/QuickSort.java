import java.util.Arrays;

public class QuickSort {


    public static void main(String[] a) {
        int[] A = new int[]{1, 4, 7, 2,10};
        quickSort( A,0,A.length-1 );
        System.out.println("A :" + Arrays.toString(A));

    }
    private static void quickSort(int A[], int left, int right){
        if(left<right) {
            int pivot = pivot(A, left, right);
            quickSort(A, left, pivot - 1);
            quickSort(A, pivot + 1, right);

        }
    }
//
    private static int pivot(int[] arr, int left, int right) {
        int swap = left;
        for (int i = left+1; i <= right ; i++) {
            if(arr[i] < arr[left]){
                swap++;
                swap(arr, swap, i);
            }
        }
        swap(arr, left, swap);
        return swap;
    }

    private static void swap(int[] a, int left, int right) {
        int temp = a[left];
        a[left]=a[right];
        a[right]=temp;
    }
}
