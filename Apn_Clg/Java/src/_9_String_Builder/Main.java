package _9_String_Builder;

import java.util.*;

public class Main {
    public static void main(String[] arg){
        StringBuilder sb = new StringBuilder("Shreyash");

        //Char At a specific Index
        System.out.println("CHARACTER AT INDEX");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter to find index at character between 0 to " + sb.length() + " : ");
        int index = sc.nextInt();
        if(index <= sb.length() && index >= 0 ){
        System.out.printf("\nCharacter at index %d is : %c ", index, sb.charAt(index));
        } else {
            System.out.println("Invalid index " + index);
        }

        System.out.println("\n");
        //Character Insert at a Specific Index
        System.out.println("CHARACTER SWAP \n");
//        System.out.print("ENTER LOCATION : ");
//        index = sc.nextInt();
//        System.out.print("\nENTER CHARACTER TO ENTER : ");
//        String swap = sc.nextLine();
        sb.insert(5 , 'A');
        System.out.println(sb);

        //Character Delete
        System.out.println("\n");
        System.out.println("DELETE");
        sb.delete(2,3); // only delete 2
        System.out.println(sb);

        //Character APPEND
        System.out.println("\nSTRING APPEND");
        sb.append('h');
        System.out.println(sb);

        //String Reverse
        System.out.println("\nString Reverse");
        StringBuilder r = new StringBuilder("abcdefghij");
        System.out.println(r);
        r.reverse();
        System.out.println(r);


    }
}