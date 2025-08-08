package _6_Array;

import java.util.*;

public class Main{
    public static void main(String[] args){
        //METHOD 1 - Manual Input
//      int marks[] = new int[3];
//      marks[0] = 1;
//      marks[1] = 2;
//      marks[2] = 3;
//      System.out.println(marks[0]);
//      System.out.println(marks[1]);
//      System.out.println(marks[2]);

        //METHOD 2 - Manual Input O/P by for loop

//        int marks[] = {95,96,97};
//        for(int i = 0; i < marks.length; i++){
//            System.out.println(marks[i]);
//        }

        //METHOD 3 - User I/P Loop O/P
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];

        for(int i=0;i<numbers.length;i++){
            System.out.printf("Enter at %d : " , i);
            numbers[i] = sc.nextInt();
        }

        System.out.println("\nArray is :- ");
        for(int i = 0 ; i <numbers.length;i++){
            System.out.println(numbers[i]);
        }




    }
}