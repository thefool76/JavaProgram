import java.util.Scanner;

public class DistanceCalculator {
    public static void main(String[]args){
        
        Long m , cm , ft , in ,km ;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the distance between 2 cities in KM = ");
        km = sc.nextLong();

        cm = (km * 100000);
        ft = (km * 3281);
        in = (km * 39370);
        m  = (km * 1000);

        System.out.println("Distance in Centimeter is" + " "+ cm);
        System.out.println("Distance in Feet is" +  " "+ ft);
        System.out.println("Distance in Inches is" + " "+in);
        System.out.println("Distance in Meter is" +" "+m);

    
    }
}
