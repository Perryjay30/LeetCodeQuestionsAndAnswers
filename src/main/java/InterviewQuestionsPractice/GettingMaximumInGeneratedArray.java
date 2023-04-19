package InterviewQuestionsPractice;

public class GettingMaximumInGeneratedArray {
    public static void main(String[] args) {
        System.out.println(getMaxInGeneratedArray(12));
    }

    public static int getMaxInGeneratedArray(int n) {
        if (n < 2) return n;
        int[] nums = new int[n+1];
        nums[0] = 0;
        nums[1] = 1;
        int max = 0;
        for (int i = 2; i <= n; i++) {
            if(i % 2 == 0) nums[i] = nums[i/2];
            else nums[i] = nums[i/2] + nums[i/2 + 1];
            max = Math.max(max, nums[i]);
        }
        return max;
    }
}
