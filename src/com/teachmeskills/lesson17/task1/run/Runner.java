package com.teachmeskills.lesson17.task1.run;

import com.teachmeskills.lesson17.task1.functionalInterface.MyFuncInterface;

import java.util.Scanner;
import java.io.IOException;

public class Runner {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in); Scanner scanner1 = new Scanner(System.in);) {
        System.out.println("Enter 1 to reverse your string. Enter 2 to find the factorial of an integer.");

            int number = scanner.nextInt();
            switch (number) {

                case 1: {
                    System.out.println("Enter your string: ");
                    String str = scanner1.nextLine();
                    MyFuncInterface<String> myString;
                    myString = (s) -> {
                        return new StringBuilder(s).reverse().toString();
                    };
                    System.out.println("Reserves string: " + myString.doSomething(str));
                    break;
                }

                case 2: {
                    MyFuncInterface<Long> myFactorial;
                    System.out.println("Enter your int: ");
                    Long fc = scanner1.nextLong();
                    myFactorial = (fac) -> {
                        long result = 1;
                        for (long i = 1; i <= fac; i++) {
                            result *= i;
                        }
                        return result;
                    };
                    System.out.println("Factorial = " + myFactorial.doSomething(fc));
                    break;
                }
                default: {
                    System.out.println("Invalid character entered");
                }
                scanner.close();
            }

        } catch (Exception e) {
            System.out.println("Something went wrong. PLease try again.");
        }
    }
}


