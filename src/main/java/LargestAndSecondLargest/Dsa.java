package LargestAndSecondLargest;

import java.util.ArrayList;
import java.util.List;

public class Dsa {
    public static void main(String[] args) {
        int [] arr = {6, 2, 3, 7, 8, 8, 8};
        largestNumberAndSecondLargest(arr);
    }


    private static void largestNumberAndSecondLargest(int [] obj) {
        List<Integer> num = new ArrayList<>();
        int secondLargest = Integer.MIN_VALUE;
        int largest = Integer.MIN_VALUE;

        for (int j : obj) {
            if (j > largest) {
                secondLargest = largest;
                largest = j;
            }

            if (j != largest && j > secondLargest) {
                secondLargest = j;
            }
        }

        num.add(largest);
        num.add(secondLargest);
        System.out.println(num);
    }

}
