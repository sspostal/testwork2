import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        String num1 = readInput();
        String num2 = num1.replace("\"", "");
        multiply(num2);
        DepositAccount dAccount1 = new DepositAccount(20);
        System.out.println(dAccount1.getId());

        DepositAccount dAccount2 = new DepositAccount("12345");
        System.out.println(dAccount2.getId());

    }
    public static void multiply(String num2) {
            String[] data = num2.split(" ");
            String a = data[0];
            String multiplier = data[1];
            int c = Integer.parseInt(multiplier);
            for (int i = 0; i < c; i++) {
                System.out.println(a);
            }
    }

    public static String readInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }



}
class Account<T> {
    private T _id;
    T getId(){return _id;}
    Account(T id)
    {
        _id = id;
    }
}

class DepositAccount<T> extends Account<T> {

    DepositAccount(T id){
        super(id);
    }
}
