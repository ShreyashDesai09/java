package _3_Loops;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //LOOPS
        //FOR LOOP

        //for(initialization;condition;updation);
        System.out.println("FOR LOOP");
        Scanner sc = new Scanner(System.in);
        System.out.printf("ENTER NUMBER: ");
        int num = sc.nextInt();
        for(int i = 1; i <= num ; i++){
            System.out.println(i);
        }

        //WHILE LOOP
        System.out.println("\nWHILE LOOP\n");
        int z = 1;
        while(z <= 7){
            System.out.println(z);
            z++;
        }

        //DO WHILE LOOP
        System.out.println("\nDO WHILE LOOP\n");
        int x = 0;
        do{
            System.out.println(x);
            x++;
        }while(x < 3);
    }
}
