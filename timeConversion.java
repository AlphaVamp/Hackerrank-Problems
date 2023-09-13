import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.util.Date;
import java.text.ParseException;

public class timeConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String time;//"07:45:44PM"
        //System.out.println("Enter the time: ");
        time = sc.nextLine();

        DateFormat df = new SimpleDateFormat("hh:mm:ssaa");
        DateFormat finalFormat = new SimpleDateFormat("HH:mm:ss");
        Date date = null;
        String finalDate = null;
        try{
             date = df.parse(time);
             finalDate = finalFormat.format(date);
             System.out.println(finalDate);    
        }catch(ParseException pe)
        {
            pe.printStackTrace();
        }
        sc.close();
    }
}