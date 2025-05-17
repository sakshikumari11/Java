import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1, num2;
        char operator;

        System.out.print("Enter first number: ");
        num1 = sc.nextDouble();

        System.out.print("Enter operator (+, -, *, /, %): ");
        operator = sc.next().charAt(0);

        System.out.print("Enter second number: ");
        num2 = sc.nextDouble();

        switch (operator) {
            case '+':
                System.out.println("Result: " + (num1 + num2));
                break;
            case '-':
                System.out.println("Result: " + (num1 - num2));
                break;
            case '*':
                System.out.println("Result: " + (num1 * num2));
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Error: Division by zero not allowed");
                } else {
                    System.out.println("Result: " + (num1 / num2));
                }
                break;
            case '%':
                if (num2 == 0) {
                    System.out.println("Error: Division by zero not allowed");
                } else {
                    System.out.println("Result: " + (num1 % num2));
                }
                break;
            default:
                System.out.println("Invalid operation!");
        }

        sc.close();
    }
}
