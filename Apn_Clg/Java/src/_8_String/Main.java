package _8_String;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        //Concatenation

        String firstName = "Shreyash";
        String lastName = "Desai";
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);
        System.out.print("\n");

        //Length

        System.out.print("\n");
        System.out.println("Length of String : " + fullName.length());
        System.out.print("\n");

        //Character of each String

        System.out.print("\n");
        for(int i = 0; i < fullName.length() ; i++){
            System.out.println(fullName.charAt(i));
        }
        System.out.print("\n");


    }
}