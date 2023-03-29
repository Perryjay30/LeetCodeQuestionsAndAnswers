package ArrayDuplication;

import java.util.ArrayList;
import java.util.List;

public class Dsa2 {
    public static void main(String[] args) {
//        int [] arr = {1, 2, 1, 2};
//        System.out.println(duplicate(arr));
        List<Integer> num = List.of(1, 2, 1, 2);
        num.stream().distinct().forEach(System.out::println);

    }

    public static List<Integer> duplicate(int[] arr) {
        ArrayList<Integer> lst = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[i] == arr[j]) lst.add(arr[j]);
            }
        }
        return lst;
    }
}
