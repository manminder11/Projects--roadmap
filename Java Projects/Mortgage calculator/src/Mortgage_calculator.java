import java.sql.SQLOutput;
import java.util.Scanner;
public class Mortgage_calculator {
   public static void main(String[]args){





        Scanner scanner = new Scanner(System.in);

        System.out.println("Principal:");
       double principal_amount =  scanner.nextDouble();



       System.out.println("MontlyIntrestrate:");
        double AnnualIntrestrate = scanner.nextDouble();
        double MontlyIntrestrate = AnnualIntrestrate/100/12;

       System.out.println("period (Years):");
       int years  = scanner.nextInt();
       int total_pay = years/12;




        double numenator = MontlyIntrestrate * Math.pow(1+ MontlyIntrestrate , total_pay);
        double denominator = Math.pow(1+ MontlyIntrestrate , total_pay) - 1;
        double monthlypay = principal_amount * (numenator/denominator);


        // we calculate the mortgage here

       System.out.println(monthlypay);






    }
}
