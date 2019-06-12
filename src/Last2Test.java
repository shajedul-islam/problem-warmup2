/**
 *
 * Given a string, return the count of the number of times that a substring length 2 appears in the string and also as the last 2 chars of the string, so "hixxxhi" yields 1 (we won't count the end substring).
 *
 *
 * last2("hixxhi") → 1
 * last2("xaxxaxaxx") → 1
 * last2("axxxaaxx") → 2
 */

public class Last2Test {
    public static void main(String[] a) {
        Last2 last2 = new Last2();
        System.out.println(last2.last2("Code"));
        System.out.println(last2.last2("abc"));
        System.out.println(last2.last2("ab"));
    }
}

class Last2 {
    public int last2(String str) {
        if (str.length() < 2) return 0;

        String end = str.substring(str.length()-2);
        // Note: substring() with 1 value goes through the end of the string
        int count = 0;

        // Check each substring length 2 starting at i
        for (int i=0; i<str.length()-2; i++) {
            String sub = str.substring(i, i+2);
            if (sub.equals(end)) {  // Use .equals() with strings
                count++;
            }
        }

        return count;
    }

}