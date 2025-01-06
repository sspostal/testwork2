import java.util.Scanner;

public class umnozhenie {
    public static void main(String[] args) {
        String num1 = readInput();
        String num2 = num1.replace("\"", "");
        System.out.println(multiplicat(num2));
    }
        public static String multiplicat(String num2) {

            String result = "";
            String[] data = num2.split(" ");
            String a = data[0];
            int multiplier = Integer.parseInt(data[1]);
            for (int i = 0; i < multiplier; i++) {
                result = result + a;
            }
            return result;
        }


    public static String readInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}

