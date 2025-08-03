package _4_Functions;

import java.util.*;

public class practise {

    public static int Factorial(int n){
        int factorial = 1;

        for(int i = n; i >= 1 ; i--){
            factorial = factorial * i;
        }
        return factorial;
    }

    public static int calculateSum(int a , int b){
        int sum = a + b;
        return sum;
    }

    public static int multiplication(int a , int b){
        int mul = a * b;
        return mul;
    }

    public static void main(String[] args) {

        // Addition of 2 Numbers
        System.out.println("\n***ADDITION***\n");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a : ");
        int a = sc.nextInt();
        System.out.print("Enter b : ");
        int b = sc.nextInt();
        int sum = calculateSum(a, b);
        System.out.println("Sum of a + b = " + sum);

        //Multiplication of 2 Numbers
        System.out.println("\n***MULTIPLICATION***\n");
        System.out.print("Enter x : ");
        int x = sc.nextInt();
        System.out.print("Enter y : ");
        int y = sc.nextInt();
        int mul = multiplication(a, y);
        System.out.println("Multiplication of x * y = " + mul);

        //Factorial of Number
        System.out.println("\n***FACTORIAL***\n");
        System.out.print("Enter Number : ");
        int num = sc.nextInt();
        if (num >= 1){
            int fact = Factorial(num);
            System.out.println("Factorial of " + num + " is : " + fact);
        } else {
            System.out.println("Don't Enter 0 or less than 0");
        }

    }
}