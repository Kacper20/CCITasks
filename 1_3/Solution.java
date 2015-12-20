/**
 * Created by kacper on 16.12.2015.
 */
/*
    Given two strings, write a method to decide if one is permutation of the other
 */

    /*
    Ideas:
    1.
    If characters are ASCII characters, we could build array of 256 ints, go through two strings, fill array with occurences of each char.
    Later, iterate through second string comparing the arrays
    Memory complexity: constant, O(1)
    Time complexity: O(n), where n is the length of string


    2.
    Sort two strings, and compare them in standard way
    Time complexity: O(nlgn) + O(n) = O(nlgn)

    Make two  dictionaries/maps <Character, Int>, and iterate over strings:
    for elem in string:
        let mapElem = map[elem]
        if mepElem != nil { map[elem] = mapElem +=1  }
        else { map[elem] = 1 }

     Later just compare two maps, if every (key, value) pair is the same.


     So for first - check if they have same length, it's very important
     */


public class Solution {


    public static boolean compare(String s1, String s2) {
        if (s1.length() != s2.length()) { return false; }

        int[] letters = new int[256];
        char[] chars_array = s1.toCharArray();
        for (char c : chars_array) {
            letters[c] += 1;
        }

        for (int i = 0; i < s2.length(); i++) {

            int indx = s2.charAt(i);
            if (letters[indx] < 0) {
                letters[indx]--;
                return false;
            }
        }

        return true;


    }

    public static void main(String[] args) {

    }

}
