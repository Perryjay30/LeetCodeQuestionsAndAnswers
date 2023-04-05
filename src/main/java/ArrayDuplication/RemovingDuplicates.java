package ArrayDuplication;

import java.util.Arrays;
import java.util.List;

public class RemovingDuplicates {
    public static void main(String[] args) {
        duplicate();
    }

    public static void duplicate() {
        List<Integer> arr = List.of(1, 2, 2, 1);
        arr.stream().distinct().forEach(System.out::println);
    }
}
