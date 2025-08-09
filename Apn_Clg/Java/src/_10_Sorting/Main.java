package _10_Sortings;

import java.util.*;

public class Main{
    public static void printArray(int arr[]){
        for( int i = 0 ; i < arr.length ; i++ ) {
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args){

        //Bubble Sort
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

        printArray(arr);




    }
}
