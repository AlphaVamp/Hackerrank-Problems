import java.util.*;

public class miniMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = 5;
        //long was used coz it was mentioned in the problem statement
        long[] arr = new long[size];

        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }

        Arrays.sort(arr);
        
        long minSum=0, maxSum=0;

        for(int j=0;j<size-1;j++)
        {
            minSum+=arr[j];
        }

        for(int k=1;k<size;k++){
            maxSum+=arr[k];
        }

        System.out.println(minSum + " " + maxSum);

        sc.close();
    }
}
