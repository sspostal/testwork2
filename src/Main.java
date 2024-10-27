import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String line = scn.nextLine();
        Operation operation = OperationIdent.ident(line);

        if (operation == null) {
            throw new Exception("Некорректный знак действия");
        }

        String result = operation.execute();
        printInQuotes(result);
    }

    static void printInQuotes(String text) {
        if (text.length() > 40) {
            text = text.substring(0, 40) + "...";
        }
        System.out.println("\"" + text + "\"");
    }
}

interface Operation {
    String execute();
}

class Addition implements Operation {
    String a;
    String b;

    public Addition(String a, String b) {
        this.a = a.replace("\"", "");
        this.b = b.replace("\"", "");
    }

    public String execute() {
        if (a.length() >= 10) {
            return "Строка должна быть до 10 символов вкл";
        }
        return a + b;
    }
}

class Subtraction implements Operation {
    String a;
    String b;

    public Subtraction(String a, String b) {
        this.a = a.replace("\"", "");
        this.b = b.replace("\"", "");
    }

    public String execute() {
        if (a.length() >= 10) {
            return "Строка должна быть до 10 символов вкл";
        }
        int index = a.indexOf(b);
        if (index == -1) {
            return a;
        } else {
            String result = a.substring(0, index);
            result += a.substring(index + b.length());
            return result;
        }
    }
}

class Multiplication implements Operation {
    String a;
    int multiplier;

    public Multiplication(String a, String b) {
        this.a = a.replace("\"", "");
        this.multiplier = Integer.parseInt(b);
    }

    public String execute() {
        StringBuilder result = new StringBuilder();
        if (a.length() >= 10) {
            return "Строка должна быть до 10 символов вкл";
        }
        else if ((multiplier > 0 ) && (multiplier <= 10)) {
            for (int i = 0; i < multiplier; i++) {
                result.append(a);
            }
            return result.toString();
        }
        else return "Число должно быть от [1:10]";
    }
}

class Division implements Operation {
    String a;
    int divisor;

    public Division(String a, String b) {
        this.a = a.replace("\"", "");
        this.divisor = Integer.parseInt(b);
    }

    public String execute() {
        if (a.length() >= 10) {
            return "Строка должна быть до 10 символов вкл";
        }
        else if ((divisor > 0) && (divisor <= 10))  {
            int newLen = a.length() / divisor;
            return a.substring(0, newLen);
        }
        else return "Число должно быть от [1:10]";
    }
}

class OperationIdent {
    public static Operation ident(String line) {
        String[] data;
        if (line.contains(" + ")) {
            data = line.split(" \\+ ");
            return new Addition(data[0], data[1]);
        } else if (line.contains(" - ")) {
            data = line.split(" - ");
            return new Subtraction(data[0], data[1]);
        } else if (line.contains(" * ")) {
            data = line.split(" \\* ");
            return new Multiplication(data[0], data[1]);
        } else if (line.contains(" / ")) {
            data = line.split(" / ");
            return new Division(data[0], data[1]);
        } else {
            return null;
        }
    }
}