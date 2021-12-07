/**
* Recursion program reverses a word.
*
* @author Jakob
* @version 1.0
* @since 2020-11-26
*/

class Recursions1 {

    /**
    * If string length is equal or less than one say the string.
    *
    * @param str str
    *
    * @return Recursion
    */
    public String reverseString(String str) {
        final String value;
        if (str == null || str.length() <= 1) {
            value = str;
        }
        else {
            // Takes the remainder (substring1), after taking out the first character (substring0).
            // It then adds them together.
            value = reverseString(str.substring(1))
                + str.charAt(0);
        }
        return value;
    }
    /**
    * Starting function.
    *
    * @param args No args will be used
    */

    public static void main(String[]args) {

        final Recursions1 rs = new Recursions1();
        final String resultantSting1 = rs.reverseString("Recursion");
        System.out.println("The original string is:  Recursion");
        System.out.println("The reversed string (using recursion) is: " + resultantSting1);
        System.out.println("\nDone");
    }
}
