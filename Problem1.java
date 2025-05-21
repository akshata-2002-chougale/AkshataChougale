import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of a: ");
        double a = sc.nextDouble();
        System.out.print("Enter value of b: ");
        double b = sc.nextDouble();
        System.out.print("Enter operation (add, subtract, multiply, divide): ");
        String operation = sc.next();

        Calculator calc = new Calculator(a, b, operation);
        calc.calculate();

        sc.close();
    }

    static class Calculator {
        double a, b;
        String operation;

        Calculator(double a, double b, String operation) {
            this.a = a;
            this.b = b;
            this.operation = operation;
        }

        void calculate() {
            if (operation.equals("add")) {
                System.out.println("Result: " + (a + b));
            } else if (operation.equals("subtract")) {
                System.out.println("Result: " + (a - b));
            } else if (operation.equals("multiply")) {
                System.out.println("Result: " + (a * b));
            } else if (operation.equals("divide")) {
                if (b != 0) {
                    System.out.println("Result: " + (a / b));
                } else {
                    System.out.println("Error: divided by zero");
                }
            } else {
                System.out.println("Invalid operation");
            }
        }
    }
}
