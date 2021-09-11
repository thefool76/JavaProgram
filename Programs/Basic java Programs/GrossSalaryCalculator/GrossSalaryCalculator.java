import java.util.Scanner;

public class GrossSalaryCalculator {

    public static void main(String[]args){

        Scanner in = new Scanner(System.in);

        Long bs , dr , hr , gs ;

        System.out.println("Enter the basic salary = ");
        bs = in.nextLong();

        dr = (bs * 40 ) / 100 ;
        hr = (bs * 20 ) / 100 ;

        gs = (bs + dr + hr );

        System.out.println("The Gross Salary is =" + gs );
        


    

    

        



    

    }
}
