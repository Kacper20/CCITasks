/*

    Implement a method to perform basic string compression using counts of repeated characters. If compressed string would not become "smaller
    then the original string, your method should return the original string instead
*/

public class Solution {

    public static String compressString(String input) {

        StringBuilder compression = new StringBuilder();

        int count = 1;
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if (i + 1 == input.length()) {
                compression.append(c);
                compression.append(count);
            }
            else {
                char nextChar = input.charAt(i+1);

                if (c != nextChar) {
                    compression.append(c);
                    compression.append(count);
                    count = 1;
                }
                else {
                    count += 1;
                }
            }


        }
        for (int i = 0; i < compression.length(); i++) {
            char c = compression.charAt(i);
            if (Character.isDigit(c) && c != '1') {
                return compression.toString();
            }
        }
        return input;

    }

    public static void main(String[] args) {

        String s1 = "aabcccccaaa";
        System.out.println(compressString(s1));
        String s2 = "abcdefghijk";
        System.out.println(compressString(s2));


    }
}
