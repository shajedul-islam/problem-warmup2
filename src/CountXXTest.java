/**
 *
 * Count the number of "xx" in the given string. We'll say that overlapping is allowed, so "xxx" contains 2 "xx".
 *
 *
 * countXX("abcxx") → 1
 * countXX("xxx") → 2
 * countXX("xxxx") → 3
 */

public class CountXXTest {
    public static void main(String[] a) {
        CountXX countXX = new CountXX();
        System.out.println(countXX.countXX("abcxx"));
        System.out.println(countXX.countXX("xxx"));
        System.out.println(countXX.countXX("xxxx"));
    }
}

class CountXX {
    int countXX(String str) {
        int count = 0;
        if (str.contains("xx")) {
            for (int i = 0; i < str.length() - 1; i++) {
                if (str.substring(i, i + 2).equals("xx")) {
                    count ++;
                }
            }

        }
        return count;
    }
}