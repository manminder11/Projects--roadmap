import java.sql.SQLOutput;
import java.text.NumberFormat;
import java.util.Scanner;
public class Mortgage_calculator {
   public static void main(String[]args){





        Scanner scanner = new Scanner(System.in);
        int p =  scanner.nextInt();
        System.out.println("Principal:" + p);

        Scanner Annr = new Scanner(System.in);
        double g =  Annr.nextDouble();
        System.out.println("Annual Intrest Rate:" + g );


        Scanner periods = new Scanner(System.in);
        int pp =  periods.nextInt();
        pp = pp/12;
        System.out.println("Period (Years):" + pp
        );



        Scanner mort = new Scanner(System.in);
       double m = mort.nextDouble();
        System.out.println("Mortgage: $" + m);






    }
}
