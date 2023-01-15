package InterviewQuestionsPractice2;

import java.util.Arrays;

public class BasicStatsOnArray {
    public static void main(String[] args) {
        int [] arr = {823, 265, 108, 776, 389, 943, 565, 112, 653, 867, 426};
        largestNumber(arr);
        secondLargestNumber(arr);
        Arrays.sort(arr);


    }

    private static void largestNumber(int [] obj) {
        int largest = Integer.MIN_VALUE;
        for (int j : obj) {
            if (j > largest) {
                largest = j;
            }
        }

        System.out.println("The largest number is: " + largest);
    }


    private static void secondLargestNumber(int[] obj) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int j : obj) {
            if (j > largest) {
                secondLargest = largest;
                largest = j;
            }

            if (j != largest && j > secondLargest) {
                secondLargest = j;
            }
        }
//        for (int i = obj.length - 1; i > 1; i--) {
//            if (obj[i] != obj[obj.length - 1]) {
//                System.out.println(obj[i - 1]);
//                break;
//            }
//        }

        System.out.println("The second largest number is: " + secondLargest);
    }
}
