
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /// задание 1
        System.out.println("Задание 1");
        int sum = 0;
        sum = Arrays.stream(arr).sum();
            System.out.println("Сумма трат за месяц составила "+ sum + " рублей ");
        /// задание 2
        System.out.println("Задание 2");
        int maxCosts = -1;
        int minCoast = 200100;
        for (int j : arr) {
            if (j > maxCosts) {
                maxCosts = j;
            }
        }
        for (int current : arr) {
            if (current < minCoast) {
                minCoast = current;
            }

        }
        System.out.println("Минимальная сумма трат за день составила " + minCoast + " рублей. Максимальная сумма трат за день составила " + maxCosts + " рублей");
        /// задание 3
        System.out.println("Задание 3");
        double averageAmountSpent = 0;
        for (int i = 0; i < arr.length; i++) {
            averageAmountSpent = averageAmountSpent / arr.length;
            averageAmountSpent += arr[i];
        }

        System.out.println("Средняя сумма трат за месяц составила " + averageAmountSpent + " рублей");
        /// задание 4
        System.out.println("Задание 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i --) {
            System.out.print(reverseFullName[i]);
        }
    }
    static int[] arr = generateRandomArray();
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}