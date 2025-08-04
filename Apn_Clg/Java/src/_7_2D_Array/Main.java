package _7_2D_Array;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows : ");
        int rows = sc.nextInt();
        System.out.print("Enter columns : ");
        int cols = sc.nextInt();

        System.out.print("Row : " + rows + " & Column : " + cols);

        int [][] x = new int[rows][cols];
        System.out.print("\n\nEnter Values\n");
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                System.out.printf("Enter x[%d][%d] : " , i , j );
                x[i][j] = sc.nextInt();
            }
        }

        System.out.print("\n\n2D Array is :-\n");
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                System.out.print(x[i][j] + " ");
            }
            System.out.print("\n");
        }

    }
}