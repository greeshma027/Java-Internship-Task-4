/**
 * Modular Calculator Application
 * Demonstrates method overloading, exception handling,
 * pass-by-value, and reusable utility methods.
 */
public class ModularCalculator {

    public static void main(String[] args) {

        // Testing each method independently
        System.out.println("Addition (int): " + add(10, 5));
        System.out.println("Addition (double): " + add(10.5, 5.2));

        System.out.println("Subtraction: " + subtract(20, 8));
        System.out.println("Multiplication: " + multiply(4, 6));

        try {
            System.out.println("Division: " + divide(20, 4));
            System.out.println("Division by zero: " + divide(10, 0));
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Pass-by-value demonstration
        int value = 100;
        modifyValue(value);
        System.out.println("Value after method call: " + value);
    }

    /**
     * Adds two integers
     */
    static int add(int a, int b) {
        return a + b;
    }

    /**
     * Adds two double values (Method Overloading)
     */
    static double add(double a, double b) {
        return a + b;
    }

    /**
     * Subtracts two integers
     */
    static int subtract(int a, int b) {
        return a - b;
    }

    /**
     * Multiplies two integers
     */
    static int multiply(int a, int b) {
        return a * b;
    }

    /**
     * Divides two integers
     * Throws exception if divisor is zero
     */
    static int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }

    /**
     * Demonstrates pass-by-value in Java
     */
    static void modifyValue(int number) {
        number = number + 50;
        System.out.println("Inside method value: " + number);
    }
}
