package IntersectionOfTwoArrays;

import java.util.ArrayList;


public class IntersectingArrays {
    public static void main(String[] args) {
        int [] nums1 = {1, 2, 2, 1};
        int [] nums2 = {2, 2};
        System.out.println(arraysIntersection(nums1, nums2));
    }

    public static ArrayList<Integer> arraysIntersection(int [] num1, int [] num2) {
        ArrayList<Integer> lst = new ArrayList<>();
        for (int k : num1) {
            for (int i : num2) {
                if (k == i && lst.isEmpty()) lst.add(k);
            }
        }
        return lst;
    }

//    public static ArrayList<int[]> arraysIntersection2(int [] num1, int [] num2) {
//        ArrayList<int[]> lst = new ArrayList<>();
//        lst.add(num1); lst.add(num2);
//        lst.stream().distinct().collect(Collector.of());
//        return lst;

//    }
}
