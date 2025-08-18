/*
Q14 Write a java code to check if string is palindrome.
*/

package Sunbeam;

import javax.swing.plaf.IconUIResource;
import java.util.*;

public class Q14{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        String word = sc.next();
        int count = 0;
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)== word.charAt(word.length()-i-1)){
                count++;
            } else {
                System.out.print("No Pallindrom");
                return;
            }
        }
        if (count == word.length()){
            System.out.printf("%s is a Pallindrom",  word);
        }

    }
}