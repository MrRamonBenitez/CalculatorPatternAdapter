import java.util.Scanner;

import static java.lang.System.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        Ints calc = new IntsCalculator();

        out.println("Welcome to Calculator!");

        while (true) {
            out.print("""
                    We offer a choice of operations:
                    1. Addition
                    2. Multiplication
                    3. Exponentiation
                    4. Exit
                    """);
            out.print("Select operation type:\n" +
                    "-> ");
            String choiceType = scanner.nextLine();
            switch (choiceType) {
                case "1" -> {
                    out.print("Enter first operand:\n" +
                            "-> ");
                    int arg0 = Integer.parseInt(scanner.nextLine());
                    out.print("Enter second operand:\n" +
                            "-> ");
                    int arg1 = Integer.parseInt(scanner.nextLine());
                    out.println("Result: " + calc.sum(arg0, arg1));
                }
                case "2" -> {
                    out.print("Enter first operand:\n" +
                            "-> ");
                    int arg0 = Integer.parseInt(scanner.nextLine());
                    out.print("Enter second operand:\n" +
                            "-> ");
                    int arg1 = Integer.parseInt(scanner.nextLine());
                    out.println("Result: " + calc.mult(arg0, arg1));
                }
                case "3" -> {
                    out.print("Enter exponentiation argument:\n" +
                            "-> ");
                    int a = Integer.parseInt(scanner.nextLine());
                    out.print("Enter Enter degree:\n" +
                            "-> ");
                    int b = Integer.parseInt(scanner.nextLine());
                    out.println("Result: " + calc.pow(a, b));
                }
                case "4" -> {
                    return;
                }
            }
        }
    }
}


