
/*
    Assume you have a method isSubstring which checks if one word is a substring of another. Given two strings,
    s1 and s2, write code to check if s2 is a rotation of s1, using only one call to isSubstring.

 */



public class Solution {


    public static boolean isRotation(String s1, String s2) {
        int len = s1.length();
        if (len == s2.length() && len > 0) {
            //s1 string is in the form of "ab", where a is rotation phrase
            //so s2 string is rotated form of s1 in the form of ba.
            //it is only the rotation of ab, if s2 is substring of s1s1(ie. ba is substring of a(ba)b.
            //If not, s2 is not rotation

            String conactate = s1 + s1;

            //return isSubstring(s2, conactate)
            return true;


        }


        return false;
    }


    public static void main(String[] args) {

    }
}
