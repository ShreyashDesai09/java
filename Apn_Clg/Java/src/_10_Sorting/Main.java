package _10_Sortings;

import java.util.*;

public class Main{
    public static void printArray(int arr[]){
        for( int i = 0 ; i < arr.length ; i++ ) {
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args){

        //BUBBLE SORT
        int arr[] = {4,8,9,10,3};

        for(int i = 0 ; i < arr.length - 1 ; i++){
            for(int j = 0 ; j < arr.length - i - 1 ; j++) {
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("BUBBLE SORT");
        printArray(arr);

        int x[] = {3,1,6,13,25,7,10};
        //SELECTION SORT
        for(int a = 0 ; a < x.length - 1 ; a++) {
            int smallest = a;
            for(int b = a + 1 ; b < x.length ; b++) {
                if(x[smallest] > x[b]) {
                    smallest = b;
                }
            }
            int temp = x[smallest];
            x[smallest] = x[a];
            x[a] = temp;
        }
        System.out.println("\nSELECTION SORT");
        printArray(x);

    }
}
