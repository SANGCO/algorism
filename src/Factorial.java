import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("입력하슈");
        Scanner scanner = new Scanner(System.in);
        System.out.println(factorial(scanner.nextInt()));
    }

    private static int factorial(int input) {
        if (input <= 1) {
            return input;
        } else {
            return factorial(input - 1) * input;
        }
    }
}
