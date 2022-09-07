import java.util.Scanner;
import static java.lang.Math.*;

public class BPIE11{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter radius: ");
        double radius = in.nextFloat();
        double perimeter = 2*PI*radius;
        double area =  PI * pow(radius, 2);
        System.out.println("Perimeter: " + perimeter + "\nArea: " + area);
    }
}

