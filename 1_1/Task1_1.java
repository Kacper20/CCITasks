import java.util.Scanner;

/**
 * Created by kacper on 12.04.15.
 */

/* A task is:

1.1 Implement an algorithm to determine if a string has all unique characters What if you can not use additional data structures?

 */
public class Task1_1 {
    //We're saying that user is using only ASCII 256  characters.
    public static void main(String[] args) {
        boolean isCharInString[] = new boolean[256];
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter a string...");
        String stringToCheck = userInput.nextLine();
        boolean isUnique = true;
        for (int i = 0; i < stringToCheck.length(); i++) {
            int numericCharValue = Character.getNumericValue(stringToCheck.charAt(i));
            if (isCharInString[numericCharValue] == true) isUnique = false;
            isCharInString[numericCharValue] = true;
        }
        String answerOperator = isUnique == true ? "IS UNIQUE" : "IS NOT UNIQUE";
        System.out.println(stringToCheck + " " + answerOperator);


    }
}
