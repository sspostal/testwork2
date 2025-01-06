import java.util.Scanner;

public class metodSumma {
    public static void main(String[] args) {
        int num1 = readInput();
        int num2 = readInput();
        System.out.println(Sum(num1, num2));
    }
    public static int Sum(int num1, int num2) {
        return num1 + num2;
    }
    public static int readInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
