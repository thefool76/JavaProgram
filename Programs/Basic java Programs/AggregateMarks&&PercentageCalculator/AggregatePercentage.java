import java.util.Scanner;

public class AggregatePercentage{

    public static void main(String[]args){
        int sub1 , sub2 ,sub3 ,sub4 ,sub5 , sub6 ,tot ,ag;
        double  per ;
        

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your First Subject marks = ");
        sub1 = sc.nextInt();
        System.out.println("Enter Your Second Subject marks = ");
        sub2 = sc.nextInt();
        System.out.println("Enter Your Third Subject marks = ");
        sub3 = sc.nextInt();
        System.out.println("Enter Your Forth Subject marks = ");
        sub4 = sc.nextInt();
        System.out.println("Enter Your Fifth Subject marks = ");
        sub5 = sc.nextInt();
        System.out.println("Enter Your Sixth Subject marks = ");
        sub6 = sc.nextInt();

        tot = sub1 + sub2 + sub3 + sub4 + sub5 + sub6;

        ag =  tot / 6 ;

        System.out.println("Your Aggregate marks are =" + " " + ag);

        per = ((double) (ag) / 600 ) * 100 ;

        System.out.println("Your Percentage is = " + " " + per);





    }

}