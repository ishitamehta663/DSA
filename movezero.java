class movezero {
    public void moveZeroes(int[] nums) {
        int index = 0; // pointer to place non-zero numbers

        // Step 1: Move all non-zero elements forward
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[index] = nums[i];
                index++;
            }
        }

        // Step 2: Fill the remaining positions with 0
        while (index < nums.length) {
            nums[index] = 0;
            index++;
        }
    }
}
