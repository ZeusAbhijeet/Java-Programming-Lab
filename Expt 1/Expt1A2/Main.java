package Expt1A2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = sc.nextDouble();

        int ch;

        do {
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Exponent");
            System.out.println("6. Square root of num1");
            System.out.println("7. Square root of num2");
            System.out.println("8. Exit");
            System.out.println();
            System.out.print("Enter your choice: ");

            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    double sum = num1 + num2;
                    System.out.println(num1 + " + " + num2 + " = " + sum);
                    break;
                case 2:
                    double diff = num1 - num2;
                    System.out.println(num1 + " - " + num2 + " = " + diff);
                    break;
                case 3:
                    double mul = num1 * num2;
                    System.out.println(num1 + " * " + num2 + " = " + mul);
                    break;
                case 4:
                    double div = num1 / num2;
                    System.out.println(num1 + " / " + num2 + " = " + div);
                    break;
                case 5:
                    double pow = Math.pow(num1, num2);
                    System.out.println(num1 + " ^ " + num2 + " = " + pow);
                    break;
                case 6:
                    double sqrt1 = Math.sqrt(num1);
                    System.out.println("sqrt of " + num1 + " = " + sqrt1);
                    break;
                case 7:
                    double sqrt2 = Math.sqrt(num2);
                    System.out.println("sqrt of " + num2 + " = " + sqrt2);
                    break;
                case 8:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Invalid Input");
            }

            System.out.println();

        }while(ch != 8);
    }
}
