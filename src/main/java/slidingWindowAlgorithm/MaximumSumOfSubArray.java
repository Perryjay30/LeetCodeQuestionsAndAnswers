package slidingWindowAlgorithm;

public class MaximumSumOfSubArray {
    public static int maxSum(int[] arr, int n, int k) {
        int max_sum = Integer.MIN_VALUE;
        for (int i = 0; i < n - k + 1; i++) {
            int currentSum = 0;
            for (int j = 0; j < k; j++) {
                currentSum = currentSum + arr[i + j];
            }
//            max_sum = Math.max(current_sum, max_sum);
            if(currentSum > max_sum) max_sum = currentSum;
        }
        return max_sum;
    }

//    Another method
    public static int maxSum2(int [] arr, int n, int k) {
        if (n < k) {
            System.out.println("Invalid");
            return -1;
        }
        int maxSum = 0;
        for (int i = 0; i < k; i++) {
            maxSum += arr[i];
        }
        int windowSum = maxSum;
        for (int i = k; i < n; i++) {
            windowSum += arr[i] - arr[i - k];
            maxSum = Math.max(maxSum, windowSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int [] arr = {1, 4, 2, 10, 2, 3, 1, 0, 20};
        int k = 4;
        int n = arr.length;
//        System.out.println(maxSum(arr, k, n));
        System.out.println(maxSum2(arr, k, n));

    }
}
