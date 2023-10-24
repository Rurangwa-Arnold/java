import java.util.Arrays;
import java.util.Scanner;

public class SkiJumpingStyleMarks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] marks = new int[5];
        
        System.out.println("Enter 5 style marks (0 to 20):");
        for (int i = 0; i < marks.length; i++) {
            marks[i] = scanner.nextInt();
        }
        
        Arrays.sort(marks); // Sort the marks in ascending order
        
        int sum = 0;
        for (int i = 1; i < marks.length - 1; i++) {
            sum += marks[i];
        }
        
        System.out.println("Style marks: " + sum);
    }
}