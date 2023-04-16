package ArrayDuplication;

import java.util.ArrayList;
import java.util.Arrays;

public class PrintDuplicates {
    public static void main(String[] args) {
        int [] num = {1, 2, 5, 1, 6, 8, 9, 5, 6, 8};
        System.out.println(printDuplicate(num));

    }

    public static ArrayList<Integer> printDuplicate(int [] num) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < num.length; i++) {
            for (int j = i+1; j < num.length; j++) {
                System.out.println(j);
                if(num[j] == num[i]) {
                    arrayList.add(num[j]);
                }
            }
        }
        return arrayList;
    }

}
