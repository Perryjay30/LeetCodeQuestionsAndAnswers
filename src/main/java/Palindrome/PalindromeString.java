package Palindrome;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        isPalindrome();
    }

    public static void isPalindrome() {
        String rev = "";
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str = input.nextLine();
//        String str = "Hannah";
        str = str.toLowerCase();
        for(int i = str.length() - 1; i >= 0; i--) {
           rev = rev + str.charAt(i);
        }
        if(str.equals(rev))
            System.out.println("String is a Palindrome");
        else
            System.out.println("String is not a Palindrome");
    }



}
