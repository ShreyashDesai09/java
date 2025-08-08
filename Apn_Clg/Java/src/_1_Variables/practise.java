import java.util.*;

public class practise {
    public static void main(String[] args) {
//1. Taking 2 integers and adding them
        System.out.println("SUM OF 2 NUMBERS");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum =  a + b;
        System.out.println("Sum of a + b = " + sum);


//2. Try to declare meaningful variables of each type. Eg - a variable named age should be a numeric type (int or float) not byte.


//3. Make a program that takes the radius of a circle as input, calculates its radius and area and prints it as output to the user.
        System.out.println("AREA OF CIRCLE");
        float radius = sc.nextFloat();
        float area = 4 * 3.14f * radius * radius;
        System.out.println("Area Of Circle = " + area);

//4. Make a program that prints the table of a number that is input by the user.
        System.out.println("TABLE OF A NUMBER\nEnter Number :- ");
        int tNumber = sc.nextInt();
        System.out.printf("%d * 1 = %d\n", tNumber, tNumber * 1);
        System.out.printf("%d * 3 = %d\n", tNumber, tNumber * 3);
        System.out.printf("%d * 4 = %d\n", tNumber, tNumber * 4);
        System.out.printf("%d * 2 = %d\n", tNumber, tNumber * 2);
        System.out.printf("%d * 5 = %d\n", tNumber, tNumber * 5);
        System.out.printf("%d * 6 = %d\n", tNumber, tNumber * 6);
        System.out.printf("%d * 7 = %d\n", tNumber, tNumber * 7);
        System.out.printf("%d * 8 = %d\n", tNumber, tNumber * 8);
        System.out.printf("%d * 9 = %d\n", tNumber, tNumber * 9);
        System.out.printf("%d * 10 = %d\n", tNumber, tNumber * 10);

    }
}