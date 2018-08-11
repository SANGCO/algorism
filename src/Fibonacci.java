import java.util.Scanner;

public class Fibonacci {
    private static Integer[] intArray;

    public static void main(String[] args) {
        System.out.println("입력하슈");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        intArray = new Integer[input];
        for (int i = 0; i < input; i++) { // i <= input <- 배열이니껜 이라면 ArrayOutOfBoundsExcepiton
            System.out.println(Fibonacci(i));
        }
    }

    private static int Fibonacci(int numb) {
        if (numb <= 1) {
            return numb;
        } else if (intArray[numb] != null) {
            return intArray[numb];
        } else {
            intArray[numb] = Fibonacci(numb - 2) + Fibonacci(numb - 1);
            return intArray[numb];
        }
    }
}
