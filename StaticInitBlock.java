import java.io.*;
import java.util.*;

public class StaticInitBlock {
    static boolean flag = true;
    static int B, H;
    
    static{
        Scanner scanner = new Scanner(System.in);
        B = scanner.nextInt();
        scanner.nextLine();
        H = scanner.nextInt();
        
        if(B>0 && H>0){
            flag = true;    
        }
        else if(B<=0 || H<=0)
        {
            flag = false;
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
        scanner.close();
    }
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            if(flag){
                int area = B * H;
                System.out.println(area);
            }
    }
}
