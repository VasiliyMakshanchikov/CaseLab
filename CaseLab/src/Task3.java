import java.util.Scanner;

/**
 * Написать на Java метод, проверяющий является ли строка палиндромом.
 * @author Василий
 * @version 1.0
 */
public class Task3 {

    
    public static boolean isPalindrome(String str){
        str = str.replaceAll("\\W", "");
        StringBuilder sb = new StringBuilder(str);
        sb = sb.reverse();
        return str.equalsIgnoreCase(sb.toString());
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        System.out.println(isPalindrome(str));
    }
}
