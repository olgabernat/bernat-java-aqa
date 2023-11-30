import java.util.Scanner;

public class NumberAnalysis {
    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Пожалуйста, введите число.");
        double digit = scanner.nextDouble();

        if (digit > 7) {
            System.out.println("Привет");
        }
        scanner.close();
    }
}
