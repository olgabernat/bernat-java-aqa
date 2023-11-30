import java.util.Scanner;

public class NameAnalysis {
    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Пожалуйста, введите имя.");
        String name = scanner.nextLine();

        if (name.equalsIgnoreCase("Вячеслав")) {
            System.out.println("Привет, Вячеслав");
        } else {
            System.out.println("Нет такого имени");
        }
        scanner.close();
    }
}
