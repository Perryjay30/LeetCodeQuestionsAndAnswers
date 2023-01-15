package InterviewQuestionsPractice;

import java.util.Scanner;

public class IntegerReversal {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
    reversedInteger();
    }

    public static void reversedInteger() {
        System.out.println("Enter the number: ");
        int number = input.nextInt();
        int reverse = 0;
        while(number > 0) {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number /= 10;
        }
        System.out.printf("Reversed number is: %s", reverse);
    }
}
