import java.util.*;

class sum3{
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);  // Step 1: Sort the array
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < nums.length - 2; i++) {
            // Step 2: Skip duplicates for the fixed number
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int left = i + 1;              // Left pointer
            int right = nums.length - 1;   // Right pointer

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    // Found a triplet
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    // Move both pointers and skip duplicates
                    while (left < right && nums[left] == nums[left + 1]) left++; 
                    while (left < right && nums[right] == nums[right - 1]) right--; 

                    left++;
                    right--;
                } 
                else if (sum < 0) {
                    left++;  // Increase sum
                } 
                else {
                    right--; // Decrease sum
                }
            }
        }

        return result;
    }
}
