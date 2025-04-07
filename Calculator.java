public class Calculator {
    public int add(int a, int b) {
        System.out.println("Adding two integers:");
        return a + b;
    }

    public double add(double a, double b) {
        System.out.println("Adding two doubles:");
        return a + b;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        int sumInt = calc.add(5, 10);
        System.out.println("Sum of integers: " + sumInt);

        double sumDouble = calc.add(3.5, 2.7);
        System.out.println("Sum of doubles: " + sumDouble);
    }
}