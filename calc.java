package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please put in your first number: ");
        double a = sc.nextFloat();

        System.out.println("Please Enter your second number: ");
        double b = sc.nextFloat();

        System.out.println("What would you like to do with these? ");
        String c = sc.next();
        double equation = 0;

        System.out.println("Your calculation is: ");
        if(c.equals("+")){

            equation = a + b;
            System.out.println(equation);
        }
        else if (c.equals("-")) {
            equation = a - b;
            System.out.println(equation);
        }
        else if (c.equals("*")) {

            equation = a * b;
            System.out.println(equation);

        }
        else if (c.equals("/")) {

            equation = a / b;
            System.out.println(equation);

        }
        else {

            System.out.println("Please try again");

        }

    }
}
