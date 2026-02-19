import java.util.Scanner;

public class FactorialWhileLoop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a non-negative integer: ");
        int N = scanner.nextInt();

        long factorial = 1;
        int i = 1;

        while (i <= N) {
            factorial *= i;
            i++;
        }

        System.out.println("Factorial of " + N + " is: " + factorial);

        scanner.close();
    }
}
