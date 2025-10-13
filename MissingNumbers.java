import java.util.*;

public class MissingNumbers {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        boolean[] seen = new boolean[n + 1];

        // Mark numbers that appear in nums
        for (int num : nums) {
            seen[num] = true;
        }

        // Collect numbers that didn't appear
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (!seen[i]) {
                result.add(i);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println(findDisappearedNumbers(nums1));  // Output: [5, 6]

        int[] nums2 = {1, 1};
        System.out.println(findDisappearedNumbers(nums2));  // Output: [2]
    }
}
