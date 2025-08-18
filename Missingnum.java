class Missingnum {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        
        // Expected sum from 0 to n
        int total = n * (n + 1) / 2;
        
        // Actual sum of elements in nums
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        
        // Missing number
        return total - sum;
    }
}
