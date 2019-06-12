import java.lang.reflect.Array;

/**
 *
 * Count the number of "xx" in the given string. We'll say that overlapping is allowed, so "xxx" contains 2 "xx".
 *
 *
 * arrayCount9("abcxx") → 1
 * arrayCount9("xxx") → 2
 * arrayCount9("xxxx") → 3
 */

public class ArrayCount9Test {
    public static void main(String[] a) {
        ArrayCount9 arrayCount9 = new ArrayCount9();
        int [] nums = {1, 9, 9, 3, 9};
        System.out.println(arrayCount9.arrayCount9(nums));
    }
}

class ArrayCount9 {
    public int arrayCount9(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i ++) {
            if (nums[i] == 9) {
                count ++;
            }
        }
        return count;
    }

}