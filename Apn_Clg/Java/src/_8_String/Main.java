package _8_String;

import java.util.*;

// Strings are Immutable: Cannot change or modify

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


        //Compare
        System.out.print("\n");
        String one = "abcd";
        String two = "efgh";
        if(one.compareTo(two) == 0){
            System.out.println("Strings Are Equal");
        } else {
            System.out.println("Strings Are Not Equal");
        }

        //Substring
        System.out.print("\n");
        String sentence = "My name is Shreyash";
        String sub = sentence.substring(11);
        String sub2 = sentence.substring(11,sentence.length());
        String sub3 = sentence.substring(0,10);

        System.out.println(sub);
        System.out.println(sub2);
        System.out.println(sub3);
    }
}