package IntersectionOfArrays;

import java.util.*;
import java.util.stream.Stream;


public class IntersectingTwoArrays {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1};
        int [] nums2 = {2, 2};
        System.out.println(Arrays.toString(arraysIntersect(nums1, nums2)));
//        System.out.println(arraysIntersection(nums1, nums2));
    }

    public static int [] arraysIntersect(int [] num1, int [] num2) {
        Set<Integer> integerSet = new HashSet<>();
        for (int i = 0; i < num1.length; i++) {
            for (int j = 0; j < num2.length; j++) {
                if(Objects.equals(num1[i], num2[j]))
                    integerSet.add(num1[i]);
            }
        }

        int setSize = integerSet.size();
        int [] arr = new int[setSize];
        int i = 0;
        for (int counter : integerSet)
            arr[i++] = counter;

        return arr;
    }

//    public static Set<Integer> arraysIntersection(int [] num1, int [] num2) {
//        Set<Integer> lst = new HashSet<>();
//        for (int i = 0; i < num1.length; i++) {
//            for (int j = 0; j < num2.length; j++) {
//                if(Objects.equals(num1[i], num2[j])) lst.add(num1[i]);
//            }
//        }
//        return lst;
//    }


    public static Integer [] printDuplicate(Integer [] num1, Integer [] num2) {
        return Stream.of(num1)
                .filter(Arrays.asList(num2)::contains)
                .distinct().toArray(Integer[]::new);
    }
}
