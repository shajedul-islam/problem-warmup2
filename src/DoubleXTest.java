/**
 *
 * Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".
 *
 *
 * doubleX("axxbb") → true
 * doubleX("axaxax") → false
 * doubleX("xxxxx") → true
 */

public class DoubleXTest {
    public static void main(String[] a) {
        DoubleX doubleX = new DoubleX();
        System.out.println(doubleX.doubleX("axxbb"));
        System.out.println(doubleX.doubleX("axaxax"));
        System.out.println(doubleX.doubleX("xxxxx"));
    }
}

class DoubleX {
    boolean doubleX(String str) {
        if (str.contains("x")) {
            int firstX = str.indexOf('x');
            return firstX != str.length() - 1 && str.charAt(firstX + 1) == 'x' ? true : false;
        }
        return false;
    }

}