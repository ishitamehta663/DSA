public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] arr) {
        if (arr == null || arr.length == 0) {
            return "";
        }

    
        String prefix = arr[0];

        // Compare with every other string
        for (int i = 1; i < arr.length; i++) {
            // Reduce the prefix until it matches the start of arr[i]
            while (arr[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }

        return prefix;
    }

    public static void main(String[] args) {
        String[] arr1 = {"geeksforgeeks", "geeks", "geek", "geezer"};
        System.out.println(longestCommonPrefix(arr1));

        String[] arr2 = {"hello", "world"};
        System.out.println(longestCommonPrefix(arr2)); 
    }
}
