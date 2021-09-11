import java.util.Scanner;

public class AggregatePercentage{

    public static void main(String[]args){
        Float sub1 , sub2 ,sub3 ,sub4 ,sub5 , tot ,ag , per ;
        

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your First Subject marks = ");
        sub1 = sc.nextFloat();
        System.out.println("Enter Your Second Subject marks = ");
        sub2 = sc.nextFloat();
        System.out.println("Enter Your Third Subject marks = ");
        sub3 = sc.nextFloat();
        System.out.println("Enter Your Forth Subject marks = ");
        sub4 = sc.nextFloat();
        System.out.println("Enter Your Fifth Subject marks = ");
        sub5 = sc.nextFloat();

        tot = sub1 + sub2 + sub3 + sub4 + sub5 ;

        ag = tot / 5 ;

        System.out.println("Your Aggregate marks are =" + " " + tot);

        per = ag / 500 * 100 ;

        System.out.println("Your Percentage is = " + " " + per);





    }

}