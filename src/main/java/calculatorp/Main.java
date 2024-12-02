package calculatorp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5.Exit");
            System.out.print("Select operation: ");
            int a = scanner.nextInt();



            switch (a) {
                case 1:
                    System.out.print("Enter number 1: ");
                    int first = scanner.nextInt();
                    System.out.print("Enter number 2: ");
                    int second = scanner.nextInt();
                    Calculator calculator = new Calculator(first, second);
                    System.out.println("Result of Addition: " + calculator.add());
                    break;

                case 2:
                    System.out.print("Enter number 1: ");
                    int firsts = scanner.nextInt();
                    System.out.print("Enter number 2: ");
                    int seconds = scanner.nextInt();
                    Calculator calculator1 = new Calculator(firsts, seconds);
                    System.out.println("Result of Subtraction: " + calculator1.subtract());
                    break;

                case 3:
                    System.out.print("Enter number 1: ");
                    int firstM = scanner.nextInt();
                    System.out.print("Enter number 2: ");
                    int secondM = scanner.nextInt();
                    Calculator calculator2 = new Calculator(firstM, secondM);
                    System.out.println("Result of Multiplication: " + calculator2.multiply());
                    break;

                case 4:
                    System.out.print("Enter number 1: ");
                    int firstd = scanner.nextInt();
                    System.out.print("Enter number 2: ");
                    int secondd = scanner.nextInt();
                    Calculator calculator3 = new Calculator(firstd, secondd);
                    System.out.println("Result of Division: " + calculator3.divide());
                    break;
                case 5:
                    return;

                default:
                    System.out.println("Invalid operation.");
                    break;
            }
        }
    }
}
