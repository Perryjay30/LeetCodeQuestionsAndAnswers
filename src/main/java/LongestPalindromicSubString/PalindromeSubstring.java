package LongestPalindromicSubString;

public class PalindromeSubstring {

    public static void main(String[] args) {
        String word = "Banana";
//        System.out.println(longestPalindrome(word));
        System.out.println(thePalindromeIsLong(word));
    }
    public static String longestPalindrome(String word) {
        if(word.isEmpty()) {
            return null;
        }

        if(word.length() == 1) {
            return word;
        }

        String longest = word.substring(0, 1);
        for (int i = 0; i < word.length(); i++) {
            //get longest palindrome with center of i
            String temp = helper(word, i, i);
            if(temp.length() > longest.length()) {
                longest = temp;
            }

            //get longest palindrome with center of i, i + 1
            temp = helper(word, i, i +1);
            if(temp.length() > longest.length()) {
                longest = temp;
            }
        }
        return longest;
    }

    //Given a center, either one letter or two letter
    //find longest palindrome
    public static String helper(String alphabet, int begin, int end) {
        while(begin >= 0 && end <= alphabet.length() -1 && alphabet.charAt(begin) == alphabet.charAt(end)) {
           begin--;
           end++;
        }
        return alphabet.substring(begin + 1, end);
    }

    //Another method

    public static String thePalindromeIsLong(String word) {
        if(word.isEmpty()) {
            return null;
        }

        if(word.length() == 1) {
            return word;
        }

        int start = 0;
        int ending = 0;
        for (int i = 0; i < word.length()-1; i++) {
            int len1 = expandPalindromeCenter(word, i, i);
            int len2 = expandPalindromeCenter(word, i, i+1);
            int len = Math.max(len1, len2);
            if(len > ending) {
                start = i - (len-1)/2;
                ending = len;
            }
        }
        return word.substring(start, start + ending);
    }

    public static int expandPalindromeCenter(String letter, int right, int left) {
        while(left >= 0 && right <= letter.length()-1 && letter.charAt(left) == letter.charAt(right)) {
            left--;
            right++;
        }
        return right-left-1;
    }
}
