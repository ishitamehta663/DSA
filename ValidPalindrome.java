class ValidPalindrome {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            // Move left pointer if not alphanumeric
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            // Move right pointer if not alphanumeric
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }

            // Compare characters
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true; // All characters matched
    }

    // For testing
    public static void main(String[] args) {
        ValidPalindrome obj = new ValidPalindrome();

        System.out.println(obj.isPalindrome("A man, a plan, a canal: Panama")); // true
        System.out.println(obj.isPalindrome("race a car")); // false
        System.out.println(obj.isPalindrome(" ")); // true
    }
}
