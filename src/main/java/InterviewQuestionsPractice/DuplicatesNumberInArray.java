package InterviewQuestionsPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DuplicatesNumberInArray {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
//        int [] arr = {1, 2, 1, 2};
//        System.out.println(duplicate(arr));
        List<Integer> num = List.of(1, 2, 1, 2);
        num.stream().distinct().forEach(System.out::println);

    }

//    public static List<Integer> duplicate(int[] arr) {
//        ArrayList<Integer> lst = new ArrayList<>();
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i + 1; j < arr.length; j++) {
//                if(arr[i] == arr[j]) lst.add(arr[j]);
//            }
//        }
//        return lst;
//    }

    public static void duplicates(int [] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j])
                    System.out.println("Duplicates: " + arr[i]);
            }
        }
    }

    public static void duplications() {
        System.out.println("Enter the length of the array: ");
        int len = sc.nextInt();
        int[] arr = new int[len];
        System.out.println("Enter the array elements between 0 and " + (len-1));
        for (int i = 0; i < len-1; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j])
                    System.out.println("Duplicates: " + arr[i]);
            }
        }

    }
}
