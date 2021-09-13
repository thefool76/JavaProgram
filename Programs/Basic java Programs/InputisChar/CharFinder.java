import java.util.Scanner;

public class CharFinder {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);

        char a = in.next().trim().charAt(0);

        if (a >= 'a' && a <= 'z') {
            System.out.println("LowerCase");
        }
        else {
            System.out.println("UpperCase");
        }
    
    }
}