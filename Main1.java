import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите число:");
            int number = scanner.nextInt();

            if (number > 7) {
                System.out.println("Привет");
            }
        }
    }
}