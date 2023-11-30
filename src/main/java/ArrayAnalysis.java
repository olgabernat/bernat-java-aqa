import java.util.Random;
import java.util.Scanner;

public class ArrayAnalysis {
    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Пожалуйста, введите размер массива.");
        int arraySize = scanner.nextInt();

        int[] array = new int[arraySize];
        Random random = new Random();

        System.out.println("Элементы массива кратные 3:");

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
            if (array[i] != 0 && array[i] % 3 == 0) {
                System.out.println(array[i]);
            }
        }
        scanner.close();
    }
}
