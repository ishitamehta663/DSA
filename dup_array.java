class dup_array {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if (n <= 2) return n;  // If array has 2 or fewer elements, no need to remove anything

        int k = 2; // Start from index 2 (since first two are always valid)

        for (int i = 2; i < n; i++) {
            // If current number is not same as nums[k - 2],
            // it means it can appear again (max twice)
            if (nums[i] != nums[k - 2]) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }
}
