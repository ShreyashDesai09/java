package _3_Loops;

import java.util.*;

public class practise {
    public static void main(String[] args){
        //ADD FIRST n NATURAL NUMBERS
        System.out.print("ENTER NUMBERS : ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int sum = 0;
        for(int i = 0 ; i < number ; i++){
            sum = sum + i;
        }
        System.out.printf("SUM OF FIRST %d NUMBERS IS = %d" , number , sum);
    }
}