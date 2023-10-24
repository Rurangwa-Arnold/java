import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number (x): ");
        int x = scanner.nextInt();
        int sum = 0;
        int number = 1;
        do {
            sum += number;
            number++;
        } while (number <= x);
        System.out.println("Sum of integers from 1 to " + x + " is: " + sum);
    }
}