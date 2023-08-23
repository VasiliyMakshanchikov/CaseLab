import java.util.Scanner;

/**
 * Есть 2 целочисленных переменных a и b, в которых хранятся определенные
 * значения. Нужно написать на Java метод, меняющий местами значения
 * переменных a и b, не используя 3й переменной.
 * @author Василий
 * @version 1.0
 */
public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.println("Before swap\ta: " + a + "\tb:" + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swap\ta: " + a + "\tb:" + b);
    }
}
