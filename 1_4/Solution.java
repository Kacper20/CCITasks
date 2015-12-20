/*

    Write a method to replace all spaces in string with '%20'. You may assume that the string has sufficient space at the end
    of the string to hold additional characters, and we're given true length of the string



 */

public class Solution {
    public static void transform(char[] array, int trueLength) {
        int len = array.length;

        //If there are no space occurences, immediately return
        if (len == trueLength || len == 0) { return; }


        //We could edit string backwards ie. iterate from j = trueLength - 1, and write characters
        int j = array.length - 1;
        for (int i = trueLength - 1; i >= 0; i--) {
            char element = array[i];
            if (element == ' ') {
                array[j - 2] = '%';
                array[j - 1] = '2';
                array[j] = '0';
                j -= 3;
            }
            else {
                //write to the j position, and change it
                array[j--] = element;
            }

        }
        System.out.println(array);




    }


    public static void main(String[] args) {

        String s = "Mr John Smith    ";
        char[] arr = s.toCharArray();
        transform(arr, 13);

    }
}
