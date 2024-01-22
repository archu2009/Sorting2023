import java.util.Arrays;

public class MergeSort {

    public static void main(String[] a) {
        int[] arr = new int[]{1, 4, 7, 2, 0,3};
        int sortedArr[] = mergesort(arr);
       // int[] A = merge(new int[]{1, 4, 7, 2, 0}, new int[]{8,9,3});
        System.out.println("Arr :" + Arrays.toString(arr));
        System.out.println("Sorted :" + Arrays.toString(sortedArr));
    }

    private static int[] mergesort(int[] arr) {

        if(arr.length == 1) return arr;
        int len= arr.length/2;
        int[] left = Arrays.copyOfRange(arr,0, len);
        int[] right = Arrays.copyOfRange(arr,len, arr.length);

        return merge(left, right);
    }

    //Takes sorted two array and returns combined array
    private static int[] merge(int[] arr1, int[] arr2) {

        int left = 0;
        int right = 0;
        int comArr[] = new int[arr1.length + arr2.length];
        int i = 0;
        while (left < arr1.length && right < arr2.length) {
            if (arr1[left] < arr2[right]) {
                comArr[i] = arr1[left];
                left++;
                i++;

            } else {
                comArr[i] = arr2[right];
                right++;
                i++;
            }
        }
        while ( left< arr1.length) {
            comArr[i] = arr1[left];
            left++;
            i++;

        }

        while (right<arr2.length) {
            comArr[i] = arr2[right];
            right++;
            i++;
        }
    return comArr;
    }
}
