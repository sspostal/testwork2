import java.util.Scanner;

public class ArraySr {
    public static void main(String[] args) {
        System.out.println("Введите размер массива");
        int size = readInput();
        double[] array = new double[size];
        for (int i = 0; i < size; i++) {
            array[i] = readInput();
        }
        System.out.println(Sum(array));
    }
        public static double Sum (double[] array) {
        double average = 0;
        if (array.length > 0) {
            double sum = 0;
            for (int j = 0; j < array.length; j++) {
                sum += array[j];
            }
            average = sum / array.length;
        }
        return average;
        }

    public static int readInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}