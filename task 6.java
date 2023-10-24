public class DescendingNumbers {
    public static void main(String[] args) {
        for (int number = 100; number >= -100; number--) {
            if (number % 2 == 0) {
                if (number % 3 == 0 || number % 8 == 0) {
                    continue;
                }
                System.out.println(number);
            }
        }
    }
}