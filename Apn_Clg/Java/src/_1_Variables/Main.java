package _1_Variables;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //O/P
        String name = "Shreyash";
        System.out.printf("Hi My Name Is %s \n", name);
        System.out.print("System.out.print(); with \\n\n");
        System.out.println("System.out.println();");

        // VARIABLES

        int a = 10;
        int b = 20;
        int sum = a + b;
        System.out.println(sum);

        // INPUT

        Scanner sc = new Scanner(System.in);
        String number = sc.next(); //take a single word
        System.out.println("Number is " + number);
        String fullName = sc.nextLine(); //Take all String not just a single word (sc.next();)
        System.out.println("Full Name is " + fullName);
    }
}
