import java.util.Scanner;

public class MaxOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, max;

        System.out.print("Enter first number: ");
        a = sc.nextInt();

        System.out.print("Enter second number: ");
        b = sc.nextInt();

        max = Math.max(a, b);

        System.out.println("Maximum number is: " + max);

        sc.close();
    }
}