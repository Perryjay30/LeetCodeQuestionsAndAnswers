package RotatingArray;

//Problem: Rotate an array of n elements to the right by k steps. For example, with n
//        = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].

import java.util.*;

public class RotateArray {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int [] nums = {1, 2, 3, 4, 5, 6, 7};
//        rightRotation(nums, 3);
//        leftRotation(nums);
        rotateArrayFromTheLeft(nums);
        rotateArrayFromTheRight(nums);
    }
    private static void leftRotation(int [] nums) {
        System.out.println(Arrays.toString(nums));
        System.out.println("Enter the number of left rotation: ");
        int putNumber = input.nextInt();
        for (int j = 0; j < putNumber; j++) {
            int first = nums[0];
            for (int i = 0; i < nums.length-1; i++) {
                nums[i] = nums[i+1];
            }
            nums[nums.length-1] =  first;
        }

        System.out.println("After left rotation: ");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(" " + nums[i]);
        }
    }

    public static void rightRotation(int [] arr, int order) {
        if (arr == null || order < 0) {
            throw new IllegalArgumentException("Illegal argument");
        }

        for (int i = 0; i < order; i++) {
            for (int j = arr.length-1; j > 0; j--) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
            }
        }
        System.out.println("After right rotation");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
    }

    // Another approach

    public static void rotateArrayFromTheLeft(int [] obj) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 3; i < obj.length; i++) {
            arrayList.add(obj[i]);
        }
        for (int i = 0; i < obj.length-4; i++) {
            arrayList.add(obj[i]);
        }
        System.out.println(arrayList);
    }

    public static void rotateArrayFromTheRight(int [] arr) {
        List<Integer> lst = new ArrayList<>();
        for (int i = arr.length-1; i > arr.length-4; i--) {
            lst.add(arr[i]);
        }
        for (int i = 0; i < arr.length-3; i++) {
            lst.add(arr[i]);
        }
        System.out.println(lst);
    }
}
