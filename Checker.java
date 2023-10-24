import java.util.Scanner;

public class DeMorgansLawChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of p (0/1): ");
        int p = scanner.nextInt();

        System.out.print("Enter the value of q (0/1): ");
        int q = scanner.nextInt();

        boolean leftSide = !(p == 1 && q == 1);
        boolean rightSide = (p == 0) || (q == 0);

        System.out.println("Left side of the equation: " + leftSide);
        System.out.println("Right side of the equation: " + rightSide);

        if (leftSide == rightSide) {
            System.out.println("Both sides of the equation are the same.");
        } else {
            System.out.println("Both sides of the equation are different.");
        }

        scanner.close();
    }
}