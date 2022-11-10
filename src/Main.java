public class Main {

    public static void main(String[] args) {
        int[] weight = {90, 91, 93, 92, 85, 87, 88, 89, 0, 0, 0, 0};
        int[] weightCopy = {90, 91, 93, 92, 85, 87, 88, 89, 0, 0, 0, 0};
        int januaryWeight = weight[0];
        System.out.println(januaryWeight);
        System.out.println(weight[0]);
        System.out.println(weight[4]);
        int january = 0;
        System.out.println(weight[january]);
        for (int i = 0; i < weight.length; i++) {
            System.out.println(weight[i]);

        }
        boolean arraysAreEqual = true;
        arraysAreEqual = weight.length == weightCopy.length;
        if (arraysAreEqual) {
            for (int i = 0; i < weight.length; i++) {
                if (weight[i] != weightCopy[i]) {
                    arraysAreEqual = false;
                }
            }
        }
        if (arraysAreEqual) {
            System.out.println("Массивы одинаковы");
        } else {
            System.out.println("Массивы разные");
        }
        int maxWeight = -1;
        for (final int current : weight) {
            if (current > maxWeight) {
                maxWeight = current;
            }
        }
        System.out.println(maxWeight);
        for (int i = 0; i < weight.length - 1 && weight[i + 1] != 0; i++) {
            System.out.println(weight[i + 1] - weight[i]);
        }
    }
}