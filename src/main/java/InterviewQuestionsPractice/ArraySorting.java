package InterviewQuestionsPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraySorting {
    public static void main(String[] args) {
        int [] arr = {21, 45, 33, 10, 97, 118};
        System.out.println(Arrays.toString(sortArrayInAscendingOrder(arr)));
        System.out.println(Arrays.toString(sortArrayInDescendingOrder(arr)));
    }

    public static int [] sortArrayInAscendingOrder(int [] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[i] < arr[j]) {
                   int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static int [] sortArrayInDescendingOrder(int [] arr) {
        int swap = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[i] > arr[j]) {
                  swap = arr[i];
                  arr[i] = arr[j];
                  arr[j] = swap;
                }
            }
        }
        return arr;
    }

}
