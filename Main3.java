public class Main3 {
    public static void main(String[] args) {
        int[] array = {1, 3, 5, 6, 9, 10, 12, 15};
        
        System.out.println("Элементы массива, кратные 3:");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 3 == 0) {
                System.out.println(array[i]);
            }
        }
    }
}
