class Thrid_max {
    public int thirdMax(int[] nums) {
        Long first = null, second = null, third = null; 

        for (int num : nums) {
            long n = num;

            // skip duplicates
            if ((first != null && n == first) ||
                (second != null && n == second) ||
                (third != null && n == third)) {
                continue;
            }

            if (first == null || n > first) {
                third = second;
                second = first;
                first = n;
            } else if (second == null || n > second) {
                third = second;
                second = n;
            } else if (third == null || n > third) {
                third = n;
            }
        }

        return third == null ? first.intValue() : third.intValue();
    }
}
