/*
Q4 Write a program to calculate the grade of a student. There are five
subjects. Marks in each subject are entered from keyboard. Assign grade
based on the following rule:

Total Marks >= 90 Grade: Ex
90 > Total Marks >= 80 Grade: A
80 > Total Marks >= 70 Grade: B
70 > Total Marks >= 60 Grade: C
60 > Total Marks Grade: F

*/

package Sunbeam;

import java.sql.SQLOutput;
import java.util.*;

public class Q4{
    public static void main(String[] args){
        System.out.println("GRADE CALCULATOR");
        System.out.println("Enter Grades");
        Scanner sc = new Scanner(System.in);
        int total = 0;
        for(int i = 0 ; i < 5 ; i++){
            System.out.printf("Enter Marks of %d : ",i + 1);
            int marks = sc.nextInt();
            System.out.print("\n");
            total = total + marks;
        }
        System.out.println("Total Marks : " + total);
        int average = total/5;
        System.out.println("Average : " + average);
        if (total > 500 || total < 0){
            System.out.println("*****ERROR***** \nEnter Marks Correctly");
        }else if(average >= 90 && average <= 100){
            System.out.print("Grade : Ex");
        }else if(90 > average && average >= 80){
            System.out.print("Grade : A");
        }else if(80 > average && average >= 70){
            System.out.print("Grade : B");
        }else if(70 > average && average >= 60){
            System.out.print("Grade : C");
        }else if(60 > average){
            System.out.print("Grade : F");;
        }
    }
}