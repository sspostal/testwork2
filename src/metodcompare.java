import java.util.Scanner;

public class metodcompare {
    public static void main(String[] args) {
        int num1 = readInput();
        int num2 = readInput();
        compareNum(num1, num2);
    }
    public static void compareNum(int num1, int num2) {
        if (num1 > num2) {
            System.out.println("Первое число больше второго.");
        } else if (num1 < num2) {
            System.out.println("Второе число больше первого.");
        } else {
            System.out.println("Оба числа равны.");
        }
        }

    public static int readInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}

