import java.util.Scanner;

public class SubstrCompare {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        java.util.List<String>someStrs = new java.util.ArrayList<>();
        
        for(int i = 0;i < s.length()-k+1; i++)
        {
            someStrs.add(s.substring(i,i+k));
        }
        
        java.util.Collections.sort(someStrs);
        
        smallest = someStrs.get(0);

        largest = someStrs.get(someStrs.size()-1);        
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}

// import java.io.*;
// import java.util.*;
// import java.text.*;
// import java.math.*;
// import java.util.regex.*;

// public class Solution {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         String line = scanner.nextLine();
//         int k = scanner.nextInt();
//         String minSubstring = line.substring(0,k);
//         String maxSubstring = line.substring(0,k);
//         for (int i = 1; i < line.length()-k+1; i++) {
//             String sub = line.substring(i,i+k);
//             if (sub.compareTo(minSubstring) < 0) {
//                 minSubstring = sub;
//             }
//             if (sub.compareTo(maxSubstring) > 0) {
//                 maxSubstring = sub;
//             }
//         }
//         System.out.println(minSubstring);
//         System.out.println(maxSubstring);
//     }
// }