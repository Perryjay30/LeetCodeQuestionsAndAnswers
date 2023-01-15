package InterviewQuestionsPractice;

import java.util.Scanner;

public class ArmstrongNumber {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
    number();
    }
    private static void number() {
        System.out.println("Enter your specified number: ");
        int armstrong = input.nextInt();
        int divider, sum = 0;
        int solver = armstrong;

        while(armstrong > 0) {
            divider = armstrong % 10;
            sum += Math.pow(divider, 3);
            armstrong /= 10;
        }
        if(solver == sum)
            System.out.println("The number is an armstrong");
        else
            System.out.println("the number is not an armstrong");
    }
}

