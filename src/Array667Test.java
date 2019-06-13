/**
 *
 * Given an array of ints, return the number of times that two 6's are next to each other in the array.
 *
 * array667([6, 6, 2]) → 1
 * array667([6, 6, 2, 6]) → 1
 * array667([6, 7, 2, 6]) → 1
 */

public class Array667Test {
    public static void main(String[] a) {
        Array667 array667 = new Array667();
        int [] nums = {6, 7, 2, 6, 6, 6};
        System.out.println(array667.array667(nums));
    }
}

class Array667 {
    public int array667(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                count++;
            }
        }
        return count;
    }
}