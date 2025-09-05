import java.util.*;

class comb_sum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(candidates, target, 0, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int[] candidates, int target, int start, List<Integer> current, List<List<Integer>> result) {
       
        if (target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            if (candidates[i] <= target) {  // only choose if it doesn't exceed target
                current.add(candidates[i]);   // choose number
                backtrack(candidates, target - candidates[i], i, current, result); // not i+1 (can reuse)
                current.remove(current.size() - 1);  // backtrack (undo choice)
            }
        }
    }
}
