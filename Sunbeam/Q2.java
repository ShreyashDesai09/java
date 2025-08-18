/*
Q2. Write a program to calculate a Factorial of a number
*/

package Sunbeam;

import java.util.*;
import java.math.*;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nENTER NUMBER : ");
        int no = sc.nextInt();

        if (no < 0) {
            System.out.println("\nFactorial is not defined for negative numbers.");
        } else {
            BigInteger ans = factorial(no);
            System.out.println("\nFactorial of " + no + " is : " + ans);
        }
    }

    public static BigInteger factorial(int no) {
        BigInteger x = BigInteger.ONE;
        while (no != 0) {
            x = x.multiply(BigInteger.valueOf(no));
            no--;
        }
        return x;
    }
}
