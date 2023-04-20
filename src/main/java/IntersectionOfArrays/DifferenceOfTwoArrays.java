package IntersectionOfArrays;

import java.util.*;
import java.util.stream.Stream;

public class DifferenceOfTwoArrays {
    public static void main(String[] args) {
        int [] nums = {1, 2, 3};
        int [] nums2 = {2, 4, 6};
        System.out.println(diffArrays(nums, nums2));
    }

    public static List<List<Integer>> diffArrays(int [] nums, int [] nums2) {
        Set<Integer> numSet1 = new HashSet<>();
        Set<Integer> numSet2 = new HashSet<>();
        for (int number : nums) numSet1.add(number);
        for (int number : nums2) numSet2.add(number);
        ArrayList<Integer> lstOfArray = new ArrayList<>();
        ArrayList<Integer> lstOfArray2 = new ArrayList<>();
        for (int num : numSet1) {
            if(!numSet2.contains(num)) lstOfArray.add(num);
        }
        for (int numb : numSet2) {
            if(!numSet1.contains(numb)) lstOfArray2.add(numb);
        }

        return Arrays.asList(lstOfArray, lstOfArray2);
    }
}
