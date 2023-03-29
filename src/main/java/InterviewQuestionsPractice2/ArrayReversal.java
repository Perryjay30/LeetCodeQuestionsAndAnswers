package InterviewQuestionsPractice2;

import java.util.ArrayList;
import java.util.List;

public class ArrayReversal {
    public static void main(String[] args) {
        int [] arr = {45, 21, 67, 89, 10, 34, 58};
        System.out.println(reverseArray(arr));
    }

    public static List<Integer> reverseArray(int [] arr) {
        List<Integer> arr2 = new ArrayList<>();
        for (int i = arr.length-1; i > -1; i--) {
            arr2.add(arr[i]);
        }
        return arr2;
    }
}
