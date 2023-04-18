package IntersectionOfArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class IntersectingTwoArrays {
    public static void main(String[] args) {
        Integer [] nums1 = {1, 2, 3, 4, 5};
        Integer [] nums2 = {2, 1, 4, 3};
        System.out.println(Arrays.toString(printDuplicate(nums1, nums2)));
        System.out.println(arraysIntersection(nums1, nums2));
    }

    public static ArrayList<Integer> arraysIntersection(Integer [] num1, Integer [] num2) {
        ArrayList<Integer> lst = new ArrayList<>();
        for (int i = 0; i < num1.length; i++) {
            for (int j = 0; j < num2.length; j++) {
                if(Objects.equals(num1[i], num2[j])) lst.add(num1[i]);
            }
        }
        return lst;
    }

    public static Integer [] printDuplicate(Integer [] num1, Integer [] num2) {
        return Stream.of(num1)
                .filter(Arrays.asList(num2)::contains)
                .distinct().toArray(Integer[]::new);
    }
}
