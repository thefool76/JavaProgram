import java.util.Scanner;

public class LargestNumber {
    public static void main (String[]args){
    Scanner input = new Scanner(System.in);

    System.out.println("Enter your first number");
    int a = input.nextInt();

    System.out.println("Enter your second number");
    int b = input.nextInt();

    if ( a > b) {
        System.out.println(a + "is bigger than " + b);
    }
    else if (a < b) {
        System.out.println(b + " is bigger than " + a);
    } else {
        System.out.println("Error 404");
    }
}


}
