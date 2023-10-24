import java.util.Scanner;

public class SumOfEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number (x): ");
        int x = scanner.nextInt();
        int sum = 0;
        for (int number = 0; number <= x; number++) {
            if (number % 2 == 0) {
                sum += number;
            }
        }
        System.out.println("Sum of even numbers from 0 to " + x + " is: " + sum);
        scanner.close();
    }
}