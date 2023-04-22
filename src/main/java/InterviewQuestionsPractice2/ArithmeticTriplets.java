package InterviewQuestionsPractice2;

import java.util.HashSet;
import java.util.Set;

public class ArithmeticTriplets {
    public static void main(String[] args) {
        int [] num = {0, 1, 4, 6};
        int diff = 3;
        System.out.println(findingArithmeticTriplets(num, diff));
    }

    public  static int findingArithmeticTriplets(int [] num, int diff) {
        Set<Integer> numSet = new HashSet<>();
        for(int values : num) numSet.add(values);
        int count = 0;
        for(int firstNum : numSet) {
            if(numSet.contains(firstNum - diff) && numSet.contains(firstNum + diff))
                count++;
        }
        return count;
    }
}
