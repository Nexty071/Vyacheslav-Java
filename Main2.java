import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите имя: ");
            String name = scanner.nextLine();
            
            if (name.equals("Вячеслав")) {
                System.out.println("Привет, Вячеслав");
            } else {
                System.out.println("Нет такого имени");
            }
        }
    }
}
