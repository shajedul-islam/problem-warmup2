/**
 *
 *
 *
 * Given a string and a non-negative int n, we'll say that the front of the string is the first 3 chars, or whatever is there if the string is less than length 3. Return n copies of the front;
 *
 *
 * frontTimes("Chocolate", 2) → "ChoCho"
 * frontTimes("Chocolate", 3) → "ChoChoCho"
 * frontTimes("Abc", 3) → "AbcAbcAbc"
 */

public class FrontTimesTest {
    public static void main(String[] a) {
        FrontTimes frontTimes = new FrontTimes();
        System.out.println(frontTimes.frontTimes("Chocolate", 2));
        System.out.println(frontTimes.frontTimes("Chocolate", 3));
        System.out.println(frontTimes.frontTimes("Abc", 3));
    }
}

class FrontTimes {
    public String frontTimes(String str, int n) {

        int frontLen = 3;
        if (frontLen > str.length()) {
            frontLen = str.length();
        }
        String front = str.substring(0, frontLen);

        String result = "";
        for (int i=0; i<n; i++) {
            result = result + front;
        }
        return result;
    }
}