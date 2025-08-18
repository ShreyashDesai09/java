/*
Q3. Write a program to calculate Fibonacci Series up to n numbers
*/

package Sunbeam;

import java.util.*;

public class Q3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER NUMBER : ");
        int no = sc.nextInt();

        int first = 0, second = 1;

        System.out.println("\nFibonacci Series up to " + no + " terms:");

        for(int i = 1; i <= no; i++) {
            System.out.print(first + "\t");
            int next = first + second;
            first = second;
            second = next;
        }
    }
}
