package com.rfa;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // we are telling the Scanner to read the input/data from console/cmd
        boolean flag = true;

        while (flag) {
            // write your code here
            int num = 0;
            String choice = "";

            System.out.print("Number: ");
            num = scanner.nextInt();

            if (num % 3 == 0 && num % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (num % 5 == 0) {
                System.out.println("Fizz");
            } else if (num % 3 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(num);
            }

            System.out.println("Do You want to try again (yes or no): ");
            choice = scanner.next().trim(); // this is going to read the whole line.

            choice = choice.toLowerCase();

            switch (choice){
                case "yes":
                    break;
                case "no":
                    flag = false;
                    System.out.print("Have a good day!!");
                    break;

                case "y":
                    break;

                case "n":
                    flag = false;
                    System.out.print("Have a good day!!");
                    break;

                default:
                    System.out.println("You're input is wrong!!");
                    // no need to insert the break here as after this statement the java is gonna come out of the switch.
            }

        }
    }
}
