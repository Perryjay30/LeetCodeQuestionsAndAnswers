package IntersectionOfArrays;

import java.util.*;

public class IntersectingMultipleArrays {
    public static void main(String[] args) {
        int [][] arr = {{3, 1, 2, 4, 5}, {1, 2, 3, 4}, {3, 4, 5, 6}};
        System.out.println(multipleArrays(arr));
//        multipleArrays(arr);

    }

    public static List<Integer> multipleArrays(int [][] arr) {
        ArrayList<Integer> arrList = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                map.put(arr[i][j], map.getOrDefault(arr[i][j], 0) + 1);
            }
        }

        for (Integer key : map.keySet()) {
            if (map.get(key) == arr.length) arrList.add(key);
        }

        Collections.sort(arrList);
        return arrList;
    }
}
