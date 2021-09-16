import java.util.Scanner;


public class Trinagle {
    public static void main (String[]args){
        Scanner in = new Scanner(System.in);

        float l = in.nextFloat();
        float b = in.nextFloat();

        float  area;
        area =   l * b / 2;

        System.out.println("The area of Trinagle is " + area);

    }
}
