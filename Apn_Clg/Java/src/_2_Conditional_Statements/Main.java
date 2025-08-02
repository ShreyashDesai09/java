package _2_Conditional_Statements;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //IF ELSE
        System.out.println("IF ELSE CONDITION");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = sc.nextInt();
        System.out.println("Enter b: ");
        int b = sc.nextInt();
        if (a == b) {
            System.out.println("a == b");
        } else {
            if(a>b){
                System.out.println("a > b");
            } else{
                System.out.println("a < b");
            }
        }
        System.out.println("SWITCH CONDITION\nEnter \"1\" or \"2\" ");
        int button = sc.nextInt();
        switch (button) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("two");
                break;
            default:
                System.out.println("No Button Pressed");

        }
    }
}
