import java.io.*;
import java.util.*;

public class StringIntro {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        
        System.out.println(A.length() + B.length());
        int checked = A.compareTo(B);// B is compared with A, here if A is hello and B is java, then checked returns -2 since "j" is -2 distance away from "h"
        if(checked>0)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }//this condition is executed when the strings are same aswell i.e. java, java
        
        System.out.println(A.substring(0,1).toUpperCase() + A.substring(1) + " " + B.substring(0,1).toUpperCase() + B.substring(1));
        
        sc.close();
    }
}



