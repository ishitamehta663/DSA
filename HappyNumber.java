import java.util.HashSet;

public class HappyNumber {
    public boolean isHappy(int n) {
        HashSet<Integer> seen = new HashSet<>();
        
        while (n != 1) {
            n = sumOfSquares(n);
            
            if (seen.contains(n)) {
                return false; // cycle detected
            }
            
            seen.add(n);
        }
        
        return true; // reached 1
    }
    
    private int sumOfSquares(int num) {
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += digit * digit;
            num /= 10;
        }
        return sum;
    }
}
