import java.util.Scanner;

/**
 * Created by kacper on 12.04.15.
 */


/*
Same as 1 but without any additional buffer.
Now it is working in O(N)
 */
public class Task1_1Add {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter a string...");
        String stringToCheck = userInput.nextLine();
        boolean isUnique = true;
        for (int i = 0; i < stringToCheck.length(); i++) {
            char characterAtPlace = stringToCheck.charAt(i);
            if (containsElement(stringToCheck, characterAtPlace, i)) isUnique = false;
        }
        String answerOperator = isUnique == true ? "IS UNIQUE" : "IS NOT UNIQUE";
        System.out.println(stringToCheck + " " + answerOperator);
    }

    //Helper method
    public static boolean containsElement(String s, char c, int index) {

        for (int i = 0; i < s.length(); i ++) {
            if (s.charAt(i) == c && i != index) return true;
        }
        return false;
    }
}
