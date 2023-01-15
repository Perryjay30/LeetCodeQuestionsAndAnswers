package InterviewQuestionsPractice2;

import java.util.Scanner;

public class MissingNumberArray {
    private static final Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
    missedNum();
    }

    private static void missedNum() {
        int missed;
        int total = 0;
        System.out.println("Enter the length of the array: ");
        missed = sc.nextInt();
        int [] arr = new int[missed];
        int sum = (missed * (missed + 1)) / 2;
        System.out.println("Enter the elements of the array within 0 to " + (missed-1));
        for (int i = 0; i < missed; i++) {
            arr[i] = sc.nextInt();
            total += arr[i];
        }
        int missedNumber = total - sum;
        System.out.println("The missing number is: " + missedNumber);

    }
}
