import java.util.Scanner;


public class EvenOrOdd {

    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your number");
        int a = input.nextInt();

        if (a % 2==0) {
            System.out.println(a + " is Even ");
        }

        else if (a % 2 == 1) {
            System.out.println(a + " is Odd");

        } else {
            System.out.println("Entered Number is invalid");
        }






    
    }
    
}
