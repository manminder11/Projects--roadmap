import java.sql.SQLOutput;
import java.util.Scanner;
public class Mortgage_calculator {
   public static void main(String[]args){





        Scanner scanner = new Scanner(System.in);
        int principal_amount =  scanner.nextInt();
        System.out.println("Principal:" + principal_amount);

        Scanner Annual_int_rate = new Scanner(System.in);
        double AnnualIntrestrate = Annual_int_rate.nextInt();
        AnnualIntrestrate = AnnualIntrestrate/12;
       AnnualIntrestrate = AnnualIntrestrate*AnnualIntrestrate;
       System.out.println("MontlyIntrestrate" + AnnualIntrestrate);


       Scanner time = new Scanner(System.in);
        int period =  time.nextInt();
        period = period/12; // montly
        System.out.println("Period (Years):" + period
        );



        Scanner total_payments = new Scanner(System.in);
        int total_no_of_payments = total_payments.nextInt();
        total_no_of_payments= total_no_of_payments* total_no_of_payments;
        total_no_of_payments = Math.multiplyExact(total_no_of_payments , 12);


        // we calculate the mortgage here

       System.out.println(principal_amount*(AnnualIntrestrate*(1+AnnualIntrestrate*total_no_of_payments/1+AnnualIntrestrate*total_no_of_payments-1)));





    }
}
