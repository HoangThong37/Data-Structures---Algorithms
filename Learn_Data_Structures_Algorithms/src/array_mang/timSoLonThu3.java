package array_mang;

import java.util.Arrays;

public class timSoLonThu3 {
    static int getThirdLargest(int[] arr, int total) {
        Arrays.sort(arr);
        return arr[total-3];
    }


    public static int getThirdLargest1(int[] a, int total) {
        int temp;
        for (int i = 0; i < total; i++) {
            for (int j = i + 1; j < total; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a[total - 3];
    }

    public static void main(String args[]) {
        int a[] = {1, 2, 5, 5, 6 ,5,6, 6,3,  3, 2};
       // System.out.println(a.length);
        int b[] = {44, 66, 99, 77, 33, 22, 55};
        System.out.println("Third Largest: " + getThirdLargest(a, 6));
        System.out.println("Third Largest: " + getThirdLargest(b, 7));
    }
}



    //    static void thirdLargest(int arr[], int arr_size) {
//        if (arr_size < 3) {
//            System.out.printf(" Invalid Input ");
//            return;
//        }
//        int first = arr[0], second = Integer.MIN_VALUE,
//                third = Integer.MIN_VALUE;
//        for (int i = 1; i < arr_size; i++) {
//            if (arr[i] > first) {
//                third = second;
//                second = first;
//                first = arr[i];
//            }
//            else if (arr[i] > second) {
//                third = second;
//                second = arr[i];
//            }
//            else if (arr[i] > third) {
//                third = arr[i];
//            }
//        }
//        System.out.printf("The third Largest element is %d\n", third);
//    }
    /* Driver program to test above function */
//    public static void main(String []args) {
//        int arr[] = {1,2,3,4,5,6,8,7,7,8};
//        int n = arr.length;
//        thirdLargest(arr, n);
//    }
//}
//This code is contributed by 29AjayKumar
//    public static void main(String[] args) {
//        int[] nums = {1,2,3,4,5,6,8,7,7,8};
//        find3(nums);
//    }

