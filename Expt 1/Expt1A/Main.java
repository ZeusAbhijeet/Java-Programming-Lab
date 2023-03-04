package Expt1A;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = sc.nextDouble();

        double sum = num1 + num2;
        double diff = num1 - num2;
        double mul = num1 * num2;
        double div = num1 / num2;
        double pow = Math.pow(num1, num2);
        double sqrt1 = Math.sqrt(num1);
        double sqrt2 = Math.sqrt(num2);

        System.out.println();
        System.out.println(num1 + " + " + num2 + " = " + sum);
        System.out.println(num1 + " - " + num2 + " = " + diff);
        System.out.println(num1 + " * " + num2 + " = " + mul);
        System.out.println(num1 + " / " + num2 + " = " + div);
        System.out.println(num1 + " ^ " + num2 + " = " + pow);
        System.out.println("sqrt of " + num1 + " = " + sqrt1);
        System.out.println("sqrt of " + num2 + " = " + sqrt2);

        sc.close();
    }
}
