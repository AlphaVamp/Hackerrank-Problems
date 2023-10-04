import java.io.*;
import java.util.*;

public class StrToken {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        String[] newS = s.split("[^A-Za-z]");
        int strTokens =0;
        
        for(int i = 0;i<newS.length;i++)
        {
            if(newS[i].length()>0)
            {
                strTokens++;
            }
        }
        System.out.println(strTokens);
      
        for(int j=0;j<newS.length;j++)
        {
            if(newS[j].length()>0)
            {
                System.out.println(newS[j]);
            }
        }
        {
            System.out.println();
        }
        scan.close();
    }
}

