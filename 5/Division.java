import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        int a = scanner.nextInt();
        System.out.print("Enter the value of b: ");
        int b = scanner.nextInt();

        try {
            if (b == 0) {
                throw new ArithmeticException("Division by zero is not allowed");
            } else {
                int result = a / b;
                System.out.println("Result of a/b: " + result);
            }
        } catch (ArithmeticException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
