import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers:");
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();

        int result = 0;

        System.out.println("Enter which operation you want?");
        char operation = sc.next().charAt(0);

        switch (operation) {
            case '+':
                result = number1 + number2;
                break;

            case '-':
                result = number1 - number2;
                break;

            case '*':
                result = number1 * number2;
                break;

            case '/':
                result = number1 / number2;
                break;

            case '%':
                result = number1 % number2;
                break;

            default:
                System.out.println("Invalid operator.");
        }

        System.out.println("The result is: " + result);
        sc.close();
    }
}
