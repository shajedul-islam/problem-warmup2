/**
 *
 * Given a non-empty string like "Code" return a string like "CCoCodCode".
 *
 *
 * stringSplosion("Code") → "CCoCodCode"
 * stringSplosion("abc") → "aababc"
 * stringSplosion("ab") → "aab"
 */

public class StringSplosionTest {
    public static void main(String[] a) {
        StringSplosion stringSplosion = new StringSplosion();
        System.out.println(stringSplosion.stringSplosion("Code"));
        System.out.println(stringSplosion.stringSplosion("abc"));
        System.out.println(stringSplosion.stringSplosion("ab"));
    }
}

class StringSplosion {
    public String stringSplosion(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i ++) {
            result += str.substring(0, i + 1);
        }
        return result;
    }

}