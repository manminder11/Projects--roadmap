import java.util.Scanner;
public class Mortgage_calculator {
   public static void main(String[]args){





        Scanner scanner = new Scanner(System.in);
        int principal_amount =  scanner.nextInt();
        System.out.println("Principal:" + principal_amount);

        Scanner Annual_int_rate = new Scanner(System.in);
        double Annual_intrest_rate =  Annual_int_rate.nextDouble();
        Annual_intrest_rate = Annual_intrest_rate/12; // refering as months
        System.out.println("Annual Intrest Rate:" + Annual_intrest_rate);


        Scanner time = new Scanner(System.in);
        int period =  time.nextInt();
        period = period/12; // montly
        System.out.println("Period (Years):" + period
        );


        Scanner Montly_payment = new Scanner(System.in);
        double Monthly_payment = Montly_payment.nextDouble();






    }
}
