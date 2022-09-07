import java.util.Scanner;

public class BPIE13{
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        double width, length, area, perimeter;

        System.out.print("Enter width: ");
        width = in.nextDouble();

        System.out.print("Enter length: ");
        length = in.nextDouble();

        area = width*length;
        perimeter = 2*(width+length);
        System.out.print("Area: " + area + "\nPerimeter: " + perimeter);

    }
}