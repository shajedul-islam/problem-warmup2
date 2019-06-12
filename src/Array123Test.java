/**
 *
 * Count the number of "xx" in the given string. We'll say that overlapping is allowed, so "xxx" contains 2 "xx".
 *
 *
 * array123("abcxx") → 1
 * array123("xxx") → 2
 * array123("xxxx") → 3
 */

public class Array123Test {
    public static void main(String[] a) {
        Array123 array123 = new Array123();
        int [] nums = {1, 1, 2, 3, 1};
        System.out.println(array123.array123(nums));
    }
}

class Array123 {
    public boolean array123(int[] nums) {
        for (int i = 0; i < nums.length - 2; i ++) {
            if (nums[i] == 1 && nums[i + 1] == 2 && nums[i + 2] == 3) {
                return true;
            };
        }
        return false;
    }

}